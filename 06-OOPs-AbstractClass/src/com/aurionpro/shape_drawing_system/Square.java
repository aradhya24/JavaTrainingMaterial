package com.aurionpro.shape_drawing_system;

public class Square extends Shape {

	public Square(String shapeName) {
		super(shapeName);
	}

	@Override
	void draw() {
		System.out.println("Drawing " + shapeName + "........");
	}

}
