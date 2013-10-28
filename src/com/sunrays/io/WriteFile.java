package com.sunrays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 */

public class WriteFile {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		PrintWriter printWriter = new PrintWriter(writer);

		for (int i = 0; i < 5; i++) {
			printWriter.println(i + " : Line");
		}

		printWriter.flush();

		printWriter.close();
		writer.close();

		System.out.println("DONE");

	}

}
