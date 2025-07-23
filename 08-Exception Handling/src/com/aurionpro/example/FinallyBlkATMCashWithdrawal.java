package com.aurionpro.example;

import java.util.Scanner;

public class FinallyBlkATMCashWithdrawal {

	public static void main(String[] args) {
		
		int amount = 10000;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount to withdrawn : ");
		int witdrawAmount = scanner.nextInt();
		
		try {
			if(witdrawAmount >= amount) {
				throw new ArithmeticException("Arithmetic exception");
			}
			else {
				amount -= witdrawAmount;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Transaction Session Ended");
		}

	}

}
