package com.harika.SpringJavaBasedConfigurationExample;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harika.Pojo.HelloWorld;
import com.harika.Pojo.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HelloWorld hello = (HelloWorld) context.getBean(HelloWorld.class);
        hello.setMessage("Welcome Harika Naidu");
        System.out.println(hello.getMessage());
    }
}
