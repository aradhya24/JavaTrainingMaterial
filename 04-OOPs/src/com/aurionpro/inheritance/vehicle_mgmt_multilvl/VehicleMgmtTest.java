package com.aurionpro.inheritance.vehicle_mgmt_multilvl;

public class VehicleMgmtTest {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("Maruti", "Wagonr", 140);
		vehicle.displayInfo();
        System.out.println();
        
        
		Car car = new Car("Hyundai", "Creata", 210, "Petrol", 5);
		car.displayInfo();

		
		ElectricCar electricCar = new ElectricCar("Tata", "Nexon", 120, "EV", 5, 250.6, 4);
		electricCar.accelerate();
		electricCar.brake();
		electricCar.displayInfo();
	}

}
