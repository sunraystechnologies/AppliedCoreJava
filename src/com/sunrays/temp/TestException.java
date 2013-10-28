package com.sunrays.temp;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestException {

	public static void main(String[] args) {
		/*
		 * int i = 0; int k = 15 / i; System.out.println("Result is " + k);
		 */

		String name = "VIjay Dinanth Chohan";
		char ch = 0;
		try {
			System.out.println("Length is " + name.length());
			ch = name.charAt(6);
		} catch (NullPointerException e) {
			System.out.println("Name can not be null");
		} catch (RuntimeException e) {
			System.out.println("Vijay ka pura nam kaya he");
		} finally{
			System.out.println("I am brahaman");
		}

		System.out.println("Char is " + ch);
	}
}
