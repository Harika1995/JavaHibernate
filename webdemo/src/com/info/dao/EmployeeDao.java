package com.info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployee = new ArrayList<Employee>();
		try {
			String query = "select * from employee";
			PreparedStatement pStatement = connection.prepareStatement(query);
			ResultSet resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEno(resultSet.getInt("eno"));
				employee.setFirstname(resultSet.getString("firstName"));
				employee.setLastname(resultSet.getString("lastName"));
				employee.setGender(resultSet.getString("gender"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setUsername(resultSet.getString("userName"));
				
				allEmployee.add(employee);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return allEmployee;
	}
	
	public void deleteEmployee(int eno) {
		try {
			String query="delete from employee where eno=?";

			PreparedStatement pStatement = connection.prepareStatement("query");
			pStatement.setInt(1,eno);
			pStatement.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}