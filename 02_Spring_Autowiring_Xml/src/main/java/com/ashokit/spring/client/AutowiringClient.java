package com.ashokit.spring.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.spring.beans.User;

public class AutowiringClient {
	
	public static void main(String[] args) {
		
		//Activating the Spring Container which is implementation class for BeanFactory
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
		
		//Reading the configuration file
		XmlBeanDefinitionReader xdr = new XmlBeanDefinitionReader(context);		
		xdr.loadBeanDefinitions("spring.xml");
		
		User user  = (User)context.getBean("user");
		System.out.println(user);

	}

}
