package com.harika.Pojo;

public class Sample {
	private int sno;
	private String name;
	private String addr;
	
	public Sample() {
		// TODO Auto-generated constructor stub
	}
	
	public Sample(int sno, String name, String addr) {
		super();
		this.sno = sno;
		this.name = name;
		this.addr = addr;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
