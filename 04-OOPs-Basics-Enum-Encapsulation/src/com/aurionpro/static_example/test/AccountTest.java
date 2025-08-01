package com.aurionpro.static_example.test;

public class AccountTest {
	private int accountNumber;
	static private String bankName;
	
	public static void main(String[] args) {
		AccountTest account1 = new AccountTest();
		AccountTest account2 = new AccountTest();
		
		account1.accountNumber = 1234;
		bankName = "SBI";
		account2.accountNumber = 4321;
		
		System.out.println("Account1 ACC no : " + account1.accountNumber);
		System.out.println("Account1 bankName : " + bankName);
		System.out.println("Account2 ACC no : " + account1.accountNumber);
		System.out.println("Account2 bankName : " + bankName);
		
		bankName = "BOB";
		System.out.println("Account1 ACC no : " + account1.accountNumber);
		System.out.println("Account1 bankName : " + bankName);
		System.out.println("Account2 ACC no : " + account1.accountNumber);
		System.out.println("Account2 bankName : " + bankName);
		
	}
}
