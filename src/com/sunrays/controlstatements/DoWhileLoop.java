package com.sunrays.controlstatements;

/**
 * Example class for DO-WHILE loop
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public class DoWhileLoop {

	public static void main(String[] args) {

		// Declare local variable i
		int i = 0;

		// Execute loop till i is less than 5
		do {
			System.out.println(i + " Hello Do While");
			i++;
		} while (i < 5);
	}
}
