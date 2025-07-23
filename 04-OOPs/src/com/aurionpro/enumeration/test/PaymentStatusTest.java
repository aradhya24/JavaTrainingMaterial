package com.aurionpro.enumeration.test;

import java.util.Scanner;

import com.aurionpro.enumeration.model.PaymentStatus;



public class PaymentStatusTest {
	
	public static void getPaymentStatus(PaymentStatus paymentStatus) {
		switch (paymentStatus) {

		case SUCCESS:
			System.out.println("Payment is Succesfull");
			break;

		case FAILED:
			System.out.println("Payment is Failed");
			break;

		case CANCELLED:
			System.out.println("Payment is Cancelled");
			break;
		case PENDING:
			System.out.println("Payment is pending");
			break;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
 
		
		System.out.print("Enter Payement Status \n FAILED , PENDING , SUCCESS, CANCELLED  :  ");
		String input = scanner.nextLine().toUpperCase();

		getPaymentStatus(PaymentStatus.valueOf(input));
		

	}

}
