package com.henry.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.henry.entity.Password;

@Repository
public class PasswordDao extends BaseDao<Password>{
	
	public List<Password> findPasswords(int userId, int beginIndex, int everyPage) {
		Object[] params = {userId};
		return this.find("from Password p where p.user.id = ?", params, beginIndex, everyPage);
	}
	
	public Long count(int userId) {
		Object[] params = {userId};
		return (long) this.count("select count(*) from Password p where p.user.id = ?", params);
	}
}
