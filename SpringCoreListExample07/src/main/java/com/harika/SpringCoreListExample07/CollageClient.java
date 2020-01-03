package com.harika.SpringCoreListExample07;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.harika.Pojo.Collage;
import com.harika.Pojo.InstituteBean;

public class CollageClient {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		BeanFactory beans=new XmlBeanFactory(new ClassPathResource("spring1.xml"));
		Collage college = (Collage) beans.getBean("clg");
		college.displayDetails();
	}
}
