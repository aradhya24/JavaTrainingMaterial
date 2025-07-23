package com.aurionpro.model;

public class Circle {

	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		double area = 3.14*3.14*radius*radius;
		return area;
	}
	 
}
