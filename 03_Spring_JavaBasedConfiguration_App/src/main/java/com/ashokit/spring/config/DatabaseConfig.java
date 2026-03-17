package com.ashokit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
	
	@Bean
	public java.util.Date getDateObject(){
		return new java.util.Date();
	}

}
