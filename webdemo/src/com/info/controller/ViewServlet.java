package com.info.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.EmployeeDao;
import com.info.model.Employee;

@WebServlet("/getAll.htm")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDao eDao = new EmployeeDao();
		List<Employee> allEmployee = eDao.getAllEmployees();
		
		//request.setAttribute("employees",allEmployee);
		RequestDispatcher dispacher = request.getRequestDispatcher("View.jsp");
		request.setAttribute("employees",allEmployee);
		dispacher.forward(request, response);
		
	}

}
