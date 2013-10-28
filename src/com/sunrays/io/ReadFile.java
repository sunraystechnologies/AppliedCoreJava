package com.sunrays.io;

import java.io.FileReader;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 * Read charter by charter data from a text file 
 * 
 */

public class ReadFile {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("c:/test.txt");

		int ch = reader.read();
		char chr;

		while (ch != -1) {

			chr = (char) ch;
			System.out.print(chr);
			ch = reader.read();
		}

		reader.close();
	}

}
