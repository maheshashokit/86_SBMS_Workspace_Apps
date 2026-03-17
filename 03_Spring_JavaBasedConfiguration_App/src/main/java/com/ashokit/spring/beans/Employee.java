package com.ashokit.spring.beans;

public class Employee {

	private String empId;
	private String empName;
	private Address address;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	//service method
	public void displayEmployeeDetails(){
		System.out.println(String.format("Employee ID %s,  Employee Name %s ", empId, empName));
		System.out.println(address.getAddressInfo());
	}
}
