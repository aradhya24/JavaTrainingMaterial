package com.aurionpro.banking_domain;

public class CurrentAccount implements IAccountOperations {
    
	 Double amount = 0.0;
	
	@Override
	public void deposit(Double amount) {
		this.amount += amount;
		System.out.println("Amount of Rs. " + amount + " deposited sucessfully...");
	}

	@Override
	public void withdraw(Double amount) {
		if(this.amount >= amount) {
			this.amount -= amount;
			System.out.println("Amount of Rs. " + amount + " withdrawn sucessfully...");
			return;
		}
		System.out.println("Balance is insufficent !!!!!!!!");
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Account balance : " + amount);
	}

}
