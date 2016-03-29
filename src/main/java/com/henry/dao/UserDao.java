package com.henry.dao;

import org.springframework.stereotype.Repository;

import com.henry.entity.User;

@Repository
public class UserDao extends BaseDao<User> {
	
	public User getUser(String userName, String userPassword) {
		Object[] params = {userName, userPassword};
		return get("from User u where userName = ? and userPassword = ?", params);
	}
	
}
