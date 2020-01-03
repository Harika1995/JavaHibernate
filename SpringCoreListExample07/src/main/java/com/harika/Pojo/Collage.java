package com.harika.Pojo;

import java.util.Iterator;
import java.util.List;

public class Collage {
	private String name;
	private List<Student> students;
	
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void displayDetails()
	{
		System.out.println("College Name is"+name);
		System.out.println("Student Detials are");
		Iterator<Student>it=students.iterator();
		while(it.hasNext())
		{
			Student c=it.next();
			System.out.println(c.getSno());
			System.out.println(c.getSname());
			System.out.println(c.getFee());
		}
	}
}
