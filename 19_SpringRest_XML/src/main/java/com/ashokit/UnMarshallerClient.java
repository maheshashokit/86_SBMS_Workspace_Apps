package com.ashokit;

import com.ashokit.binding.Customer;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class UnMarshallerClient {

    public static void main(String[] args) throws JAXBException {

        //create JaxBContext object
        JAXBContext context = JAXBContext.newInstance(Customer.class);

        //Creating Unmarshaller Object
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Customer customer =(Customer)unmarshaller.unmarshal(new File("customers.xml"));

        //Displaying the customer information
        System.out.println("Customer::::" + customer);
    }
}
