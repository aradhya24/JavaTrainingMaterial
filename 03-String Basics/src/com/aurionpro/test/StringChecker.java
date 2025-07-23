package com.aurionpro.test;

public class StringChecker {

	public static void main(String[] args) {
		
		String str1 = "Aradhya";
		String str2 = "Aradhya";
		System.out.println(str1 == str2); // true string pool
		str1.concat(" Dange");
		System.out.println(str1);
		
		String str3 = new String("hello"); // new = store in heap memory (All object store in heap)
		String str4 = new String("hello");
		System.out.println(str3 == str4); // false (new object of string created )
		
		
		String str5 = "Welcome to my World";
		
	}

}
