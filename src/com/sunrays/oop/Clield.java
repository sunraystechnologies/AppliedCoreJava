package com.sunrays.oop;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Clield extends Parent {

	private String att = "Val Clield";

	public Clield() {
		// TODO Auto-generated constructor stub
	}

	public String getAtt() {
		return this.att;
	}

	public static void main(String[] args) {
		Clield clield = new Clield();

		System.out.println(clield.getAtt());
	}
}
