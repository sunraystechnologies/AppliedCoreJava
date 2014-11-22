package com.sunrays.oop;

/**
 * Contains Triangle attributes and Child of Shape class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public class Triangle extends Shape {

	private int base = 0;
	private int height = 0;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		return (base * height) / 2;
	}

}
