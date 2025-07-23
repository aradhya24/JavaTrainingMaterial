package com.aurionpro.model;

public class Student {
      
	String name;
	int rollNo;
	double cgpa;

	public Student(String name, int rollNo, double cgpa) {
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
	}

	public void display() {
		System.out.println("Name : " + name + " , Roll NO : " + rollNo + " , CGPA : " + cgpa);
		System.out.println("----------------------------------------------------------------");
	}

}
