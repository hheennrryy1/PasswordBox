package com.henry.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.henry.entity.User;
import com.henry.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/signIn", method=RequestMethod.POST)
	@ResponseBody
	public String signIn(@RequestParam("userName")String userName,
						@RequestParam("userPassword")String userPassword, HttpSession session) {
		String status = "fail";
		User user = userService.getUser(userName, userPassword);
		if(user!=null) {
			session.setAttribute("user", user);
			status = "success";
		}
		return status;
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/signOut")
	public String signOut(HttpSession session) {
		session.setAttribute("user", null);
		return "redirect:/index.html";
	}
	
	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	@ResponseBody
	public String signUp(User user) {
		logger.info(user.getUserName() + "|" + user.getUserPassword());
		userService.saveUser(user);
		return "success";
	}
}
