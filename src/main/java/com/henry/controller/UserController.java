package com.henry.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
			session.setMaxInactiveInterval(60*60); //an hour
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
	public String signUp(User user, HttpSession session) {
		
		String status = "fail";
		
		String code = (String)session.getAttribute("code");
		if(!user.getCode().equalsIgnoreCase(code)) {
			return "error";
		}
		
		if( userService.getUserByName(user.getUserName()) == null ) {
			userService.saveUser(user);
			status = "success";
		}
		
		return status;
	}
	
	@ModelAttribute
	public void getUser(@RequestParam(required=false) Integer id, Map<String, Object> map) {
		if(id!=null) {
			map.put("user", userService.getUserById(id));
			System.out.println(id);
		}
	}
	
	@RequestMapping("/input")
	public String inputInfo() {
		return "editInfo";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	@ResponseBody
	public String update(User user, HttpSession session) {
		
		logger.info(user.getUserName() + "|" + user.getId() + "|" + user.getUserPassword());
		
		String status = "fail";
		
		if( userService.getUserByName(user.getUserName()) == null) {
			userService.update(user);
			session.setAttribute("user", user);
			status = "success";
		}
		
		return status;
	}
	
	
}
