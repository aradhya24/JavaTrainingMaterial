package com.aurionpro.example;

public class NestedTryCatch {

	public static void main(String[] args) {
         
		int[] array = new int[2];
		array[1] = 10;
		try {
			array[1] /= 0;
			try {
				System.out.println(array[5]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inner Block :" + e);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Outer Block : " + e);
		}
		
	}

}
