package com.ashokit.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ashokit.spring.controller.EmployeeController;
import com.ashokit.spring.controller.StudentController;

@Component
public class User {

	
	@Autowired
	private EmployeeController empController;
	
	
	@Autowired
	private StudentController stdController;
	

	public void userService() {
		
	}
	
	
}
