package com.ashokit.spring.util;

import com.ashokit.spring.beans.Employee;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeUtils {

    //Return the List<Employee> object
    public List<Employee> getAllEmployeeInfo(){
        List<Employee> empList = new ArrayList<Employee>();
        // try with resources - Java7 version
        try(
                FileReader fr  = new FileReader("src/main/resources/ashokit_employees.txt");
                //Reading the file data as line by line
                BufferedReader br = new BufferedReader(fr);
        ){
            //Need to define logic to read the data from file
            String currentRecord;
            while((currentRecord = br.readLine()) != null) {

                //getting the current line and spliting based on comma seperated value
                String[] employeeValues = currentRecord.split(",");

                //extract the employee values from each record
                Integer empId = Integer.valueOf(employeeValues[0]);
                String  empName = employeeValues[1];
                String  emailId = employeeValues[2];

                //adding current employee information into List object
                empList.add(new Employee(empId,empName,emailId));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        //returning the employeeList
        return empList;
    }

}
