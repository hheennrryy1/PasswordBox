package com.henry.test;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.henry.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Spring.xml", "classpath:Spring-Hibernate.xml"})
public class TestUserService {
		private static final Logger logger = Logger.getLogger(TestUserService.class);
	 	@Autowired
	 	private UserService userService;
	 	
	 	@Test
	 	public void testSave() {
	 		logger.info("fdfd");
	 	}
}
