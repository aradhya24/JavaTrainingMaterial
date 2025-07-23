package com.aurionpro.student;

public class Student {
	String name;
	Integer marks;

	public Student(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", Marks : " + marks;
	}
    
	
}
