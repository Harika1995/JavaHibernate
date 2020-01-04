package com.harika.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Student getStudentBean() {
		Student stu =  new Student();
		stu.setSno(100);
		stu.setSname("Harika");
		stu.setAddr("Missouri");
		return null;	
	}
	
	@Bean
	public College getBean() {
		return new College(getStudentBean());
	}
}
