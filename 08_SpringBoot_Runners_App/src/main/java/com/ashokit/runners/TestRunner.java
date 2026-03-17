package com.ashokit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class TestRunner implements CommandLineRunner {

    public TestRunner() {
        System.out.println("TestRunner Class Constructors....");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("TestRunner CommandLine Args:::" + Arrays.toString(args));
    }
}
