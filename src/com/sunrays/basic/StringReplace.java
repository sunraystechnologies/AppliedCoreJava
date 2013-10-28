package com.sunrays.basic;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Google";
		
		System.out.println(str.indexOf("Google"));
		
		String newStr = str.replace("Google", "Sunrays");
		
		System.out.println(newStr);

	}

}
