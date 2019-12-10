package com.harika.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name = "eno")
	private int eno;
	private String firstName;
	private String lastName;
	private String email;
	//No Argument Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//Argument Constructor
	public Employee(int eno, String firstName, String lastName, String email) {
		super();
		this.eno = eno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	//Getters and Setters
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
