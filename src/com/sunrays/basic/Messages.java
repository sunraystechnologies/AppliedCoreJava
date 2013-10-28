package com.sunrays.basic;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Messages {

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle("com.basic.messages");

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static void main(String args[]) {

		System.out.println("Name : " + getString("name"));
	}
}
