package com.sunrays.basic;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class MyMath {

	public static void main(String[] args) throws Exception {

		int ch = System.in.read();
		System.out.println("Selected ASCII Code " + ch);

		if (ch == 'A' || ch == 'a') {
			Add.main(args);
		} else if (ch == 'D' || ch == 'd') {
			Division.main(args);
		} else {
			System.out.println("Incorrect Choice ");
		}
	}

}
