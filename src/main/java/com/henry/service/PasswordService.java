package com.henry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.PasswordDao;
import com.henry.entity.Page;
import com.henry.entity.Password;
import com.henry.utils.EncryptUtil;
import com.henry.utils.PageUtil;

@Service
public class PasswordService {
	
	@Autowired
	private PasswordDao passwordDao;
	
	public void savePassword(Password password) {
		String encodedPassword = EncryptUtil.encode(password.getPassword().getBytes());
		password.setPassword(encodedPassword);
		passwordDao.save(password);
	}
	
	@SuppressWarnings("unchecked")
	public Page<Password> findPasswords(int userId, int everyPage, int currentPage) {
		Long totalCount = passwordDao.count(userId);
		Page<Password> page = (Page<Password>) PageUtil.createPage(everyPage, totalCount, currentPage);
		
		List<Password> passwords = passwordDao.findPasswords(userId, page.getBeginIndex(), page.getEveryPage());
		
		for(Password password : passwords) {
			String decodedPassword = EncryptUtil.decode(password.getPassword().getBytes());
			password.setPassword(decodedPassword);
		}
		page.setItems(passwords);
		return page;
	}
	
	public void delete(int id) {
		Password password = (Password) passwordDao.load(Password.class, id);
		passwordDao.delete(password);
	}

	public Password getPassword(int id) {
		Password password = passwordDao.get(Password.class, id);
		String pwd = EncryptUtil.decode(password.getPassword().getBytes());
		password.setPassword(pwd);
		return password;
	}

	public void update(Password password) {
		passwordDao.update(password);
	}
}
