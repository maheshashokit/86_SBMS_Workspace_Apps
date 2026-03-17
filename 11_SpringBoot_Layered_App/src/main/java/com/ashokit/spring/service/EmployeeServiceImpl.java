package com.ashokit.spring.service;

import com.ashokit.spring.beans.Employee;
import com.ashokit.spring.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    //needs services from EmployeeDao
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public boolean createBrandNewEmployee(Employee employee) {
        return employeeDao.createEmployee(employee);
    }

    @Override
    public int createBrandNewEmployees(List<Employee> employeeList) {
        return employeeDao.createEmployees(employeeList);
    }
}
