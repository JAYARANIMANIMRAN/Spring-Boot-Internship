package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource.xml");
        Student s =(Student) context.getBean("st");
        s.internshipProgram();
        System.out.println( "Hello World!" );
        SpringBoot F = (SpringBoot) context.getBean("fun");
        F.hello("hii");

    }
}
