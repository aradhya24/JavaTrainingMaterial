	package com.aurionpro.lambda_expression_example;
	
	public class StudentTest {
	
		public static void main(String[] args) {
			
				String message = "Hello Aradhya...";
				
				IStudent student = ( msg1 ,msg2) -> msg1 + msg2;
				
				System.out.println("Message : " + student.greet(message,message));
		}
	
	}
