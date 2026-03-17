package com.ashokit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.spring.beans.User;
import com.ashokit.spring.controller.EmployeeController;
import com.ashokit.spring.controller.StudentController;
import com.ashokit.spring.dao.EmployeeDao;
import com.ashokit.spring.service.EmployeeService;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Activated the Spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Requesting the Spring Beans
		EmployeeController empController = context.getBean(EmployeeController.class);
		System.out.println(empController);
	
		EmployeeService empService = context.getBean(EmployeeService.class);
		System.out.println(empService);
		
		EmployeeDao empDao = context.getBean(EmployeeDao.class);
		System.out.println(empDao);
		
		StudentController stdController = context.getBean(StudentController.class);
		System.out.println(stdController);
		
		User user = context.getBean(User.class);
		System.out.println(user);
		
	}

}
