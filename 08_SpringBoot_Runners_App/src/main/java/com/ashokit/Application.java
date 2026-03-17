package com.ashokit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

		CommandLineRunner demoRunner = (arg1) ->{
			System.out.println("DemoRunner = " + Arrays.toString(args));
		};
		demoRunner.run(args);


		CommandLineRunner databaseRunner = (arg2) ->{
			System.out.println("DatabaseRunner = " + Arrays.toString(args));
		};
		databaseRunner.run(args);
	}

}
