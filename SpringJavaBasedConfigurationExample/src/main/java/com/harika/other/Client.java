package com.harika.other;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		College coll = (College)context.getBean(College.class);
		coll.display();
	}

}
