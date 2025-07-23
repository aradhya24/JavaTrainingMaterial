package com.aurionpro.exam_grading_system;

public class ScienceStudent extends Student {

	Integer physicsMarks;
	Integer chemistryMarks;
	Integer mathsMarks;

	public ScienceStudent(Integer rollNumber, String name, Integer physicsMarks, Integer chemistryMarks,
			Integer mathsMarks) {
		super(rollNumber, name);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	Double calculateAverage() {
		return (physicsMarks + chemistryMarks + mathsMarks) / 3.0;
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
		System.out.println("Physics Marks: " + physicsMarks);
		System.out.println("Chemistry Marks: " + chemistryMarks);
		System.out.println("Maths Marks  : " + mathsMarks);
		System.out.println("Average      : " + calculateAverage());
		System.out.println("Grade        : " + calculateGrade());
	}

}
