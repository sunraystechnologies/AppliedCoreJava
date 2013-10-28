package com.sunrays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 * Copy a Binary File
 */

public class CopyBin {

	public static void main(String[] args) throws Exception {

		String source = "c:/abc.jpg";
		String target = "c:/123.jpg";

		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);

		int ch = reader.read();

		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();
		}

		writer.close();
		reader.close();
		System.out.println(source + " is copied to " + target);

	}

}
