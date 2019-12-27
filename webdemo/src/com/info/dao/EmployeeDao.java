package com.info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.info.model.Employee;

import oracle.net.aso.p;

public class EmployeeDao {
	Connection connection;
	
	public EmployeeDao() {
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "system";
		String password = "Harika_1";
		try {
			Class.forName(driver); 
			connection = DriverManager.getConnection(url,username,password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void createEmployee(Employee employee) {
		try {
			String query = "insert into employee (firstname,lastname,gender,salary,username,password) values(?,?,?,?,?,?)";
			
			PreparedStatement pStatement = connection.prepareStatement(query);
			pStatement.setString(1,employee.getFirstname());
			pStatement.setString(2,employee.getLastname());
			pStatement.setString(3,employee.getGender());
			pStatement.setDouble(4,employee.getSalary());
			pStatement.setString(5,employee.getUsername());
			pStatement.setString(6,employee.getPassword());
			
			pStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkEmployee(Employee employee) {
		boolean result = false;
		try {
			String query ="select * from employee where username=? and password=?";
			PreparedStatement pStatement = connection.prepareStatement(query);
			
			pStatement.setString(1, employee.getUsername());
			pStatement.setString(2,employee.getPassword());
			
			ResultSet resultSet = pStatement.executeQuery();
			result = resultSet.next();
			 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}