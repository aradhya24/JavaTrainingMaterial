package com.aurionpro.mp2_student_performance_mgmt_system;

public abstract class Student {
	protected String name;
	protected Integer rollNumber;
	Stream stream;

	public Student(String name, Integer rollNumber, Stream stream) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.stream = stream;
	}

	abstract Character calculatePerformance();

	public void displayInfo() {
		System.out.println("Name : " + name);
		System.out.println("Roll number : " + rollNumber);
		System.out.println("Stream :" + stream);
	}

	public void displayInfo(Boolean detailed) {
		System.out.println("Name : " + name);
		System.out.println("Roll number : " + rollNumber);
		System.out.println("Stream :" + stream);
	}

	public void displayInfo(String format) {
		System.out.println("Name : " + name);
		System.out.println("Roll number : " + rollNumber);
		System.out.println("Stream :" + stream);
	}

}
