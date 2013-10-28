package com.sunrays.enumpk;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public enum Human {

	KID(10), MAN(50), OLDMAN(70);

	private final int weight;

	Human(int w) {
		this.weight = w;
	}

	public void display() {
		System.out.println(weight);
	}
}