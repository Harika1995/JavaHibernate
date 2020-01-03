package com.harika.Pojo;

import java.util.Iterator;
import java.util.List;

public class InstituteBean {
	private String name;
	private List<String> facultyNames;
	private List<String> courseNames;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getFacultyNames() {
		return facultyNames;
	}
	public void setFacultyNames(List<String> facultyNames) {
		this.facultyNames = facultyNames;
	}
	
	public List<String> getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(List<String> courseNames) {
		this.courseNames = courseNames;
	}
	
	public void displayDetails()
	{
		System.out.println("Institue Name: "+name);
		System.out.println("----------- Faculty Names -----------");
		Iterator<String> faculty = facultyNames.iterator();
		while(faculty.hasNext()) {
			String f=faculty.next();
			System.out.println(facultyNames);
		}
		System.out.println("----------- CoursesNames are -----------");
		Iterator<String>it=courseNames.iterator();
		while(it.hasNext())
		{
			String c=it.next();
			System.out.println(courseNames);
		}
	}
}
