package com.ashokit.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "com.ashokit.employee")
public class Employee {

    private String id;
    private String name;
    private String location;
    private Integer salary;
    private List<String> emailIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("Employee.setId");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Employee.setName");
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        System.out.println("Employee.setLocation");
        this.location = location;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        System.out.println("Employee.setSalary");
        this.salary = salary;
    }

    public List<String> getEmailIds() {
        return emailIds;
    }

    public void setEmailIds(List<String> emailIds) {
        System.out.println("Employee.setEmailIds");
        this.emailIds = emailIds;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", emailIds=" + emailIds +
                '}';
    }
}