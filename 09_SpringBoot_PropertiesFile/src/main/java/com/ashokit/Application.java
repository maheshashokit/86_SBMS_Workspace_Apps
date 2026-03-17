package com.ashokit;

import com.ashokit.beans.Customer;
import com.ashokit.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "employee.properties")
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//Requesting Employee bean object from Context
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		System.out.println("=================================");
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer);

	}

}
