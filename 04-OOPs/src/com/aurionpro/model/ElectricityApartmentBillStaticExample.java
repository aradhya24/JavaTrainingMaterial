package com.aurionpro.model;

public class ElectricityApartmentBillStaticExample {
	private int apartmentNumber;
	private double unitsConsumed;
	private static double costPerUnit;

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public static double getCostPerUnit() {
		return costPerUnit;
	}

	public static void setCostPerUnit(double costPerUnit) {
		ElectricityApartmentBillStaticExample.costPerUnit = costPerUnit;
	}

	public double calculateBillAmount(double unitsConsumed) {
		return (unitsConsumed * costPerUnit);
	}

	public void diplayIndivdualBill(ElectricityApartmentBillStaticExample individualBill) {
		System.out.println("\n\n---------- Bill Summary ------------");
		System.out.println("Apartment Number : " + individualBill.getApartmentNumber());
		System.out.println("Current rate of units : Rs " + individualBill.getCostPerUnit());
		System.out.println("Units Consumed : " + individualBill.getUnitsConsumed());
		System.out.println(
				"Total bill amount : Rs " + individualBill.calculateBillAmount(individualBill.getUnitsConsumed()));
	}

}
