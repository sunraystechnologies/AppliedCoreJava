package com.sunrays.iface;

/**
 * Test different views of Businessman
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public class TestBusinessMan {

	public static void main(String[] args) {

		// Seeing Businessman as a Richman so can access only methods of
		// Richman.
		Richman rm = new Businessman();
		rm.donation();
		rm.earnMony();
		rm.party();

		// Seeing Businessman as a Social Worker so can access only methods of
		// SocialWorker
		SocialWorker sw = new Businessman();
		sw.helpToOthers();

		Businessman bm = new Businessman();
		// Can access all methods
		bm.donation();
		bm.earnMony();
		bm.party();
		bm.helpToOthers();
		bm.setName("Dhirubhai Ambani");
		System.out.println(bm.getName());

	}
}
