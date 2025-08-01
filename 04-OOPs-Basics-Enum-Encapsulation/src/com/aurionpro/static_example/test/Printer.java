package com.aurionpro.static_example.test;

public class Printer {
	
	public static class Inner{
		
		void printMessage() {
			System.out.println("Nested Class Accessed............");
		}
		
		public static void main(String[] args) {
			
			Printer.Inner inner = new Inner();
			inner.printMessage();

		}
	}

	

}
;