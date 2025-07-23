package com.aurionpro.shape_drawing_system;

public class Triangle extends Shape {

	public Triangle(String shapeName) {
		super(shapeName);
	}

	@Override
	void draw() {
		System.out.println("Drawing " + shapeName + "........");
	}

}
