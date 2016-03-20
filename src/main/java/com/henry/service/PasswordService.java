package com.henry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.PasswordDao;
import com.henry.entity.Password;

@Service
public class PasswordService {
	@Autowired
	private PasswordDao passwordDao;
	
	public void save(Password password) {
		passwordDao.save(password);
	}
}
