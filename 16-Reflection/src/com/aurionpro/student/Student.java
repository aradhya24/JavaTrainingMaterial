package com.aurionpro.student;

public class Student {
    
	Integer rollNo;
    String name;
    private static Double cgpa = 9.2;
    private static final Integer age = 10;
	
	public Student() {
	}

	public Student(Integer rollNo, String name, Double cgpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.cgpa = cgpa;
	}
    
	public void greet() {
		System.out.println("Hello");
	}
	
	public Double getCgpa() {
	    return cgpa;
	}
}
