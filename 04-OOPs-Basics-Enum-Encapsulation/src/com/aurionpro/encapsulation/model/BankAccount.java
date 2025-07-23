package com.aurionpro.encapsulation.model;

public class BankAccount {
    private long accountNumber;
    private String holderName;
    private double balance;
    
    public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(long accountNumber , String holderName , double balance) {
    	this.accountNumber = accountNumber;
    	this.holderName = holderName;
    	this.balance = balance;
    }
    
    public void checkBalance() {
    	System.out.println("Account holder name : " + holderName + ", Acc No : " + accountNumber + "\nCurrent Balance : " + balance) ;
    }
    
    
    public boolean withdraw(double amount) {
    	if(balance >= amount) {
    		return true;
    	}
    	return false;
    }
    
    
}
