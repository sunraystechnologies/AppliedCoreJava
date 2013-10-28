package com.sunrays.inheritance;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Person {

	protected String firstName = null;

	protected String lastName = null;

	protected String address = null;

	protected String dob = null;
	
	public Person() {
		System.out.println("***Person Default Constructor");
	}

	public Person(String fn, String ln) {
		
		System.out.println("***Person 2 param constroctor");

		firstName = fn;
		lastName = ln;
	}

	public Person(String fn, String ln, String address) {
		
/*		firstName = fn;
		lastName = ln;*/
		
		this(fn,ln);
		
		this.address = address;
		
		System.out.println("***Person 3 param constroctor");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void changeAddress() {
		System.out.println("Person ka change Address");
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	

}
