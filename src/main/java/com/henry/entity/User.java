package com.henry.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	private int id;
	private String userName;
	private String userPassword;
	private Set<Password> passwords = new HashSet<>();
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", passwords="
				+ passwords + "]";
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String name) {
		this.userName = name;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@OneToMany(mappedBy="user")
	public Set<Password> getPasswords() {
		return passwords;
	}
	public void setPasswords(Set<Password> passwords) {
		this.passwords = passwords;
	}
}
