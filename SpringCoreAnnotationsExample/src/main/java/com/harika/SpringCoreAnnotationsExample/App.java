package com.harika.SpringCoreAnnotationsExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harika.Pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student stu = (Student) context.getBean("student");
        System.out.println(stu.getSno()+"\t"+stu.getName());
    }
}
