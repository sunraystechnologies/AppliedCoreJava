package com.sunrays.oop;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Circle extends Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {

		return 3.14* radius* radius;
	}

}
