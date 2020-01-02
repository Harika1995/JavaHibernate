package com.harika.coreJava;

public class TestCar {
	public static void main(String args[]) {
		Car car1= Car.getInstance();
		Car car2= Car.getInstance();
		Car car3= Car.getInstance();
		Car car4= Car.getInstance();
		Car car5= Car.getInstance();
		System.out.println(car1+"\t"+car2+"\t"+car3+"\t"+car4+"\t"+car5);
	}
}
