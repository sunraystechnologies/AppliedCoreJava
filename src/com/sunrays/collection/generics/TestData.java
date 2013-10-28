package com.sunrays.collection.generics;

/**
 * Test Generic class Data. It creates two Data objects 
 * one holds Integer and second holds String value
 *  
 * @see Data
 *
 * @author SUNRAYS Developer
 * @URL : www.sunrays.co.in
 * 
 * Copyright (c) sunRays Technologies. All rights reserved.
 */

public class TestData {

	public static void main(String[] args) {

		// Create a Data<Integer> object and assign Integer value 786.
		Data<Integer> iOb = new Data<Integer>(786);

		iOb.showType(); // Show the type of data used by iOb.

		int v = iOb.getob(); // No type cast is required.

		System.out.println("Value: " + v);

		// Create a Data object for Strings.
		Data<String> strOb = new Data<String>("Vijay");

		strOb.showType(); // Show Type

		String str = strOb.getob(); // No type cast

		System.out.println("value: " + str);
	}
}
