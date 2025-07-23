package com.aurionpro.banking_domain;

public class LoanAccount implements IAccountOperations {

	public static Double amount = 0.0;
	
	@Override
	public void deposit(Double amount) {
		System.out.println("Loan Account do not allow deposit");
	}

	@Override
	public void withdraw(Double amount) {
		
		if(amount > (10000 + LoanAccount.amount)) {
			System.out.println("Can't approve loan , Your are eligible for Rs. " + (10000 + LoanAccount.amount) + " loan only..");
			return;
		}
		
		if((10000 + LoanAccount.amount) >= amount) {
			System.out.println("Rs. " + amount + " loan is sanctioned successfully ....");
			LoanAccount.amount -= amount;
			return;
		}
		System.out.println("Balance is insufficent !!!!!!!!");
	}

	@Override
	public void checkBalance() {
		System.out.println("Loan Outstanding amount : " + LoanAccount.amount);
		System.out.println("\nLoan Remaining amount : " + (10000 + LoanAccount.amount));
	}

}
