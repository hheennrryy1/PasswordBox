package com.henry.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.henry.entity.Password;

@Repository
public class PasswordDao extends BaseDao<Password>{
	
	public List<Password> findPasswords(int userId, int beginIndex, int everyPage) {
		Object[] params = {userId};
		String hql = "from Password p where p.user.id = ?";
		return this.find(hql, params, beginIndex, everyPage);
	}
	
	public Long count(int userId) {
		Object[] params = {userId};
		String hql = "select count(*) from Password p where p.user.id = ?";
		return (long) this.count(hql, params);
	}
	
	public List<Password> findPasswordsByKeyword(String keyword, int userID) {
		Object[] params = {'%' + keyword + '%', '%' + keyword + '%', userID};
		String hql = "from Password p"
				+ " where (p.name like ? or p.remark like ?)"
				+ " and (p.user.id = ?)"; 
		return this.find(hql, params);
	}
}
