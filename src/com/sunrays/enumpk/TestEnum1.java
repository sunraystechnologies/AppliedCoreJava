package com.sunrays.enumpk;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestEnum1 {

	public static void main(String[] args) {

		Day[] ds = Day.values();
		
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
			System.out.println(ds[i].getWeekDay());
		}
		
		
	}

}
