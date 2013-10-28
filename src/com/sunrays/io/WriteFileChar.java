package com.sunrays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 */

public class WriteFileChar {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		for (int i = 0; i < 5; i++) {
			writer.write(i + '1');
		}

		writer.close();

		System.out.println("DONE");

	}

}
