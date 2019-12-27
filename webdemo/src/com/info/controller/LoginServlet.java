package com.info.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.EmployeeDao;
import com.info.model.Employee;


@WebServlet("/check.htm")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		Employee emp = new Employee();
		emp.setUsername(uname);
		emp.setPassword(pwd);
		
		EmployeeDao eDao = new EmployeeDao();
		
		boolean result = eDao.checkEmployee(emp);
		if(result!=false) {
			System.out.println("Login is Successful");
			RequestDispatcher dispacher = request.getRequestDispatcher("Home.html");
			dispacher.forward(request, response);
		}
		else {
			RequestDispatcher dispacher = request.getRequestDispatcher("login.html");
			dispacher.forward(request, response);
		}
	}

}
