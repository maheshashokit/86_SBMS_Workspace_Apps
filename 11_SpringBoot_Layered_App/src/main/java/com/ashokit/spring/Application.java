package com.ashokit.spring;

import com.ashokit.spring.beans.Employee;
import com.ashokit.spring.controller.EmployeeController;
import com.ashokit.spring.util.EmployeeUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//obtaining the spring IOC container object
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		//preparing employee object to insert the record
		Employee emp1 = new Employee(555,"Suresh","suresh.ashokit@gmail.com");
		Employee emp2 = new Employee(666,"Rajesh","rajesh.ashokit@gmail.com");
		Employee emp3 = new Employee(777,"Naresh","naresh.ashokit@gmail.com");
		Employee emp4 = new Employee(888,"Kumar","kumar.ashokit@gmail.com");
		Employee emp5 = new Employee(999,"Dinesh","dinesh.ashokit@gmail.com");

		//Adding the above employees into list object using java9 feature
		List<Employee> employeeList = List.of(emp1,emp2,emp3,emp4,emp5);

		//Getting controller object from container
		EmployeeController controller = context.getBean(EmployeeController.class);
		
		//Getting EmployeeUtil Object from container
		EmployeeUtils empUtils = context.getBean(EmployeeUtils.class);

		//extract all employee information from employeeUtils class
		List<Employee> employeesList = empUtils.getAllEmployeeInfo();

		//calling the controller class to onboard the employee
		//controller.createNewEmployee(emp);
		controller.createNewEmployees(employeesList);

	}
}