package com.ashokit;

import com.ashokit.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//Requesting the Spring bean from container
		Employee employee = context.getBean(Employee.class);
		System.out.println("employee = " + employee);

	}

}
