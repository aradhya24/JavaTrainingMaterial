package com.aurionpro.inheritance.test;
import com.aurionpro.inheritance.model.Bike;
import com.aurionpro.inheritance.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		Bike bike = new Bike();
		
		
		car.features();
		car.start();
		bike.features();
		bike.start();

	}

}
