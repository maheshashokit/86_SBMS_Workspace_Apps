package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${employeeId}")
    private String empId;

    @Value("${employeeName}")
    private String empName;

    @Value("${designation}")
    private String empDesignation;

    @Value("${salary}")
    private String empSalary;

    @Autowired
    private Address address;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        System.out.println("Employee.setEmpId");
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        System.out.println("Employee.setEmpName");
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        System.out.println("Employee.setEmpDesignation");
        this.empDesignation = empDesignation;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", address=" + address +
                '}';
    }
}
