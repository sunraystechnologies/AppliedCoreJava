package com.sunrays.oop;

/**
 * Contains Shape attributes and its accessor methods. It is abstract because it
 * has abstract method area() that has only declaration not definition.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public abstract class Shape {

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
