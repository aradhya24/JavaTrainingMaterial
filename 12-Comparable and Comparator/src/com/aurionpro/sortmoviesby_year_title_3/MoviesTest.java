package com.aurionpro.sortmoviesby_year_title_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.student_example_0.Student;

public class MoviesTest {

	public static void main(String[] args) {

		ArrayList<Movies> movieList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Integer choice = -1;

		while (true) {

			System.out.print("\n\nChoose option : 1 -> Add Movies  |  2 -> View Movies (Sorted)  |  3 -> EXIT  : ");

			while (true) {
				try {
					choice = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print("\n\nChoose option : 1 -> Add Movies  |  2 -> View Movies (Sorted)  |  3 -> EXIT  : ");
				}
			}

			switch (choice) {

			case 1:
				InputService.getFlightInput(scanner, movieList);
				break;

			case 2:
				Collections.sort(movieList, new TitleSortComparatorAscending());
				System.out.println("After sorting : " + movieList);
				break;

			case 3:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid choice.....");

			}
		}
	}

}
