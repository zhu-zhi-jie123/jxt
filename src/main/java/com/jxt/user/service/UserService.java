package com.jxt.user.service;

import com.jxt.utils.JxtResult;

public interface UserService {
	JxtResult login(String username,String password);
}
