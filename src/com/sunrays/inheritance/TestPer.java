package com.sunrays.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestPer {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setDob("7/7/7");

		System.out.println(e.getDob());

		Date d = new Date();

		System.out.println(d);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");

		String str = dateFormat.format(d);

		System.out.println(str);

	}

}
