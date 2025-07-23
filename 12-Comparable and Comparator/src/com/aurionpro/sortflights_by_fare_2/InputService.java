package com.aurionpro.sortflights_by_fare_2;

import java.util.ArrayList;
import java.util.Scanner;


public class InputService {
     
	public static void getFlightInput(Scanner scanner, ArrayList<Flight> flightList) {

		String airlineName = "";
		Double fare = 0.0;

		while (true) {
			System.out.print("\nEnter Airline name : ");
			airlineName = scanner.nextLine();
			
			if(Validations.getStringValidateAllAlphabets(airlineName) && Validations.getStringValidateNotNull(airlineName)) {
				break;
			}
		}

		while (true) {
			System.out.print("Enter fare of flight : ");
			try {
				fare = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter fare in digits only.");
			}
		}

		flightList.add(new Flight(airlineName, fare));
		System.out.println("Added Sucessfully ....");
	}
}
