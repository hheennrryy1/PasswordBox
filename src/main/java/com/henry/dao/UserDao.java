package com.henry.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.henry.entity.User;

@Repository
public class UserDao extends BaseDao<User> {
	
	public List<User> findUser(String userName, String userPassword) {
		Object[] params = {userName, userPassword};
		return find("from User u where userName = ? and userPassword = ?", params);
	}
	
}
