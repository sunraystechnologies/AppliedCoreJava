package com.sunrays.io;

import java.io.FileReader;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 * Reads char from a file and displays at Console
 * 
 */

public class Type {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader(args[0]);

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
