package com.sunrays.test;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float a = 5;
		float b = 10;
		System.out.println(" Max of " + a + " and " + b + " is " + Math.max(a,b));
		System.out.println(" Min of " + a + " and " + b + " is " + Math.min(a,b));
		
		double randNo = Math.random();
		
		int no = (int)(randNo* 100);
		
		System.out.println("Random numnber between 0 and 100 is " + no);
		
		
		
	}

}
