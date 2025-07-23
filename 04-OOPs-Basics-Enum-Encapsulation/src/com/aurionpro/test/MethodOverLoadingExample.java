package com.aurionpro.test;

public class MethodOverLoadingExample {

	// Print

	public void print() {
		System.out.println("Default Message");
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(int num) {
		System.out.println(num);
	}

	
	
	
	
	// Area

	public int area(int side) {
		return side * side;
	}

	public int area(int length, int breadth) {
		return length * breadth;
	}

	public double area(double radius) {
		return (3.14 * radius * radius);
	}

	
	
	
	
	
	// Greet user

	public void greet() {
		System.out.println("Hello !!!");
	}

	public void greet(String name) {
		System.out.println("Hello !!! , " + name);
	}

	
	
	
	
	// add
	public int add(int number1, int number2) {
		return number1 + number2;
	}

	public double add(double number1, double number2) {
		return number1 + number2;
	}

	public int add(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

	
	
	
	
	
	// Temperature

	public double convert(double celsius) {
		return (celsius * 1.8) + 32;
	}

	public double convert(double value, String scale) {
		if (scale.equalsIgnoreCase("C")) {
			return (value * 1.8) + 32;
		}
		if (scale.equalsIgnoreCase("F")) {
			return (value - 32) * 0.55;
		}
		return 0.0;
	}
	
	
	
	
	

	// volume
	public int volume(int side) {
		return side * side * side;
	}

	public int volume(int length, int breadth, int height) {
		return length * breadth * height;
	}

	public double volume(double radius) {
		return (1.33 * 3.14 * radius * radius * radius);
	}

	
	
	
	
	// divide
	public double divide(int a, int b) {
		if (a == 0) {
			System.out.println("Invalid");
			return -1;
		}
		return (a / b);
	}

	public double divide(double a, double b) {
		if (a == 0) {
			System.out.println("Invalid");
			return -1;
		}
		return (a / b);
	}
	
	
	
	

	// Generate Bill

	public void generateBill(String item, double mrp, int qty) {
		System.out.println("-----------Bill-------------");
		System.out.println("Item name : " + item + " Price : " + mrp + " Qty : " + qty);
		System.out.println("Total Cost : " + mrp * qty);
	}

	public void generateBill(String item, double mrp, int qty, double discount) {
		System.out.println("-----------Bill-------------");
		System.out.println("Item name : " + item + " Price : " + mrp + " Qty : " + qty);
		discount = 0.05 * mrp * qty;
		System.out.println("5% Discount on MRP :  " + discount);
		System.out.println("Total Cost : " + (mrp * qty - discount));
	}

	public void generateBill(String item, double mrp, int qty, double discount, double tax) {
		System.out.println("-----------Bill-------------");
		System.out.println("Item name : " + item + " Price : " + mrp + " Qty : " + qty);
		discount = 0.05 * qty * mrp;
		System.out.println("5% Discount on MRP :  " + discount);
		tax = 0.02 * mrp * qty;
		System.out.println("2% Tax on MRP : " + tax);
		System.out.println("Total Cost : " + (mrp * qty - discount + tax));
	}
	
	
	
	

	// Attendance Marker
	public void markAttendance() {
		System.out.println("All students : Present");
	}

	public void markAttendance(String name) {
		System.out.println("Name : " + name + "  -> Present");
	}

	public void markAttendance(String[] names) {

		for (String name : names) {
			System.out.println("Name : " + name + "  -> Present");
		}
	}

	
	
	
	//Student Result Evaluation System
		
	public void evaluate(int marks) {
		System.out.println("Marks : " + marks);
		if (marks >= 90) {
			System.out.println("Excellant Marks");
		}
	}

	public void evaluate(int marks, int totalMarks) {
		System.out.println("Marks : " + marks + " / " + totalMarks);
		double percentage = ((double) marks / totalMarks) * 100;

		System.out.println("Percentage : " + percentage);
		if (percentage > 90) {
			System.out.println("Grade A");
		}
		if (percentage > 80 && percentage <= 90) {
			System.out.println("Grade B");
		}
		if (percentage > 60 && percentage <= 80) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");
		}
	}

	public void evaluate(String grade) {
		if (grade.equalsIgnoreCase("A")) {
			System.out.println(grade + " : Very Good");
		}
		if (grade.equalsIgnoreCase("B")) {
			System.out.println(grade + " : Good");
		} else {
			System.out.println(grade + " : Need Improvment");
		}
	}

	
	
	
	//Travel cost Estimator
	
	public void estimate(int distance) {
		System.out.println("\n-------------Estimation-----------------");
		System.out.println("Distance : " + distance + "  10Rs/km : " + distance * 10);
	}

	public void estimate(int distance, int passenger) {
		System.out.println("\n-------------Estimation-----------------");
		System.out.println(
				"Distance : " + distance + "  Passenger : " + passenger + "  10Rs/km : " + distance * 10 * passenger);
	}

	public void estimate(int distance, int passenger, boolean ac) {
		System.out.println("\n-------------Estimation-----------------");
		System.out.println("Distance : " + distance + "  10Rs/km : " + distance * 10);
		System.out.println("Passenger : " + passenger);
		System.out.println("AC : " + ac);
		if (ac) {

			System.out.println("Total Cost : " + (double) distance * 10 * passenger
					+ (((double) distance * 10 * passenger) * 0.2));
		}
	}

	
	
	
	//Ecommerce Discount System
	
	public void calculateDiscount(double price) {
		double discount = 0.05 * price;
		System.out.println("\n\n------------Bill-------------------");
		System.out.println("Price : " + price + " Discount is 5% : " + discount);
		System.out.println("Total Bill : " + (price - discount));
	}

	public void calculateDiscount(double price, String coupon) {
		double discount = 0.05 * price;
		System.out.println("\n\n------------Bill-------------------");
		System.out.println("Extra 10% off on Coupon");
		if (coupon.equalsIgnoreCase("SAVE10")) {
			discount = 0.1 * price;
		}
		System.out.println("Total Bill : " + (price - discount));
	}

	public void calculateDiscount(double price, String coupon, boolean isMember) {
		double discount = 0.05 * price;
		System.out.println("\n\n------------Bill-------------------");
		if (coupon.equalsIgnoreCase("SAVE10")) {
			System.out.println("Extra 10% off on Coupon");
			discount = 0.1 * price;
		}
		if (isMember) {
			System.out.println("Extra 5% off on MemberShip");
			discount = 0.2 * price;
		}
		System.out.println("Total Bill : " + (price - discount));
	}

	public static void main(String[] args) {

		MethodOverLoadingExample methodOverLoadingExample = new MethodOverLoadingExample();

//		  methodOverLoadingExample.print();
//        methodOverLoadingExample.print("Message");
//        methodOverLoadingExample.print(10);\

//		System.out.println("Area of Square: " + methodOverLoadingExample.area(10));
//		System.out.println("Area of Rectangle: " + methodOverLoadingExample.area(10, 20));
//		System.out.println("Area of Circle: " + methodOverLoadingExample.area(10.2));

//		 methodOverLoadingExample.greet();
//       methodOverLoadingExample.greet("Aradhya");

//		System.out.println("Addition: " + methodOverLoadingExample.add(10 ,20));
//		System.out.println("Addition: " + methodOverLoadingExample.add(10.5, 20.4));
//		System.out.println("Addition: " + methodOverLoadingExample.add(10 , 20 ,30));

//		System.out.println("C to F: " + methodOverLoadingExample.convert(28));
//		System.out.println("Temperature Conver sion: " + methodOverLoadingExample.convert(82.4	 , "F"));

//		System.out.println("Volume of Cube: " + methodOverLoadingExample.volume(10));
//		System.out.println("Volume of Cuboid: " + methodOverLoadingExample.volume(10, 20 , 30));
//		System.out.println("Volume of Sphere: " + methodOverLoadingExample.volume(10.2));

//		System.out.println("Divide: " + methodOverLoadingExample.divide(40 ,20));
//		System.out.println("Divide: " + methodOverLoadingExample.divide(40.5, 20.4));

//		
//		methodOverLoadingExample.generateBill("Pen", 10, 100);
//		methodOverLoadingExample.generateBill("Shirt", 150, 10, 5);
//		methodOverLoadingExample.generateBill("Pant", 500, 10, 0.05, 0.02);

//		methodOverLoadingExample.markAttendance();
//		methodOverLoadingExample.markAttendance("Aradhya Dange");
//		String[] names = {"Aradhya Dange" , "Om Rathod" , "Srusti Patane"};
//		methodOverLoadingExample.markAttendance(names);

//		methodOverLoadingExample.evaluate(92);
//		methodOverLoadingExample.evaluate(882, 1000);
//		methodOverLoadingExample.evaluate("B");

//		methodOverLoadingExample.estimate(12);
//		methodOverLoadingExample.estimate(14,10);
//		methodOverLoadingExample.estimate(15,5,true);
//		methodOverLoadingExample.calculateDiscount(100);
//		methodOverLoadingExample.calculateDiscount(1500, "SAVE10");
//		methodOverLoadingExample.calculateDiscount(1400, "SAVE10", true);
	}

}
