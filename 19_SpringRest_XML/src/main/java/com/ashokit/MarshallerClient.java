package com.ashokit;

import com.ashokit.binding.Customer;
import com.ashokit.binding.Order;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class MarshallerClient
{
    public static void main( String[] args ) throws JAXBException, IOException
    {
        //creating customer information
        Customer customer = new Customer(101,"Mahesh","Hyderabad");

        Order order = new Order(345,2500);
        Order order1 = new Order(645,3500);

        //Java Object is ready having data
        Customer c = new Customer(123,"Mahesh","Hyderabad",Arrays.asList(order,order1));

        //To perform marshalling/Un-marshalling required JAXBContext Object
        JAXBContext context = JAXBContext.newInstance(Customer.class);

        //Creating marshaller object
        Marshaller marshaller = context.createMarshaller();

        //formatting purpose
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //converting Java object into xml
        //marshaller.marshal(c,System.out);
        marshaller.marshal(c, Files.newOutputStream(Paths.get("customers.xml")));
    }
}