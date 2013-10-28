package com.sunrays.thread;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class HelloWithThread extends Thread {

	String name = null;

	public HelloWithThread(String threadName) {
		super(threadName);
		name = threadName;
	}

	public void run() {

		for (int i = 0; i < 500; i++) {
			System.out.println(i + " Hello Thread " + name);
		}

	}

}
