package com.ashokit;

import com.ashokit.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.enities.Customer;
import com.ashokit.services.CustomerService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CustomerDao customerDao = context.getBean(CustomerDao.class);

		//Calling the finder method from CustomerDao Class
		System.out.println("****** Finder Methods Demo**********");
		List<Customer> allCustomers = customerDao.findByCustomerName("Smith");
		allCustomers.forEach(System.out::println);
		System.out.println("=============================================================");
		List<Customer> allHydCustomers = customerDao.findByCustomerLocation("Hyderabad1");
		allHydCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
		System.out.println("=============================================================");
		Page<Customer> pageOfCustomers = customerDao.findByCustomerLocation("Hyderabad1", PageRequest.of(0, 3));
		pageOfCustomers.getContent().forEach(System.out::println);
		System.out.println("=============================================================");
		List<Customer> sortedCustomers = customerDao.findByCustomerName("Smith", Sort.by(Sort.Direction.DESC, "customerName","customerLocation"));
		sortedCustomers.forEach(System.out::println);
		System.out.println();
		System.out.println("****** Custom Queries in SpringDataJPA**********");
		System.out.println("1 . Custom Query using ORM Technique");
		Iterable<Customer> allCustomersByCustomQuery = customerDao.getAllCustomersByCustomQuery();
		allCustomersByCustomQuery.forEach(System.out::println);
		System.out.println();
		System.out.println("2. Custom Query using native query technique");
		Iterable<Customer> allCustomersByNativeQuery = customerDao.getAllCustomersByNativeQuery();
		allCustomersByNativeQuery.forEach(System.out::println);
		System.out.println();
		System.out.println("3. Custom Query for selecting partial columns in table using native query");
		List<Object[]> allCustomerDetails = customerDao.getCustomerNameAndCustomerLocationByCustomQuery();
		allCustomerDetails.forEach(obj -> System.out.println(obj[0] +"---" + obj[1]));
		System.out.println();
		System.out.println("4. Custom Query for selecting partial columns in table using orm query");
		List<Object[]> allCustomerDet = customerDao.getCustomerNameAndCustomerLocationByHQLQuery();
		allCustomerDet.forEach(obj -> System.out.println(obj[0] +"---" + obj[1]));
		System.out.println();
		System.out.println("5. Named Parameter Query");
		List<Customer> hydCustomers = customerDao.getAllCustomersByLocation("Hyderabad1");
		hydCustomers.forEach(System.out::println);
		System.out.println();
		System.out.println("6. Indexed parameter Query");
		List<Customer> hydCustomers1 = customerDao.getAllCustomersByCity("Hyderabad1");
		hydCustomers1.forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer  = new Customer();
		customer.setCustomerName("Suresh2");
		customer.setCustomerLocation("Hyderabad");

		//calling the saveCustomer
		//Customer savedCustomer = customerService.createNewBrandCustomerUsingSaveAndFlush(customer);
		//System.out.println(savedCustomer);

		//calling the delete customers
		//customerService.terminateCustomers(List.of(966,971,1952));

		//fetching all Customers
		Customer cust = new Customer();
		//cust.setCustomerName("Mahesh");
		//cust.setCustomerLocation("Hyderabad1");
		//Will fetch all the records from table
		//customerService.fetchAllCustomers(cust);

		//getting the customerDetails
		//Customer customerInfo = customerService.fetchCustomerDetailsById(111);
		//System.out.println(customerInfo);
	}
}