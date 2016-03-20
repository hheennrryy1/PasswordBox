package com.henry.service;

import java.util.List;

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
	
	public Boolean findUser(String userName, String userPassword) {
		Boolean flag = true;
		List<User> users = userDao.findUser(userName, userPassword);
		if(users.isEmpty()) {
			flag = false;
		}
		return flag;
	}
}
