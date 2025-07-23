package com.aurionpro.sortmoviesby_year_title_3;

import java.util.ArrayList;
import java.util.Scanner;


public class InputService {
     
	public static void getFlightInput(Scanner scanner, ArrayList<Movies> movieList) {

		String title = "";
		Integer year = 0;

		while (true) {
			System.out.print("\nEnter movie title : ");
			title = scanner.nextLine();
			
			if(Validations.getStringValidateAllAlphabets(title) && Validations.getStringValidateNotNull(title)) {
				break;
			}
		}

		while (true) {
			System.out.print("Enter year : ");
			try {
				year = Integer.parseInt(scanner.nextLine());
				if(Validations.getYearLengthValidate(year) || Validations.getYearValidate(year)) {
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter year in digits only.");
			}
		}

		movieList.add(new Movies(title, year));
		System.out.println("Added Sucessfully ....");
	}
}
