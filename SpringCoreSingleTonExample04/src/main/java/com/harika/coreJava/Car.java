package com.harika.coreJava;

public class Car {
	private static Car c= new Car();
	private Car() {
		System.out.println("Private Constructor");
	}
	public static Car getInstance() {
		return c;
	}
}
