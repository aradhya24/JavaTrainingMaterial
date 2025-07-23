package com.aurionpro.exam_grading_system;

public class CommerceStudent extends Student {
	
	Integer accounts;
	Integer economics;
	Integer buisness;

	
    
	public CommerceStudent(Integer rollNumber, String name, Integer accounts, Integer economics, Integer buisness) {
		super(rollNumber, name);
		this.accounts = accounts;
		this.economics = economics;
		this.buisness = buisness;
	}



	Double calculateAverage() {
		return (accounts + economics + buisness) / 3.0;
	}

	@Override
	Character calculateGrade() {
		Double averageMarks = calculateAverage();
		if (averageMarks >= 90) {
			return 'A';
		}
		if (averageMarks >= 80) {
			return 'B';
		}
		if (averageMarks >= 60) {
			return 'C';
		}
		return 'D';
	}

	void printDetails() {
		System.out.println("Name         : " + name);
		System.out.println("Roll Number  : " + rollNumber);
		System.out.println("Accounts Marks: " + accounts);
		System.out.println("Economics Marks: " + economics);
		System.out.println("Buisness Marks  : " + buisness);
		System.out.println("Average      : " + calculateAverage());
		System.out.println("Grade        : " + calculateGrade());
	}

}
