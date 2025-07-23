package com.aurionpro.test.abasics;

public class LeapYearChecking {
	public static void main(String args[]) {
		int year = 2004;
		
		if(year % 100 == 0 && year % 400 == 0) {
			System.out.println("Leap Year");
		}
		
		if (year % 4 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}
}
