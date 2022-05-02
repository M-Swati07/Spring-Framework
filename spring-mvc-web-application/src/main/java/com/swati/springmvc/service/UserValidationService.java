package com.swati.springmvc.service;

import org.springframework.stereotype.Service;

//new LoginService -> creates an instance of this UserValidationService and that bean is autowired in the
//LoginController class
//Component Scan(in todo-servlet.xml) finds @Service beans and searches according to the packages and wires them where they are to be @Autowired
@Service
public class UserValidationService{
	
	public boolean isValidUser(String name, String password){
	if(name.equals("Maeve") && password.equals("123")) {
		return true;
	}
	return false;	
		
	}
}

