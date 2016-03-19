package com.henry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.henry.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/logIn", method=RequestMethod.POST)
	@ResponseBody
	public String logIn(@RequestParam("userName")String userName,
						@RequestParam("userPassword")String userPassword) {
		return userService.findUser(userName, userPassword);
	}
}
