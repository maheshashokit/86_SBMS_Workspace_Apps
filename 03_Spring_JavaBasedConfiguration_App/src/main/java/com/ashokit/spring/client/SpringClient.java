package com.ashokit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.spring.beans.Address;
import com.ashokit.spring.beans.Demo;
import com.ashokit.spring.beans.Employee;
import com.ashokit.spring.beans.User;
import com.ashokit.spring.config.ApplicationConfig;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Creating the Spring Container object and passing ApplicationConfig class as parameter
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//Requesting the Spring Bean objects from spring container
		Employee emp = context.getBean(Employee.class);
		Address  add = context.getBean(Address.class);
		java.util.Date currentDate = context.getBean(java.util.Date.class);
		Demo demo = context.getBean(Demo.class);
		String st = context.getBean(String.class);
		User user = context.getBean(User.class);
		
		
		//calling the service method to display data of employee
		emp.displayEmployeeDetails();
		System.out.println();
		System.out.println(add.getAddressInfo());
		System.out.println(currentDate);
		System.out.println(demo);
		System.out.println(st);
		System.out.println(user);
	}
}