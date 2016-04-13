package com.henry.dao;

import org.springframework.stereotype.Repository;

import com.henry.entity.User;

@Repository
public class UserDao extends BaseDao<User> {
	
	public User getUser(String userName, String userPassword) {
		Object[] params = {userName, userPassword};
		return get("from User where userName = ? and userPassword = ?", params);
	}
	
	public User getUserByName(String userName) {
		Object[] params = {userName};
		return get("from User where userName = ? ", params);
	}

	public User getUserById(Integer id) {
		return get(User.class, id);
	}
}
