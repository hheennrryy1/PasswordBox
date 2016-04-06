package com.henry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.PasswordDao;
import com.henry.entity.Password;
import com.henry.utils.EncryptUtil;

@Service
public class PasswordService {
	@Autowired
	private PasswordDao passwordDao;
	public void savePassword(Password password) {
		String encodedPassword = EncryptUtil.encode(password.getPassword().getBytes());
		password.setPassword(encodedPassword);
		passwordDao.save(password);
	}
	
	public List<Password> findPasswords(int userId) {
		List<Password> passwords = passwordDao.findPasswords(userId);
		for(Password password : passwords) {
			String decodedPassword = EncryptUtil.decode(password.getPassword().getBytes());
			password.setPassword(decodedPassword);
		}
		return passwords;
	}
}
