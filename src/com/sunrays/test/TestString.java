package com.sunrays.test;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "This is Java, Java is JOB oriented language";
		String url = "www.yahoo.com";

		System.out.println(" Java search from start " + str.indexOf("Java"));
		System.out.println(" Java search from End " + str.lastIndexOf("Java"));
		System.out.println(" Check Suffix " + url + " is end with com ? "
				+ url.endsWith("com"));
	}
}
