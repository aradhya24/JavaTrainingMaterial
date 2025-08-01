package com.aurionpro.enumeration.test;

public class EnumSwitch {

	public static void main(String[] args) {
		
		Status s = Status.FAILED;	
		
		switch(s) {
		
		case RUNNING:
			System.out.println("All Good");
			break;
		
		case FAILED:
			System.out.println("Try Again");
			break;
			
		case PENDING:
			System.out.println("Please Wait");
			break;
			
		default :
			System.out.println("Done");
			break;
			
			
		}

	}

}
