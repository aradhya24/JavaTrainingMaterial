package com.aurionpro.encapsulation.model;

public class Student {
      
	private String name;
	private int rollNo;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public boolean setMarks(int marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
		else {
			System.out.println("Marks out of range : 0 - 100");
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "Student{" + " name= " +name+ " , rollno= "  +rollNo+ " , cgpa=" +marks+ "}";
	}
	
	
}
