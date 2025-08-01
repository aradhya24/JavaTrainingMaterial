package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = scanner.nextDouble();
        System.out.println();
        Circle circle = new Circle(radius);
        System.out.print("Area of Circle is : " + circle.calculateArea());
	}

}
