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


@WebServlet("/create.htm") //URL
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response); //Sending request to doPost()  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname= request.getParameter("lastname");
		String gender = request.getParameter("gender");
		Double salary = Double.parseDouble(request.getParameter("salary"));
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		 
		System.out.println(fname+"\t"+lname+"\t"+gender+"\t"+salary+"\t"+uname+"\t"+pwd);
		//Creating employee object to enter user entered data into the employee class 
		Employee employee = new Employee(fname,lname,gender,salary,uname,pwd);
		
		EmployeeDao eDao =  new EmployeeDao();
		eDao.createEmployee(employee);
		
		//After creating the employee. send the control to the login page
		
		RequestDispatcher dispacher = request.getRequestDispatcher("login.jsp");
		dispacher.forward(request, response);
		
	}

}
