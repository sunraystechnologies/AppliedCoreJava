package com.sunrays.io;

import java.io.FileReader;
import java.io.IOException;

/*
 * copyright (c) sunRays Technologies Indore
 * www.sunrays.co.in
 * @author: sunRays Developer
 * 
 * Count a particular character in a text file
 */

public class CharCounter {

	public static void main(String[] args) throws IOException {

		FileReader in = new FileReader("xanadu.txt");

		// Count charter 'e' in a file
		int cr = 'e';

		int count = 0;

		int c = 0;
		while ((c = in.read()) != -1) {
			if (c == cr) {
				count++;
			}
		}

		System.out.println("Chart Count is : " + count);
	}

}
