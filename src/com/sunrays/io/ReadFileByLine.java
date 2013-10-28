package com.sunrays.io;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 * Read line by line data from a text file 
 * 
 */

public class ReadFileByLine {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("c:/test.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line = bufferedReader.readLine();

		while (line != null) {

			System.out.println(line);
			line = bufferedReader.readLine();
		}

	}
}
