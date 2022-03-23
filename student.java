package com.autowiring;

public class student {
	int roll;
	String name;
	Address address;
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
