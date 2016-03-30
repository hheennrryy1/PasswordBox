package com.henry.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.henry.entity.Password;
import com.henry.service.PasswordService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Spring.xml", "classpath:Spring-Hibernate.xml"})
public class TestPasswordService {
	
	@Autowired
	private PasswordService passwordService;
	
	@Ignore
	@Test
	public void testSave() {
		Password password = new Password();
		password.setName("name");
		passwordService.savePassword(password);
	}
	
	@Test
	public void testFind() {
		List<Password> passwords = passwordService.findPasswords(3);
		System.out.println(passwords.get(1).getName());
	}
}
