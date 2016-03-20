package com.henry.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.henry.service.UserService;
@Controller
@RequestMapping("/user")
@SessionAttributes("userName")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/logIn", method=RequestMethod.POST)
	@ResponseBody
	public String logIn(@RequestParam("userName")String userName,
						@RequestParam("userPassword")String userPassword, 
						Map<String, Object> map, HttpSession session) {
		String status = "fail";
		boolean flag = userService.findUser(userName, userPassword);
		if(flag) {
			map.put("userName", userName);
			status = "success";
		}
		return status;
	}
}