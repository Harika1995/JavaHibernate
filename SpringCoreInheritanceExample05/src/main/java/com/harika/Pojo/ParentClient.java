package com.harika.Pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class ParentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		BeanFactory beans=new XmlBeanFactory(new ClassPathResource("/spring.xml"));
		Child c=(Child)beans.getBean("harika");
		c.displayDetails();

	}

}
