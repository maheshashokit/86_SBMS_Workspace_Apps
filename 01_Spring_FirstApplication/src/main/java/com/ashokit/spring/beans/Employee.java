package com.ashokit.spring.beans;

public class Employee {
	
	private String empId;
	
	private String name;
	
	private String designation;
	
	//Default Constructor
	public Employee() {
    	 System.out.println("Default Constructor.....");
	}
	
	 //Parameterized Constructor
	public Employee(String empId, String name, String designation) {
		System.out.println("Parameterized Constructor.....");
		this.empId = empId;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + "]";
	}
}
