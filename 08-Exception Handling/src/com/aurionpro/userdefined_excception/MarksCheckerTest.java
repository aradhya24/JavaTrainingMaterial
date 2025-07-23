package com.aurionpro.userdefined_excception;

public class MarksCheckerTest {
	
	public static void marksChecker(int marks) throws MarksException {
		if(marks < 35) {
			throw new MarksException();
		}
		System.out.println("Pass");
	}

	public static void main(String[] args){
          
		try {
			marksChecker(34);
		}
		catch(MarksException e) {
			e.printStackTrace();
		}
		
	}

}
