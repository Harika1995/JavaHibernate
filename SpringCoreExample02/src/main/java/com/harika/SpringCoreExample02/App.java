package com.harika.SpringCoreExample02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.pojo.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        HelloWorld world = (HelloWorld)factory.getBean("harika");
        world.display();
        HelloWorld world1 = (HelloWorld)factory.getBean("naidu");
        world1.display();
    }
}
