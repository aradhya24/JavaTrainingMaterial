package com.aurionpro.mp2_student_performance_mgmt_system;

public class CommerceStudent extends Student {
	
	Integer accounts;
	Integer economics;
	Integer buisnessStudies;

	
	public CommerceStudent(String name, Integer rollNumber, Stream stream, Integer accounts, Integer economics,
			Integer buisnessStudies) {
		super(name, rollNumber, stream);
		this.accounts = accounts;
		this.economics = economics;
		this.buisnessStudies = buisnessStudies;
	}

	Double calculateAverage() {
		return (accounts + economics + buisnessStudies) / 3.0;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Account Marks : " + accounts);
		System.out.println("Economics Marks: " + economics);
		System.out.println("Buisness Marks  : " + buisnessStudies);
		System.out.println("Average      : " + calculateAverage());
		System.out.println("Grade        : " + calculatePerformance());
	}
	
	public void displayInfo(Boolean detailed) {
		super.displayInfo();
		System.out.println("Account Marks : " + accounts);
		System.out.println("Economics Marks: " + economics);
		System.out.println("Buisness Marks  : " + buisnessStudies);
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
