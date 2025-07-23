package com.aurionpro.userdefined_excception;

public class MarksException extends Exception {
      
	public MarksException() {
		System.out.println("Fail!!!!!!!");
	}
	
	public MarksException(String message) {
		super(message);
	}
	
}
