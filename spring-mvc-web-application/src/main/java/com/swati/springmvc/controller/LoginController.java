package com.swati.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swati.springmvc.service.UserValidationService;

@Controller
public class LoginController {
	
	
	//UserValidationService service = new UserValidationService();//not a good practice hence autowiring comes into picture
	@Autowired
	UserValidationService service;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody()	//adding this will make the dispatcher servlet to print the output Hello World to the browser
	public String showLoginPage() {
		//return "Hello World";
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(service.isValidUser(name, password)) {
			model.put("name", name);
			return "welcome";
		}else {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
	}
	
	/*@RequestMapping(value = "/login")	//mapping to the same path but a different view will give a runtime exception like there is already a bean method
	public String profile() {
		return "profile";
	}*/

}
