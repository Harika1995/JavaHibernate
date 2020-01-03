package com.harika.Pojo;

public class Student {
	private int sno;
	private String name;
	private Address addr;
	
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void display() {
		System.out.println(sno+"\t"+name);
		System.out.println("\t"+addr.getHouseNo()+"\t"+addr.getStreetNo()+"\t"+addr.getCity());
	}
}
