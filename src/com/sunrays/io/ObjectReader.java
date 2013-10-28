package com.sunrays.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.sunrays.dto.Employee;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 */

public class ObjectReader {

	public static void main(String[] args) throws Exception {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"c:/object.ser"));

		Employee emp = (Employee) in.readObject();

		System.out.println("ID : " + emp.getId());
		System.out.println("F Name : " + emp.getFirstName());
		System.out.println("L Name : " + emp.getLastName());
		System.out.println("Temp Value: " + emp.getTempValue());
		
		in.close();

	}

}
