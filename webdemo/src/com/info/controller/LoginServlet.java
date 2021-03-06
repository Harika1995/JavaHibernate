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
		RequestDispatcher dispacher=null;
		if(result) {
			dispacher= request.getRequestDispatcher("Home.jsp");
			request.setAttribute("user",uname.toUpperCase());
		}
		else {
			dispacher=request.getRequestDispatcher("login.jsp");
			request.setAttribute("message","Invalid Creadentials");
			
		}
		dispacher.forward(request, response);
	}

}
