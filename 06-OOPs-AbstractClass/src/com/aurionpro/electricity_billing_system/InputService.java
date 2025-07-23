package com.aurionpro.electricity_billing_system;

import java.util.Scanner;

public class InputService {

	public static ResidentialCustomer[] getResidentialCustomers(Scanner scanner, Integer count) {
		ResidentialCustomer[] residentialCustomer = new ResidentialCustomer[count];
		for (int i = 0; i < count; i++) {
			scanner.nextLine();
			System.out.println("Input for residential customer :" + (i + 1));
			System.out.print("Enter Name : ");
			String name = scanner.nextLine();
			System.out.print("Enter Units Consumed : ");
			Double unitsConsumed = scanner.nextDouble();
			System.out.println("----------------------------------------");
			residentialCustomer[i] = new ResidentialCustomer(name, unitsConsumed);
		}
		return residentialCustomer;
	}

	public static CommercialCustomer[] getCommercialCustomers(Scanner scanner, Integer count) {
		CommercialCustomer[] commercialCustomer = new CommercialCustomer[count];
		for (int i = 0; i < count; i++) {
			scanner.nextLine();
			System.out.println("Input for Commercial customer :" + (i + 1));
			System.out.print("Enter Name : ");
			String name = scanner.nextLine();
			System.out.print("Enter Units Consumed : ");
			Double unitsConsumed = scanner.nextDouble();
			System.out.println("----------------------------------------");
			commercialCustomer[i] = new CommercialCustomer(name, unitsConsumed);
		}
		return commercialCustomer;
	}

}
