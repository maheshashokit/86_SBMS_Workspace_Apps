package com.ashokit.spring.controller;

import com.ashokit.spring.beans.Employee;
import com.ashokit.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {

    //Need services from EmployeeService
    @Autowired
    private EmployeeService employeeService;

    public void createNewEmployee(Employee employee){
        boolean newEmpStatus = employeeService.createBrandNewEmployee(employee);
        if(newEmpStatus){
            System.out.println("Employee onboarded successfully!!!!");
        }else{
            System.out.println("Employee onboarding Failed!!!!");
        }
    }

    public void createNewEmployees(List<Employee> empList){
        int brandNewEmployeesCount = employeeService.createBrandNewEmployees(empList);
        if(empList.size() == brandNewEmployeesCount){
            System.out.println("All Employees are onboarded...");
        }else{
            System.out.println("Some Employees Missed to Onboard....");
        }
    }
}
