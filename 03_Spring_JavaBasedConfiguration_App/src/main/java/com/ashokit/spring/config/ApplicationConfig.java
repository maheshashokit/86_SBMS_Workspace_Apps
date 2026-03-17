package com.ashokit.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.ashokit.spring.beans.Address;
import com.ashokit.spring.beans.Employee;

@Configuration

//Inheriting the configuration class into main configuration class
@Import(value = {DatabaseConfig.class,EmailConfig.class})

//Inheriting the spring xml configuration file into configuration class
@ImportResource(value = "spring.xml")

//Recognizing the properties file by spring application
@PropertySource(value = "applicationConfig.properties")

@ComponentScan(basePackages = "com.ashokit")
public class ApplicationConfig {
	
	//Reading the data from properties file
	@Value("${employee.empId}")
	private String employeeId;
	
	@Value("${employee.empName}")
	private String employeeName;
	
	@Bean
	public Employee getEmployeeBean() {		
		Employee emp = new Employee();
		emp.setEmpId(employeeId);
		emp.setEmpName(employeeName);
		emp.setAddress(getAddressBean());
		return emp;		
	}	
	
	@Bean
	public Address getAddressBean() {		
		Address add= new Address();
		add.setDoorNo("1-2-3");
		add.setCity("Hyderabad");
		add.setStreetName("ABC");		
		return add;		
	}
	
	@Bean
	public String getMessage() {
		return "Welcome To AshokIT";
	}

}
