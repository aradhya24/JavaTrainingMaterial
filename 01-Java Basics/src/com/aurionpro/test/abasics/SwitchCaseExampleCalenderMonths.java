package com.aurionpro.test.abasics;

import java.util.Scanner;

public class SwitchCaseExampleCalenderMonths {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a month between 1 to 12 : ");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
			System.out.println("No of Days in January is 31 ");
			break;
		case 2:
			System.out.println("No of Days in February is 28");
			break;
		case 3:
			System.out.println("No of Days in March is 31");
			break;
		case 4:
			System.out.println("No of Days in April is 30");
			break;
		case 5:
			System.out.println("No of Days in May is 31");
			break;
		case 6:
			System.out.println("No of Days in June is 30");
			break;
		case 7:
			System.out.println("No of Days in July is 31");
			break;
		case 8:
			System.out.println("No of Days in August is 31");
			break;
		case 9:
			System.out.println("No of Days in September is 30");
			break;
		case 10:
			System.out.println("No of Days in October is 31");
			break;
		case 11:
			System.out.println("No of Days in November is 30");
			break;
		case 12:
			System.out.println("No of Days in December is 31");
			break;
		default:
			System.out.println("Enter Wrong Choice");
			
		}
		scanner.close();
	}

}
