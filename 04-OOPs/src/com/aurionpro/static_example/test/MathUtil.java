package com.aurionpro.static_example.test;

public class MathUtil {
	
	private static int add(int a , int b) {
		return a+b;
	}
	private static int subtract(int a , int b) {
		return a-b;
	}
	private static int multiply(int a , int b) {
		return a*b;
	}

	public static void main(String[] args) {

        int a = 10 ;
        int b = 5 ;
        
        System.out.println("Addition : " + add(a,b));
        System.out.println("Subtraction : " + subtract(a,b));
        System.out.println("Divide : " + multiply(a,b));

	}

}
