package com.aurionpro.student_mp;

public class Student {
	protected Integer rollNo;
	protected String name;
	protected Integer marks;

	public Student(Integer rollNo, String name, Integer marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Roll no : " + rollNo + ", Name : " + name + ", Marks : " + marks;	
	}

	
	
}
