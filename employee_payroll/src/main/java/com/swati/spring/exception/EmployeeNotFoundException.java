package com.swati.spring.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(int id){
		super("Could not find employee : " +id);
	}
	
}
