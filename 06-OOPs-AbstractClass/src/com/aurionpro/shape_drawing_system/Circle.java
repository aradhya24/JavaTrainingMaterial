package com.aurionpro.shape_drawing_system;

public class Circle extends Shape {

	public Circle(String shapeName) {
		super(shapeName);
	}

	@Override
	void draw() {
	    System.out.println("Drawing " + shapeName + "........");
	}

}
