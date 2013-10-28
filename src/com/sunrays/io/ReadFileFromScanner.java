package com.sunrays.io;

import java.io.FileReader;
import java.util.Scanner;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 * Read line by line data from a text file by java.util.Scanner
 * 
 */

public class ReadFileFromScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("c:/newtest.txt");

		Scanner sc = new Scanner(reader);
		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}

		reader.close();

	}

}
