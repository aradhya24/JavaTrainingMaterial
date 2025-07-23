package com.aurionpro.example;

import java.util.Scanner;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
         
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age : ");
		
		try {
			int age = scanner.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println(arrayIndexOutOfBoundsException);
		}
		catch(NullPointerException nullPointerException) {
			System.out.println(nullPointerException);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block Executed....");
		}
		
		
	}

}
