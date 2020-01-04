package com.harika.Pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public HelloWorld getBean() {
		System.out.println("Entered into the constructor and object is created");
		return new HelloWorld();
	}
}
