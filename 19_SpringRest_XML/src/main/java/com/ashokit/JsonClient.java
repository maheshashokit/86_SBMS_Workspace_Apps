package com.ashokit;

import com.ashokit.binding.Address;
import com.ashokit.binding.Employee;
import com.ashokit.binding.JobDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonClient {

    public static void main(String[] args) throws IOException {

        //Employee object
        Employee emp = new Employee();
        emp.setId(1122);
        emp.setName("Mahesh");
        emp.setDesignation("Software Engineer");
        emp.setWorkFromHome(true);
        emp.setDob(new java.util.Date());

        JobDetails jd = new JobDetails();
        jd.setJobId("3434");
        jd.setJobBand("A3");

        JobDetails jd1 = new JobDetails();
        jd1.setJobId("4567");
        jd1.setJobBand("A1");

        List<Address> addresses = new ArrayList<Address>();

        //Address object
        Address add = new Address();
        add.setAddressId(123);
        add.setAddressType("Permanent");
        add.setDoorNo("1-2-3");
        add.setStreet("XYZ");
        add.setCity("Hyderabad");

        Address add1 = new Address();
        add1.setAddressId(123);
        add1.setAddressType("Temporary");
        add1.setDoorNo("11-22-33");
        add1.setStreet("ABC");
        add1.setCity("Bangalore");

        addresses.add(add);
        addresses.add(add1);

        //setting the address
        emp.setAddress(addresses);
        emp.setJobDetails(jd);

        //Creating the object for ObjectMapper class
        ObjectMapper mapper = new ObjectMapper();

        //performing the serialization
        String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
        System.out.println(jsonData);

        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("employee.json"), emp);
        System.out.println("Completed Creating File");
    }
}
