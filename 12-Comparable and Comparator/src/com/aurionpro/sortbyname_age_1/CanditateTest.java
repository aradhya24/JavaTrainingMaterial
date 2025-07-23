package com.aurionpro.sortbyname_age_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.student_example_0.Student;

public class CanditateTest {

	public static void main(String[] args) {

		ArrayList<Canditate> canditateList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Integer choice = -1;

		while (true) {

			System.out
					.print("\n\nChoose option : 1 -> Add Candidate  |  2 -> View Candidate (Sorted)  |  3 -> EXIT  : ");

			while (true) {
				try {
					choice = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print(
							"\n\nChoose option : 1 -> Add Candidate  |  2 -> View Candidate (Sorted)  |  3 -> EXIT  : ");
				}
			}

			switch (choice) {

			case 1:
				getStudentInput(scanner, canditateList);
				break;

			case 2:
				Collections.sort(canditateList, new AgeSortComparatorAscending());
				System.out.println("After sorting : " + canditateList);
				break;

			case 3:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid choice.....");

			}
		}
	}

	public static void getStudentInput(Scanner scanner, ArrayList<Canditate> canditateList) {

		String name = "";
		int age = -1;

		while (true) {
			System.out.print("\nEnter candidate name : ");
			name = scanner.nextLine();

			if (Validations.getNameValidateAllAlphabets(name) && Validations.getNameValidateNotNull(name)) {
				break;
			}
		}

		while (true) {
			System.out.print("Enter candidate age (Max age : 100): ");
			try {
				age = Integer.parseInt(scanner.nextLine());

				if (Validations.negativeValueValidate(age) || Validations.maxAgeValidate(age)) {
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter age in digits only.(Max age : 100)");
			}
		}

		canditateList.add(new Canditate(name, age));
		System.out.println("Added Sucessfully ....");
	}
}
