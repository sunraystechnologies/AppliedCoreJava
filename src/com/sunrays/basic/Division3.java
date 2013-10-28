package com.sunrays.basic;

/**
 * Java training example source code developed by sunRays Technologies, Indore
 * Copyright (c) 2008 sunRays Technologies
 * @date 08/08/08
 * @version 1.0
 * @author sunRays Developer
 * 
 */
public class Division3 {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		double div = getDivision(a, b);

		System.out.println("Division is " + div);

	}

	public static double getDivision(int a, int b) {

		double div = a / b;

		return div;

	}
}
