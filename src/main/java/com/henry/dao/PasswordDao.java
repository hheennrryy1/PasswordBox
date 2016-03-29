package com.henry.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.henry.entity.Password;
import com.henry.entity.User;

@Repository
public class PasswordDao extends BaseDao<Password>{
	
	public List<Password> findPasswords(int userId) {
		Object[] params = {userId};
		return this.find("from Password p where p.user.id = ?", params);
	}
}
