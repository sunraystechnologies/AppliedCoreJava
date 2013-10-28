package com.sunrays.thread;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class HelloWithoutThread {

	// Keeps Thraed Name
	String name = null;

	// Constructor
	public HelloWithoutThread(String threadName) {

		name = threadName;
	}

	public void run() { // TODO Auto-generated method stub

		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello Thread " + name);
		}

	}

}
