package com.jxt.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jxt.user.service.UserService;
import com.jxt.utils.JxtResult;

/*
 * 用户Controller
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	/*
	 * 登录
	 */
	@RequestMapping("/user/login")
	@ResponseBody
	public JxtResult login(String username,String password) {
		JxtResult result = userService.login(username, password);
		return result;
	}
	
}



