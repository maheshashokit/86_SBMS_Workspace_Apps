package com.ashokit;

import com.ashokit.binding.Employee;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonDeSerializerClient {
    public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

        ObjectMapper mapper = new ObjectMapper();

        Employee emp = mapper.readValue(new File("employee.json"),Employee.class);

        System.out.println(emp);
    }
}
