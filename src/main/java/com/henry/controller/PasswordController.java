package com.henry.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.henry.entity.Password;
import com.henry.entity.User;
import com.henry.service.PasswordService;

@Controller
@RequestMapping("/user/password")
public class PasswordController {
	
	@Autowired
	private PasswordService passwordService;
	
	@RequestMapping("/input")
	public String input() {
		return "save";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String savePassword(Password password, HttpSession session) {
		User user = (User) session.getAttribute("user");
		password.setUser(user);
		passwordService.savePassword(password);
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getPasswords(ModelAndView mav, HttpSession session) {
		User user = (User) session.getAttribute("user");
		List<Password> passwords = passwordService.findPasswords(user.getId());
		mav.setViewName("show");
		mav.addObject("passwords", passwords);
		return mav;
	}
}
