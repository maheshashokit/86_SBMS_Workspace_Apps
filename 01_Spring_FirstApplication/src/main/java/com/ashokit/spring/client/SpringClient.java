package com.ashokit.spring.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.spring.beans.Demo;
import com.ashokit.spring.beans.Employee;
import com.ashokit.spring.beans.Student;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//Activating the Spring Container which is implementation class for BeanFactory
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
		
		//Reading the configuration file
		XmlBeanDefinitionReader xdr = new XmlBeanDefinitionReader(context);		
		xdr.loadBeanDefinitions("spring.xml");
		
		//Requesting the Spring Bean from Spring container by using id of spring bean 
		Demo demo  = (Demo)context.getBean("demo");		
		//When we are printing demo object internally call toString() from Demo class 
		System.out.println(demo);
		
		System.out.println("=============================================");
		
		Student student = (Student)context.getBean("st");		
		//calling the service method from Student Class
		System.out.println(student.displayStudentDetails());
		System.out.println(student.displayCourseDetails());
		//printing the student object by using SOP statement
		System.out.println(student);
		
		
		Employee emp = (Employee)context.getBean("emp");
		System.out.println(emp);
		
	}
}
