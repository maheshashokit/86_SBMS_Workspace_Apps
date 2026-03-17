package com.ashokit.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueRunner implements ApplicationRunner {

    public MessageQueueRunner() {
        System.out.println("MessageQueueRunner constructor");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MessageQueueRunner run method class....");

        System.out.println("Non-option Arguments(CLA):::::" + args.getNonOptionArgs());

        System.out.println("Option Arguments:::::" + args.getOptionNames());
        System.out.println("DatabaseUsername::::::::" + args.getOptionValues("DatabaseUsername"));
        System.out.println("DatabasePassword::::::::" + args.getOptionValues("DatabasePassword"));

        //Java8 Style for iterating key-value objects
        args.getOptionNames().forEach(eachKey -> {
            String value = args.getOptionValues(eachKey).get(0);
            System.out.println("Key="+ eachKey +" value =" + value);
        });

    }
}
