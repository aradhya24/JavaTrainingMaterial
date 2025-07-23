package com.aurionpro.static_example.test;

public class EmployeeTest {
    
	static private int count;
	public EmployeeTest() {
		count++;
	}
	
	
	public static void main(String[] args) {
		
		new EmployeeTest();
		new EmployeeTest();
		new EmployeeTest();
		System.out.println("count of obj : "  + count);
	}

}
