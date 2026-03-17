package com.ashokit.spring.service;

import com.ashokit.spring.beans.Employee;

import java.util.List;

public interface EmployeeService {

    public boolean createBrandNewEmployee(Employee employee);

    public int createBrandNewEmployees(List<Employee> employeeList);
}
