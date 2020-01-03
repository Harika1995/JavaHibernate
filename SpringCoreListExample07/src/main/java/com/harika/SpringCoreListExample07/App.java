package com.harika.SpringCoreListExample07;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.Pojo.InstituteBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub
    			BeanFactory beans=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    			InstituteBean it=(InstituteBean)beans.getBean("ibref");
    			it.displayDetails();
    }
}
