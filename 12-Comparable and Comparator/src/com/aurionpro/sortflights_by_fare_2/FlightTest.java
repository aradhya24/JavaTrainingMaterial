package com.aurionpro.sortflights_by_fare_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FlightTest {
	
	public static void main(String[] args) {
		ArrayList<Flight> flightList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Integer choice = -1;

		while(true)
		{

			System.out.print(
					"\n\nChoose option : 1 -> Add Flight Details  |  2 -> View Flights (Sorted by highest fare)  |  3 -> EXIT  : ");

			while (true) {
				try {
					choice = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print(
							"\n\nChoose option : 1 -> Add Flight Details  |  2 -> View Flights (Sorted by highest fare)  |  3 -> EXIT  : ");
				}
			}

			switch (choice) {

			case 1:
				InputService.getFlightInput(scanner, flightList);
				break;

			case 2:
				Collections.sort(flightList, new SortFlightByFareDecsendingComparator());
				System.out.println("After sorting : " + flightList);
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

