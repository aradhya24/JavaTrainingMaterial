package com.aurionpro.test.abasics;

import java.util.Scanner;

public class GradeCalculatorSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int inputMarks = scanner.nextInt();
		System.out.println();
        
		if(inputMarks >= 90) {
			System.out.println("Your Grade is  A" );
		}
		else if(inputMarks >= 75 && inputMarks < 90){
			System.out.println("Your Grade is  B" );
		}
		else if(inputMarks >= 60 && inputMarks < 75){
			System.out.println("Your Grade is  C" );
		}
		else {
			System.out.println("Your Grade is  D" );
		}
	}

}
