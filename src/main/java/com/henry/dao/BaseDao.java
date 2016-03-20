package com.henry.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public Serializable save(T t) {
		return this.getCurrentSession().save(t);
	}
	
	public void delete(T t) {
		this.getCurrentSession().delete(t);
	}
	
	public void update(T t) {
		this.getCurrentSession().update(t);
	}
	
	@SuppressWarnings("unchecked")
	public T get(Class<T> clazz, Serializable id) {
		return (T)this.getCurrentSession().get(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> find(String hql) {
		return this.getCurrentSession().createQuery(hql).list();
	}
	
	public List<T> find(String hql, Object[] params) {
		Query query = this.getCurrentSession().createQuery(hql);
		if(params!=null && params.length>0) {
			for(int i=0; i<params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		return query.list();
	}
}
