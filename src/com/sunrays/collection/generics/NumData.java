package com.sunrays.collection.generics;

/**
 * Contains a number. Number is initialized by generic Constructor
 * 
 * @author SUNRAYS Developer
 * @URL : www.sunrays.co.in
 * 
 * Copyright (c) sunRays Technologies. All rights reserved.
 * 
 */
public class NumData {

	/**
	 * Contain numeric value
	 */
	private double val;

	/**
	 * Initialized by any numeric type including Integer, Float, or Double
	 * 
	 * @param <T> Generic Type parameter, upper bound is Number 
	 * @param arg
	 */
	<T extends Number> NumData(T arg) {
		val = arg.doubleValue();
	}

	void showval() {
		System.out.println("val: " + val);
	}

	public static void main(String[] args) {

		NumData num1 = new NumData(100); // Init by integer
		NumData num2 = new NumData(100.50); // Init by double value
		num1.showval();
		num2.showval();
	}

}
