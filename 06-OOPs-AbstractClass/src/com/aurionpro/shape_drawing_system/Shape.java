package com.aurionpro.shape_drawing_system;

public abstract class Shape {

	protected String shapeName;

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	abstract void draw();
}
