package com.aurionpro.inheritance.model;

public class Bike extends Vehicle{
	
	public void features() {
     // super.start();
  	  System.out.println("Two Wheeler with helmet");
    }
	
	 @Override
	 public void start() {
  	   System.out.println("Bike Started");
     }
}
