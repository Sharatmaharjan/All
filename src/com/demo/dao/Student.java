package com.demo.dao;

public class Student {
	String name;
	String address;
	int phone;
	String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String toString(){
		return "Name of Student:"+name+"  Address of Student:"+address+"  Phone:"+phone;
	}
	

}
