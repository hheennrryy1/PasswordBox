package com.henry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.PasswordDao;
import com.henry.entity.Password;
import com.henry.entity.User;

@Service
public class PasswordService {
	@Autowired
	private PasswordDao passwordDao;
	
	public void savePassword(Password password) {
		passwordDao.save(password);
	}
	
	public List<Password> findPasswords(int userId) {
		return passwordDao.findPasswords(userId);
	}
}
