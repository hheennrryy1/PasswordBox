package com.henry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/password")
public class PasswordController {
	@RequestMapping("/check")
	public String goCheck() {
		return "check";
	}
	
	@RequestMapping("/save")
	public String savePassword() {
		return "save";
	}
	
	
}
