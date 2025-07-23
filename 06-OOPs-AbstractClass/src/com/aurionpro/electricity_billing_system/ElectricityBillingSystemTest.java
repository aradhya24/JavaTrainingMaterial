package com.aurionpro.electricity_billing_system;

import java.util.Scanner;

public class ElectricityBillingSystemTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.print("Choose 1 -> Residential Billing | 2 -> Commercial Billing | 3 -> EXIT F: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter number of Bill to be recorded : ");
				int count = scanner.nextInt();
				ResidentialCustomer[] residentialCustomers = InputService.getResidentialCustomers(scanner, count);
				BillingService.printAllBills(residentialCustomers);
				break;

			case 2:
				System.out.println("Enter number of Bill to be recorded : ");
				count = scanner.nextInt();
				CommercialCustomer[] commercialCustomers = InputService.getCommercialCustomers(scanner, count);
				BillingService.printAllBills(commercialCustomers);
				break;

			case 3:
				System.out.println("System Exited..........");
				return;

			default:
				System.out.println("Entered wrong choice !! , Enter again....");
			}
		}
	}
}
