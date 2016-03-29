package com.henry.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.UserDao;
import com.henry.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void saveUser(User user) {
		userDao.save(user);
	}
	
	public User getUser(String userName, String userPassword) {
		return userDao.getUser(userName, userPassword);
	}
}
