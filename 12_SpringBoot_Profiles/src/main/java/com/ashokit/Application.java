package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] activeProfiles = environment.getActiveProfiles();
		System.out.println("Active Profile Name = " + Arrays.asList(activeProfiles));
		System.out.println("Database username :::" + environment.getProperty("database.username"));
		System.out.println("Database Password :::" + environment.getProperty("database.password"));
		System.out.println("Application emails :::" + environment.getProperty("application.emails"));
	}
}
