package com.harika.pojo;

public class HelloWorld {
	private String name;

	public HelloWorld(String name) {
		this.name = name;
	}

	public HelloWorld() {
	}
	public void display() {
		System.out.println("Welcome "+ name);
	}
}
