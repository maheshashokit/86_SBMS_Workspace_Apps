package com.ashokit.spring.dao;

import com.ashokit.spring.beans.Employee;

import java.util.List;

public interface EmployeeDao {

    public boolean createEmployee(Employee emp);

    public int createEmployees(List<Employee> employeeList);
}
