package com.aurionpro.student_example_0;

public class Student implements Comparable<Student>{ 
	
	Integer id;
	String name;
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nId : " + id + ",  Name : " + name ;
	}

	@Override
	public int compareTo(Student student) {
		return this.id - student.id;
	}
	
	
}
