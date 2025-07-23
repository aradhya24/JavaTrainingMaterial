package com.aurionpro.encapsulation.test;

import java.util.Scanner;

import com.aurionpro.encapsulation.model.Student;


public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//        Student student = new Student();
//        student.setName("Aradhya");
//        student.setMarks(100);
//        student.setRollNo(2);
//        System.out.println(student);
		System.out.println("Enter the Number of Students to be recorded : ");
		int size = scanner.nextInt();
		Student[] students = new Student[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " Student Details");
			scanner.nextLine();

			System.out.println("Enter Name : ");
			String name = scanner.nextLine();

			System.out.println("Enter RollNo : ");
			int rollNo = scanner.nextInt();

			System.out.println("Enter Marks : ");
			int marks = scanner.nextInt();
			
            students[i] = new Student();
			students[i].setName(name);
			students[i].setRollNo(rollNo);
			while(!students[i].setMarks(marks)) {
				System.out.println("Enter Marks Again: ");
				marks = scanner.nextInt();
			}
			students[i].setMarks(marks);
			
		}
		System.out.println("\n--------------------------------------");
		for(Student student : students) {
//			System.out.println("Name : " + student.getName());
//			System.out.println("Roll No : " + student.getRollNo());
//			System.out.println("Marks : " + student.getMarks());
			System.out.println(student.toString());
			System.out.println("--------------------------------------");
		}
		
		
		
	}

}
