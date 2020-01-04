package com.harika.other;

public class College {
	private Student student;

	public College(Student student) {
		this.student = student;
	}
	
	public void display() {
		System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getAddr());
	}
}
