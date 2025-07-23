package com.aurionpro.banking_domain;

public class SavingAccount implements IAccountOperations {
	
	
	Double amount = 0.0;
																																																																																				
	@Override									
	public  void deposit(Double amount) {
		this.amount += amount;
		System.out.println("Amount Rs " + amount + " deposited successfully...." );
	}

	@Override
	public void withdraw(Double amount) {
		
		if(amount > 10000) {
			System.out.println("Can't withdraw amount , Limit is Rs 10000/-");
			return;
		}
		
		if(this.amount >= amount) {
			this.amount -= amount;
			System.out.println("Amount of Rs. " + amount + " withdrawn sucessfully...");
			return;
		}
		System.out.println("Balance is insufficent !!!!!!!!ss");
	}																											

	@Override
	public void checkBalance() {
		System.out.println("Saving Account balance : " + amount);
	}

}
