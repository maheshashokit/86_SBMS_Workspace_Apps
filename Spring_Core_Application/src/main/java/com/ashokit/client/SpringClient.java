package com.ashokit.client;

import com.ashokit.beans.Employee;
import com.ashokit.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringClient 
{
    public static void main( String[] args )
    {
         //creating object for Spring Container
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
        //Requesting the Spring Bean Objects
        Employee emp = context.getBean(Employee.class);
        System.out.println("emp = " + emp);
                
    }
}

// IntelliJ IDE Shortcuts
//1) ALT + Enter  -> To Import the Package Statements
//2) CTRL+ SHIFT+N  -> To Search For File
//3) CTRL+SHIFT+F   -> To search something in files
//4) Setter & Getters Methods -> Right Click -> Generate -> Setter & Getters -> Select ALL fields -> Click on Generate
//5) CTRL + SHIFT+ / -> Commenting the block of code
