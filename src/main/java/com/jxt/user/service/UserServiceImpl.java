package com.jxt.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxt.user.mapper.UserMapper;
import com.jxt.user.pojo.User;
import com.jxt.user.pojo.UserExample;
import com.jxt.user.pojo.UserExample.Criteria;
import com.jxt.utils.JxtResult;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	/*
	 * 用户登录(non-Javadoc)
	 * @see com.jxt.user.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public JxtResult login(String username, String password) {
		//设置查询条件
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		//执行查询
		List<User> userList = userMapper.selectByExample(example);
		if(userList==null || userList.size()!=1) {
			return JxtResult.build(500, "用户名或密码错误!");
		}
		return JxtResult.build(200, "登录成功!", userList.get(0));
	}

}







