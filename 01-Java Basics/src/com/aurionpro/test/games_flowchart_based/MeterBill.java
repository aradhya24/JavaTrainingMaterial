package com.aurionpro.test.games_flowchart_based;

public class MeterBill {
	public static void main(String[] args) {

		int numberOfUnitsConsumed = 261;
		int meterCharged = 75;
		int charges = 0;
		if (numberOfUnitsConsumed > 250) {
			charges = numberOfUnitsConsumed * 20;

		} else if (numberOfUnitsConsumed > 100) {
			charges = numberOfUnitsConsumed * 10;
		} else {
			charges = numberOfUnitsConsumed * 5;
		}
		System.out.println("Total Bill = " + (charges + meterCharged));
	}
}
