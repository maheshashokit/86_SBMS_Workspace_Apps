package com.ashokit;

import com.ashokit.entity.Customer;
import com.ashokit.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		 CustomerService customerService = context.getBean(CustomerService.class);

		//saveAll the Customers Information
		//customerService.saveAllCustomers(getCustomersData());

		//PageSize=6, PageNo=0, TotalRecords=15, No of Pages=3(0 to 2),
		List<Customer> customers = customerService.getCustomerInfo(0, 6);

		//Displaying the page of customers information
		//customers.forEach(System.out::println);

		//customerService.getCustomerInfo();

		//customerName --- Entity Class FieldName
		System.out.println();
		//customerService.getAllCustomerInSortingOrder("asc", "customerName","customerId");

		customerService.getCustomerInfo();
	}

	public static List<Customer> getCustomersData(){

		Customer customer1 = new Customer("Mahesh","Hyderabad1");
		Customer customer2 = new Customer("Suresh","Hyderabad2");
		Customer customer3 = new Customer("Rajesh","Hyderabad3");
		Customer customer4 = new Customer("Ramesh","Hyderabad4");
		Customer customer5 = new Customer("Nagesh","Hyderabad5");
		Customer customer6 = new Customer("Yagnesh","Hyderabad6");
		Customer customer7 = new Customer("Ganesh","Hyderabad7");
		Customer customer8 = new Customer("Naresh","Hyderabad8");
		Customer customer9 = new Customer("Rameshwar","Hyderabad1");
		Customer customer10 = new Customer("Anil","Hyderabad10");
		Customer customer11 = new Customer("Avinash","Hyderabad11");
		Customer customer12 = new Customer("Smith","Hyderabad12");
		Customer customer13 = new Customer("John","Hyderabad13");
		Customer customer14 = new Customer("Mark","Hyderabad14");
		Customer customer15 = new Customer("Bhoopal","Hyderabad15");

		//Java9 Style for Creating Immutable Collection
		List<Customer> customers =
				List.of(customer1,customer2,customer3,customer4,customer5,
						customer6,customer7,customer8,customer9,customer10,
						customer11,customer12,customer13,customer14,customer15);


		return customers;
	}

}
