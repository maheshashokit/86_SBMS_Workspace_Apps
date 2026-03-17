package com.ashokit.spring.dao;

import com.ashokit.spring.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean createEmployee(Employee emp) {
        // If update method returns +ve number indicates row inserted successfully otherwise will be failure of insertion
        int rowCount = jdbcTemplate.update("insert into ashokit_emps values(?,?,?)", emp.getEmpId(),emp.getEmpName(),emp.getEmailId());

        return rowCount > 0;
    }

    @Override
    public int createEmployees(List<Employee> employeeList) {
        //traditional approach
        int totalRowCount = 0;
        for(Employee emp : employeeList){
            int rowCount = jdbcTemplate.update("insert into ashokit_emps values(?,?,?)", emp.getEmpId(),emp.getEmpName(),emp.getEmailId());
            totalRowCount +=rowCount;
        }
        return totalRowCount;
    }
}
