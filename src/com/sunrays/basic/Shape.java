package com.sunrays.basic;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Shape {

	protected String color = null;

	private int borderWidth = 0;

	public Shape() {
		System.out.println("This is Default Constructor");
	}

	public Shape(String name) {
		System.out.println(" You passed " + name + " in constructor");
	}

	public Shape(String c, int w) {
		color = c;
		borderWidth = w;
		System.out.println("Cunstructor :  Color is " + c);
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double area() {
		return 0;
	}
}
