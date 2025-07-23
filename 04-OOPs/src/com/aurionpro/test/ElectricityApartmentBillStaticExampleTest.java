package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ElectricityApartmentBillStaticExample;

public class ElectricityApartmentBillStaticExampleTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("------FOR GOVERNMENT USER ONLY-------");
		System.out.print("\nEnter the cost per unit : Rs ");
		double costPerUnit = scanner.nextDouble();
		ElectricityApartmentBillStaticExample.setCostPerUnit(costPerUnit);
		System.out.println();

		System.out.println("-----------------------------------------------");
		System.out.print("Enter the number of Bills to added : ");
		int numberOfBills = scanner.nextInt();
		System.out.println();

		ElectricityApartmentBillStaticExample[] electricityApartmentBill = new ElectricityApartmentBillStaticExample[numberOfBills];

		for (int i = 0; i < numberOfBills; i++) {

			scanner.nextLine();
			System.out.println("\nEnter " + (i + 1) + " Apartments details :");

			System.out.print("Enter Apartment Number :");
			int apartmentNumber = scanner.nextInt();

			System.out.print("Enter Units Consumed :");
			double unitsConsumed = scanner.nextDouble();

			electricityApartmentBill[i] = new ElectricityApartmentBillStaticExample();

			electricityApartmentBill[i].setApartmentNumber(apartmentNumber);
			electricityApartmentBill[i].setUnitsConsumed(unitsConsumed);
			System.out.println("-----------------------------------------------");
		}

		for (ElectricityApartmentBillStaticExample bill : electricityApartmentBill) {
			bill.diplayIndivdualBill(bill);
		}
	}

}
