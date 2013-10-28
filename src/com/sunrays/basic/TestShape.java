package com.sunrays.basic;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestShape {

	public static void main(String[] args) {
		testCircle();
		//testTriangle();
		
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
