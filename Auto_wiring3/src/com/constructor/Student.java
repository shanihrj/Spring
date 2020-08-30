package com.constructor;

public class Student 
{
private String name;
private Address address;

public Student(String name,Address address) {
	this.name=name;
	this.address=address;
}

public String toString() {
	return name+" "+address.getlAddress()+" "+address.getpAddress();
	
}
}
