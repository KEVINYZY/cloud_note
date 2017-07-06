package org.bianqi.note.sso.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.bianqi.common.jedis.JedisClient;
import org.bianqi.common.utils.JsonUtils;
import org.bianqi.common.utils.NoteResult;
import org.bianqi.note.pojo.User;
import org.bianqi.note.sso.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 根据token获取用户的信息
 * @author Administrator
 *
 */
@Service
public class TokenServiceImpl implements TokenService{
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;
	
	@Override
	public NoteResult getUserByToken(String token) {
		String json = jedisClient.get("SESSION:"+token);
		if(StringUtils.isBlank(json)){
			return NoteResult.build(101, "过期session");
		}
		jedisClient.expire("SESSION:"+token, SESSION_EXPIRE);
		User user = JsonUtils.jsonToPojo(json, User.class);
		return NoteResult.ok(user);
	}

}
