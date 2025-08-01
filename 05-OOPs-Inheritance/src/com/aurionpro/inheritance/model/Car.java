package com.aurionpro.inheritance.model;

public class Car extends Vehicle{
	
	private String fuelType;
	private int numSeats;
	
	
	
	
	
	
	
	
      public void features() {
    	  //super.start();
    	  System.out.println("four wheeler with Ac");
      }
      @Override
      public void start() {
   	   System.out.println("Car Started");
      }
}
