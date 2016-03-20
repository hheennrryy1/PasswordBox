package com.henry.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PasswordDao {
	@Autowired
	private SessionFactory sessionfFactory;
}
