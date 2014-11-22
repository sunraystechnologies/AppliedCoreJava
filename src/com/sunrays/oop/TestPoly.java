package com.sunrays.oop;

/**
 * Tests polymorphism achieved by method overriding.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public class TestPoly {

	public static void main(String[] args) {

		/**
		 * Shape array contains multiple shapes
		 */
		Shape[] s = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		double totalArea = calcArea(s);

		System.out.println(totalArea);
	}

	/**
	 * Calculates total area of all Shapes
	 * 
	 * @param s
	 * @return
	 */
	public static double calcArea(Shape[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			// Selects dynamic method definition. Achieve polymorphism.
			totalArea = s[i].area();
		}
		return totalArea;
	}

	/**
	 * Achieve polymorphism by parent return type
	 * 
	 * @param i
	 * @return
	 */
	public static Shape getShape(int i) {

		if (i == 1)
			return new Rectangle();
		if (i == 1)
			return new Circle();
		if (i == 1)
			return new Triangle();

		return null;
	}

}
