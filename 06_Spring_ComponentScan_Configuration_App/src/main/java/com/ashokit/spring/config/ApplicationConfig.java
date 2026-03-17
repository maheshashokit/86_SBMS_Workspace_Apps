package com.ashokit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Representing the Java Class as Spring Configuration class
@Configuration

//Activating the component scan 
@ComponentScan(basePackages = "com.ashokit.spring")
public class ApplicationConfig {	
	
	@Bean
	public java.util.Date getDateObj() {
		return new java.util.Date();
	}

}
