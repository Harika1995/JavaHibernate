package com.harika.Pojo;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int sno;
	private String name;
	
	public int getSno() {
		return sno;
	}
	@Required
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
}
