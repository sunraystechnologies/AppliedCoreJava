package com.sunrays.test;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			authenticat("sinrays", "sun");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void authenticat(String id, 
			String pwd)
			throws UserNotFoundException {

		if (!id.equals(pwd)) {
			throw new UserNotFoundException();
		}
	}

}
