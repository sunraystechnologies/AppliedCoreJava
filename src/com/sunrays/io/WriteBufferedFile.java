package com.sunrays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 */

public class WriteBufferedFile {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("c:/newtest.txt");

		BufferedWriter printWriter = new BufferedWriter(writer);

		for (int i = 0; i < 5; i++) {
			printWriter.write(i + " : Line\n");
		}

		printWriter.flush();

		printWriter.close();
		writer.close();

		System.out.println("DONE");

	}

}
