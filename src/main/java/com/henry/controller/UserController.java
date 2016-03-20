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

import com.henry.entity.User;
import com.henry.service.UserService;
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/signIn", method=RequestMethod.POST)
	@ResponseBody
	public String signIn(@RequestParam("userName")String userName,
						@RequestParam("userPassword")String userPassword, 
						Map<String, Object> map, HttpSession session) {
		String status = "fail";
		User user = userService.findUser(userName, userPassword);
		if(user!=null) {
			map.put("user", user);
			status = "success";
		}
		return status;
	}
	
	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	public String signUp(User user) {
		userService.saveUser(user);
		return "redirect:/index.html";
	}
}
