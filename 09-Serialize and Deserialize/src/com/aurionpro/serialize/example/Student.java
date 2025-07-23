package com.aurionpro.serialize.example;

import java.io.Serializable;

public class Student implements Serializable{
    
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {

		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void display(){
		System.out.println("Name : " + name + " Roll no : " + rollNo);
	}
	
}
