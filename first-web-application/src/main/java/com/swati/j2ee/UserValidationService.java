package com.swati.j2ee;

public class UserValidationService{
	
	public boolean isValidUser(String name, String password){
	if(name.equals("Swati") && password.equals("123")) {
		return true;
	}
	return false;	
		
	}
}

