package com.ashokit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmailRunner implements CommandLineRunner {

    public EmailRunner(){
        System.out.println("EmailRunner Class Constructor");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("EmailRunner = " + Arrays.toString(args));
    }
}
