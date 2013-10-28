package com.sunrays.test;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Test {
	public static void main(String[] args) {

		int k = 5;
		String name = "Vikay"; // Dinanath Chohan";
		try {
			System.out.println(name.charAt(6));
			System.out.println(name.length());

			int i = 15 / k;
			System.out.println(i);
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("-->" + e.getMessage());
			System.out.println("String abhi choti he");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("Cought by Parent" + e.getMessage());
		} finally {
			System.out.println("This is Finally");
		}
		System.out.println("Exiting Main");
	}

}
