package com.henry.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.henry.entity.Page;
import com.henry.entity.Password;
import com.henry.entity.User;
import com.henry.service.PasswordService;

@Controller
@RequestMapping("/user/password")
public class PasswordController {
	
	Logger logger = Logger.getLogger(PasswordController.class);
	
	@Autowired
	private PasswordService passwordService;
	
	@RequestMapping("/input")
	public String input() {
		return "save";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String save(Password password, HttpSession session) {
		User user = (User) session.getAttribute("user");
		password.setUser(user);
		passwordService.savePassword(password);
		return "home";
	}
	
	@RequestMapping("/list/{currentPage}")
	public ModelAndView list(ModelAndView mav, HttpSession session, 
									@PathVariable("currentPage")int currentPage) {
		User user = (User) session.getAttribute("user");
		Page<Password> page = passwordService.findPasswords(user.getId(), 3, currentPage);
		mav.setViewName("show");
		mav.addObject("page", page);
		return mav;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id")int id) {
		passwordService.delete(id);
		return "redirect:/user/password/list";
	}
}
