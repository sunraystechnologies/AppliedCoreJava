package com.sunrays.iface;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class City implements DropDownList {

	private int code = 0;

	private String name = null;

	private String state = null;
	
	public City(int code, String name, String state){
		
		this.code = code;
		this.name = name;
		this.state = state;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	public String getKey() {
		String key = "" + code; // String.valueOf(code);
		return key;
	}

	public String getValue() {
		String value = code + " - " + name;
		return value;
	}



}
