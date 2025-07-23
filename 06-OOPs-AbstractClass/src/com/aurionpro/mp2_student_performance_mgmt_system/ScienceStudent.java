package com.aurionpro.mp2_student_performance_mgmt_system;

public class ScienceStudent extends Student {

	Integer physicsMarks;
	Integer chemistryMarks;
	Integer mathsMarks;

	public ScienceStudent(String name, Integer rollNumber, Stream stream, Integer physicsMarks, Integer chemistryMarks,
			Integer mathsMarks) {
		super(name, rollNumber, stream);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	Double calculateAverage() {
		return (physicsMarks + chemistryMarks + mathsMarks) / 3.0;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Physics Marks: " + physicsMarks);
		System.out.println("Chemistry Marks: " + chemistryMarks);
		System.out.println("Maths Marks  : " + mathsMarks);
		System.out.println("Average      : " + calculateAverage());
		System.out.println("Grade        : " + calculatePerformance());
		System.out.println("----------------------------------------");
	}
	
	public void displayInfo(Boolean detailed) {
		super.displayInfo();
		System.out.println("Physics Marks: " + physicsMarks);
		System.out.println("Chemistry Marks: " + chemistryMarks);
		System.out.println("Maths Marks  : " + mathsMarks);
		System.out.println("Average      : " + calculateAverage());
		System.out.println("----------------------------------------");
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
