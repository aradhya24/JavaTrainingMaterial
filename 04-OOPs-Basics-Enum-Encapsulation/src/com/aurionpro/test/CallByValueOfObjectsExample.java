package com.aurionpro.test;

import com.aurionpro.model.CallByValueOfObjects;

public class CallByValueOfObjectsExample {
    
	public static void changeName(CallByValueOfObjects s) {
		s.name = "Anjali";
		s = new CallByValueOfObjects();
		s.name = "Riya";
	}
	
	
	public static void main(String[] args) {
		
		CallByValueOfObjects s1 = new CallByValueOfObjects();
		s1.name = "Amit"; 
		changeName(s1);
		System.out.println("Name : " + s1.name);

	}

}
