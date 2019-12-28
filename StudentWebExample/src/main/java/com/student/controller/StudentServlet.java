package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sno = Integer.parseInt(request.getParameter("sno"));
		String sname = request.getParameter("sname");
		String sadd = request.getParameter("sadd");
		PrintWriter pw = response.getWriter();
		pw.println(sno+"\t"+sname+"\t"+sadd);
	}

}
