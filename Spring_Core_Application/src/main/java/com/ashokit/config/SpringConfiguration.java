package com.ashokit.config;


import com.ashokit.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages = "com.ashokit")
public class SpringConfiguration {

    /*@Bean
    public Employee getEmployeeObj(){
        Employee emp = new Employee("AIT123","Mahesh","Hyderabad");
        return emp;
    }*/

    @Bean
    public java.util.Date getDateObject(){
        return new java.util.Date();
    }
}
