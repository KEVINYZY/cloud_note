package org.bianqi.note.sso.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.bianqi.common.utils.NoteResult;
import org.bianqi.note.mapper.UserMapper;
import org.bianqi.note.pojo.User;
import org.bianqi.note.pojo.UserExample;
import org.bianqi.note.pojo.UserExample.Criteria;
import org.bianqi.note.sso.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * 注册
 * 
 * @author Administrator
 */
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public NoteResult checkData(String param, int type) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if (type == 1) {
			criteria.andUsernameEqualTo(param);
		} else if (type == 2) {
			criteria.andEmailEqualTo(param);
		}
		List<User> list = userMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return NoteResult.ok(false);
		}
		return NoteResult.ok(true);
	}

	@Override
	public NoteResult register(User user) {
		if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())
				|| StringUtils.isBlank(user.getEmail())) {
			return NoteResult.build(400, "数据不完整");
		}
		NoteResult result = checkData(user.getUsername(), 1);
		if(!(boolean)result.getData()){
			return NoteResult.build(400, "用户名存在");
		}
		result = checkData(user.getEmail(), 2);
		if(!(boolean)result.getData()){
			return NoteResult.build(400, "邮箱被占用");
		}
		user.setCreated(new Date());
		user.setUpdated(new Date());
		user.setUserId(UUID.randomUUID().toString());
		//这里暂时激活 邮件就不发送了
		user.setStatus(1);
		String pwd = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
		user.setPassword(pwd);
		userMapper.insert(user);
		return NoteResult.ok();
	}

}
