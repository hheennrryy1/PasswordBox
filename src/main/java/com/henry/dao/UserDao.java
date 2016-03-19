package com.henry.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.henry.entity.User;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;	
	
	/*
	public void save() {
		User user = new User();
		user.setUserName("user1");
		Password password = new Password();
		password.setName("henry");
		password.setPassword("123123");
		password.setUser(user);
		
		user.getPasswords().add(password);
	
		Session session =sessionFactory.getCurrentSession();
		session.save(user);
		session.save(password);
	}
	*/
	
	@SuppressWarnings("unchecked")
	public boolean findUser(String userName, String userPassword) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User u where u.userName = ? and u.userPassword = ?");
		query.setString(0, userName);
		query.setString(1, userPassword);
		List<User> users = query.list();
		if(users.isEmpty()) {
			return false;
		}
		return true;
	}
}
