package com.harika.contoller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {
	
	
	public WelcomeServlet() {
		System.out.println("Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method");
	}
	
	public void init(ServletConfig config) {
		System.out.println("Init method");
	}

	public void destroy() {
		System.out.println("Destroy method");
	}
}
