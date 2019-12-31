package com.harika.SpringCoreExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.model.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		HelloService service = (HelloService)factory.getBean("harika");
		System.out.println(service.getMessage());
    }
}
