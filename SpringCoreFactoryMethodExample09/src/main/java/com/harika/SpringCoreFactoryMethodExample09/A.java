package com.harika.SpringCoreFactoryMethodExample09;

public class A {
	private static A obj = new A();
	private A() {
		// TODO Auto-generated constructor stub
		System.out.println("Private Constructor");
	}
	
	public static A getA() {
		System.out.println("Factory Method");
		return obj;
	}
	public void display() {
		System.out.println("Welcome user");
	}
}
