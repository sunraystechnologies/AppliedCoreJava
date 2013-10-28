package com.sunrays.thread;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestWithoutThread {

	public static void main(String[] args) {

		HelloWithoutThread t1 = new HelloWithoutThread("1");

		t1.run();

		HelloWithoutThread t2 = new HelloWithoutThread("2");

		t2.run();

	}

}
