package com.sunrays.basic;

import com.sun.org.apache.bcel.internal.generic.GOTO;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class HelloGotoJava {

	static String name = "Swati";

	public static void main(String[] args) {
		int i = 0;
		Label: System.out.println("Hello Java" + name);
		if(i<5){
			System.out.println("Inside " + i);
			i++;
			GOTO Label;
		}
		

	}

	public static void main1(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello Java" + name);
		}
	}

}
