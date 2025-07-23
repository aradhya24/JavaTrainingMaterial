package com.aurionpro.test.abasics;

public class MethodExample {
    
	//with parameter but no return type
	public static void greet(String name , int age) {
		System.out.println("Hello Goodmorning , My Name is : " + name +"\n My Age is : " + age);
	} 
	
	// with parameter and return type
	public static int square(int number) {
		return number*number;
	}      
	
	
	public static void main(String[] args) {
		
//		greet("Aradhya", 21);
		System.out.println(square(6));

	}

}
