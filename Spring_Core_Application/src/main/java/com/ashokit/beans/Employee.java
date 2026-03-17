package com.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String empId;

    private String empName;

    private String city;

    public Employee(){
        System.out.println("Employee Constructor");
    }
    public Employee(String empId, String empName, String city) {
        this.empId = empId;
        this.empName = empName;
        this.city = city;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

