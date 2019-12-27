package com.info.model;

public class Employee {
	private int eno;
	private String firstname;
	private String lastname;
	private String gender;
	private double salary;
	private String username;
	private String password;
	
	public Employee() {

	}
	public Employee(String firstname, String lastname, String gender, double salary, String username, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}
	public Employee(int eno, String firstname, String lastname, String gender, double salary, String username,
			String password) {
		this.eno = eno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
