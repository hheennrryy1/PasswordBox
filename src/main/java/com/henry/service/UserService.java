package com.henry.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.UserDao;
import com.henry.entity.User;
import com.henry.utils.EncryptUtil;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void saveUser(User user) {
		String userPassword = EncryptUtil.encode(user.getUserPassword().getBytes());
		user.setUserPassword(userPassword);
		userDao.save(user);
	}
	
	public User getUser(String userName, String userPassword) {
		userPassword = EncryptUtil.encode(userPassword.getBytes());
		return userDao.getUser(userName, userPassword);
	}
}
