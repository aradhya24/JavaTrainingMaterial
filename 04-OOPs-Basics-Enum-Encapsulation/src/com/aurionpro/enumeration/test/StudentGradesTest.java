package com.aurionpro.enumeration.test;

import java.util.Scanner;

import com.aurionpro.enumeration.model.StudentGrades;

public class StudentGradesTest {
	
	String name;

	public static void getGradeEvalution(StudentGrades studentGrades) {

		switch (studentGrades) {

		case A:
			System.out.println("Excellant");
			break;

		case B:
			System.out.println("Very Good");
			break;

		case C:
			System.out.println("Good");
			break;
		case D:
			System.out.println("Better");
			break;
		case F:
			System.out.println("Poor");
			break;
		}
	}

	public static void main(String[] args) {
        
		StudentGradesTest obj = new StudentGradesTest();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Grade A , B ,C , D , F :  ");
		String input = scanner.nextLine().toUpperCase();

		getGradeEvalution(StudentGrades.valueOf(input));
		System.out.println(obj.name);
		
		
	}
	
	{   
		name = "Aradhya";
		System.out.println(name);
	}

}
