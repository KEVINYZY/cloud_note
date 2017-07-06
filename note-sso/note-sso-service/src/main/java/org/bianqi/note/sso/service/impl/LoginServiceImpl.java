package org.bianqi.note.sso.service.impl;

import java.util.List;
import java.util.UUID;

import org.bianqi.common.jedis.JedisClient;
import org.bianqi.common.utils.JsonUtils;
import org.bianqi.common.utils.NoteResult;
import org.bianqi.note.mapper.UserMapper;
import org.bianqi.note.pojo.User;
import org.bianqi.note.pojo.UserExample;
import org.bianqi.note.pojo.UserExample.Criteria;
import org.bianqi.note.sso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * 用户登录
 * 
 * @author Administrator
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private JedisClient jedisClient;

	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;

	@Override
	public NoteResult userLogin(String username, String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);

		List<User> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return NoteResult.build(400, "用户名或者密码错误！");
		}
		User user = list.get(0);
		if(!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())){
			return NoteResult.build(400, "用户名或者密码错误");
		}
		Integer status = user.getStatus();
		//status 1 激活 
		//       0或其他 没有激活
		if(!status.equals(1)){
			return NoteResult.build(400, "用户没有激活");
		}
		//随机生成token
		String token = UUID.randomUUID().toString();
		//不允许密码保存到redis中
		user.setPassword(null);
		jedisClient.set("SESSION:"+token,JsonUtils.objectToJson(user));
		//设置token的过期时间
		jedisClient.expire("SESSION:"+token,SESSION_EXPIRE);
		return NoteResult.ok(token);
	}
}
