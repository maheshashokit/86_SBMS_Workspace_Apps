package com.ashokit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.spring.beans.Demo;

@Configuration
public class EmailConfig {
	
	@Bean
	public Demo getDemoObject() {
		Demo demo = new Demo();
		demo.setMessage("Welcome to spring");
		return demo;
	}

}
