package com.sunrays.oop;


/**
 * Contains Employee attributes and overloaded constructors to initialize
 * attributes. This is Child of Perosn class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public class Employee extends Person {

	private String designaiton = null;

	protected String dateOfJoining = null;

	public Employee() {
		super();
		System.out.println("****Employee Default Constructor");
	}

	public Employee(String fn, String ln, String des) {

		super(fn, ln);

		designaiton = des;

		System.out.println("****Employee 3 param  Constructor");

	}

	public String getDesignaiton() {
		return designaiton;
	}

	public void setDesignaiton(String designaiton) {
		this.designaiton = designaiton;
	}

	public void changeAddress() {
		System.out.println("*****");
		super.changeAddress();
		System.out.println("Employee's changeAddress method");
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
