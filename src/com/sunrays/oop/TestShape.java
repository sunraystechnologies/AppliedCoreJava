package com.sunrays.oop;

/**
 * Tests Shape class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public class TestShape {

	public static void main(String[] args) {
		testCircle();
		// testTriangle();

		Circle c = new Circle();
		Shape s = new Circle();

		Object o = new Circle();
		Object o1 = new Rectangle();

	}

	public static void testCircle() {
		Circle c = new Circle();
		c.setColor("Red");
		c.setBorderWidth(34);
		c.setRadius(3);

		System.out.println("Area is " + c.area());

	}

	public static void testTriangle() {
		Triangle t = new Triangle();
		t.setColor("Red");
		t.setBorderWidth(34);
		t.setBase(10);
		t.setHeight(100);

		System.out.println("Area is " + t.area());

	}

	public static void testShape() {

		Shape s = null; // Declaration
		// s = new Shape("Triangle"); // Instantiation
		s = new Circle();// Instantiation

		s.setColor("Lal");

		s.area();

		System.out.println("---------------");
		s.setColor("Red");
		// s.setBorderWidth(3);

		System.out.println(s.getBorderWidth());
	}
}
