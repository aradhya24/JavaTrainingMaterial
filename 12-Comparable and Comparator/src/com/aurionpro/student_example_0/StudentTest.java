package com.aurionpro.student_example_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		studentList.add(new Student(3, "Aradhya"));
		studentList.add(new Student(2, "Om"));
		studentList.add(new Student(4, "Vikas"));
		studentList.add(new Student(1, "Shaw"));
		System.out.println(studentList);

		Integer choiceSortingType = -1;

		while (true) {

			System.out.print("\nChoose Sorting type : 1 -> by ID  |  2 -> Name  |  3 -> EXIT  : ");

			while (true) {
				try {
					choiceSortingType = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print("\nChoose Sorting type : 1 -> by ID  |  2 -> Name  |  3 -> EXIT  : ");
					scanner.next();
				}
			}

			switch (choiceSortingType) {

			case 1:
				sortByID(scanner, studentList, choiceSortingType);
				break;

			case 2:
				sortByName(scanner, studentList, choiceSortingType);
				break;

			case 3:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid choice.....");

			}

		}

	}

	public static void sortByID(Scanner scanner, ArrayList<Student> studentList, Integer choice) {
		while (true) {

			System.out
					.print("\nChoose Sorting type : 1 -> Ascending order  |  2 -> Descending order  |  3 -> Back  : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print(
							"\nChoose Sorting type : 1 -> Ascending order  |  2 -> Descending order  |  3 -> Back  : ");
					scanner.next();
				}
			}

			switch (choice) {

			case 1:
				Collections.sort(studentList, new IdSortUsingComparatorAscending());
				System.out.println("\nIdSortUsingComparatorAscending sorting with comparable : " + studentList);
				break;

			case 2:
				Collections.sort(studentList, new IdSortUsingComparatorDesending());
				System.out.println("\nIdSortUsingComparatorDesending sorting with comparable : " + studentList);
				break;

			case 3:
				return;

			default:
				System.out.println("Invalid Choice ...");
			}

		}
	}

	public static void sortByName(Scanner scanner, ArrayList<Student> studentList, Integer choice) {
		while (true) {

			System.out
					.print("\nChoose Sorting type : 1 -> Ascending order  |  2 -> Descending order  |  3 -> Back  : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print(
							"\nChoose Sorting type : 1 -> Ascending order  |  2 -> Descending order  |  3 -> Back  : ");
					scanner.next();
				}
			}
			switch (choice) {

			case 1:
				Collections.sort(studentList, new NameSortUsingComparatorAscending());
				System.out.println("\nNameSortUsingComparatorAscending sorting with comparable : " + studentList);
				break;

			case 2:
				Collections.sort(studentList, new NameSortUsingComparatorDescending());
				System.out.println("\nNameSortUsingComparatorDescending sorting with comparable : " + studentList);
				break;

			case 3:
				return;

			default:
				System.out.println("Invalid Choice ...");
			}

		}
	}
}
