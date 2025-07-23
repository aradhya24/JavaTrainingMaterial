package com.aurionpro.inheritance.vehicle_mgmt_multilvl;

public class Vehicle {
	
	private String brand;
	private String model;
	private double speed;
	public Vehicle(String brand, String model, double speed) {
//		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}
	
	public void accelerate() {
		System.out.println("to increase speed");
	}
	public void brake() {
		System.out.println("to reduce speed");
	}
	public void displayInfo(){
		
		System.out.println("Brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("speed : " + speed + " km/h");
	}
	
	

	
}
