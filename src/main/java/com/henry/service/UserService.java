package com.henry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public String findUser(String userName, String userPassword) {
		return userDao.findUser(userName, userPassword);
	}
}
