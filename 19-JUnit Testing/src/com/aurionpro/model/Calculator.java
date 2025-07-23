package com.aurionpro.model;

public class Calculator {
	
	public int addition(int a , int b) {
		return a+b;
	}
	
	public int subtraction(int a , int b) {
		return a-b;
	}
	
	
	public double division(double a , double b) {
		
		if(b == 0) {
			throw new ArithmeticException("Cant divide by zero");
		}
		
		return a/b;
	}

}
