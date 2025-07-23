package com.aurionpro.model;

public class StudentMarks {
	String name;
	int rollNo;
	int englishMarks;
	int scienceMarks;
	int mathMarks;
	
	public StudentMarks(String name , int rollNo , int englishMarks , int scienceMarks , int mathMarks){
		this.name = name;
		this.rollNo = rollNo;
		this.englishMarks = englishMarks;
		this.scienceMarks = scienceMarks;
		this.mathMarks = mathMarks;
	}
	
	public void display() {
		System.out.println("Name : " + name + " , Roll NO : " + rollNo + " \n1)English Marks : "+ englishMarks + "  2)Science Marks : " + scienceMarks + "  3)Maths Marks : " + mathMarks);
		System.out.println("--------------------------------------------------------------------------------");
	}
}
