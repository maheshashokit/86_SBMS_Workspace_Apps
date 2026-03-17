package com.ashokit.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentConfig {

    public DevelopmentConfig(){
        System.out.println("DevelopmentConfig Class Constructor.....");
    }

    @Bean
    public java.util.Date getDateObject(){
        return new java.util.Date();
    }
}
