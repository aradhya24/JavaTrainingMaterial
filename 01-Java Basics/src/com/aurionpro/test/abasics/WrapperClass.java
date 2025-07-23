package com.aurionpro.test.abasics;

public class WrapperClass {
	public static void main(String[] args) {

		int number1 = 10;
		Integer number2 = new Integer (number1);  //boxing
		Integer number3 = number1;        //autoboxing
		System.out.println("Number2 : " + number2);
		System.out.println("Number3 : " + number3);
		
		int number4 = number2.intValue();     //unboxing
		int number5 = number2;                //auto unboxing
		System.out.println("Number4 : " + number4);
		System.out.println("Number5 : " + number5);
		

	}
}
