package com.aurionpro.static_example.test;

public class StudentTest {
    
	String name;
	static String collegeName;
	
	
	
	public static void main(String[] args) {
		
		collegeName = "SIES GST";
		
		StudentTest student1 = new StudentTest();
		StudentTest student2 = new StudentTest();
		
		student1.name = "Aradhya";
		student2.name = "Om";
        System.out.println("Name : " + student1.name + " College Name : " + collegeName);
        System.out.println("Name : " + student2.name + " College Name : " + collegeName);
	}

}
