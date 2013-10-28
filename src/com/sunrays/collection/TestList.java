package com.sunrays.collection;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestList {

	public static void main(String[] args) {
		String[] strList = new String[5];

		for (int i = 0; i < 5; i++) {
			strList[i] = "#" + (i + 1);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(strList[i]);
		}

	}

}
