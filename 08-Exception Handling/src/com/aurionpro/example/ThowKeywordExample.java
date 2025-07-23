package com.aurionpro.example;

import java.util.Scanner;

public class ThowKeywordExample {
	
	static void validateMarks(int marks) {
		if(marks < 0 || marks > 100) {
			throw new IllegalArgumentException("Marks are not Valid");
		}
		System.out.println("Valid Marks");
	}

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter marks : ");
		int marks = scanner.nextInt();
		
		
		validateMarks(marks);
		
	}

}
