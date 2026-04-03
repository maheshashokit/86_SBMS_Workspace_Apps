package com.ashokit;

import com.ashokit.controller.CustomerController;
import com.ashokit.dao.BikeDao;
import com.ashokit.dao.EmployeeDao;
import com.ashokit.entity.Bike;
import com.ashokit.entity.Customer;
import com.ashokit.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		BikeDao bikeDao = context.getBean(BikeDao.class);
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

		//Preparing customer information
		Customer customer1 = new Customer("Mahesh","mahesh.ashokit@gmail.com","Hyderabad","123456789");
		Customer customer2 = new Customer("Suresh","Suresh.ashokit@gmail.com","Hyderabad","123456789");
		Customer customer3 = new Customer("Rajesh","Rajesh.ashokit@gmail.com","Hyderabad","123456789");
		Customer customer4 = new Customer("Naresh","Naresh.ashokit@gmail.com","Hyderabad","123456789");
		Customer customer5 = new Customer("Ramesh","Ramesh.ashokit@gmail.com","Hyderabad","123456789");

		//Obtaining controller bean object from context
		CustomerController customerController = context.getBean(CustomerController.class);

		//calling the controller method
	     customerController.createNewCustomer(customer1);
		 customerController.createNewCustomers(List.of(customer2,customer3,customer4,customer5));

		//customerController.fetchCustomerDetailsById(101);

		//customerController.fetchAllCustomerDetails();

		Employee e1 = new Employee();
		e1.setEmployeeName("Mahesh");

		Employee e2 = new Employee();
		e2.setEmployeeName("Rajesh");

		Iterable<Employee> savedEmployee = employeeDao.saveAll(Arrays.asList(e1,e2));
		savedEmployee.forEach(System.out::println);

		Bike b1 = new Bike();
		b1.setBikeName("Access");
		b1.setCost(100000);

		Bike b2 = new Bike();
		b2.setBikeName("Activa");
		b2.setCost(200000);

		Iterable<Bike> savedBikes = bikeDao.saveAll(Arrays.asList(b1,b2));
		savedBikes.forEach(System.out::println);
	}


}