package com.aurionpro.exam_grading_system;

public abstract class Student {
	protected Integer rollNumber;
	protected String name;

	public Student(Integer rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	abstract Character calculateGrade();

}
