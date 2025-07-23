package com.aurionpro.shape_drawing_system;

public class ShapeDrawingSystemTest {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];

		shape[0] = new Circle("Circle");
		shape[1] = new Square("Square");
		shape[2] = new Triangle("Triangle");

		for (int i = 0; i < shape.length; i++) {
			shape[i].draw();
		}

	}

}
