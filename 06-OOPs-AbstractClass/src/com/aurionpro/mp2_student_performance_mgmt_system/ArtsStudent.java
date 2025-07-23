package com.aurionpro.mp2_student_performance_mgmt_system;

public class ArtsStudent extends Student{
	Integer history;
	Integer politicalScience;
	Integer sociology;
	
	public ArtsStudent(String name, Integer rollNumber, Stream stream, Integer history, Integer politicalScience,
			Integer sociology) {
		super(name, rollNumber, stream);
		this.history = history;
		this.politicalScience = politicalScience;
		this.sociology = sociology;
	}

	Double calculateAverage() {
		return (history + politicalScience + sociology) / 3.0;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("History Marks : " + history);
		System.out.println("Political Science Marks: " + politicalScience);
		System.out.println("Sociology Marks  : " + sociology);
		System.out.println("Average      : " + calculateAverage());
		System.out.println("Grade        : " + calculatePerformance());
	}
	
	public void displayInfo(Boolean detailed) {
		super.displayInfo();
		System.out.println("History Marks : " + history);
		System.out.println("Political Science Marks: " + politicalScience);
		System.out.println("Sociology Marks  : " + sociology);
		System.out.println("Average      : " + calculateAverage());
	}

	
	public void displayInfo(String formats) {
		super.displayInfo();
		System.out.println("Grade        : " + calculatePerformance());
		System.out.println("----------------------------------------");
	}
	@Override
	Character calculatePerformance() {
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
}
