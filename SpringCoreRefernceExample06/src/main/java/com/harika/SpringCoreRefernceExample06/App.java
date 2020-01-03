package com.harika.SpringCoreRefernceExample06;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.Pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Student stu = (Student)factory.getBean("student");
        stu.display();
    }
}
