package com.sunrays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: Sunil Sahu
 * @url : www.sunrays.co.in
 *
 */

public class CopyCon {


	public static void main(String[] args) throws Exception {

		String target= "c:/temp.txt";

		FileWriter writer = new FileWriter(target);

		PrintWriter printWriter = new PrintWriter(writer);

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line = bufferedReader.readLine();

		while (!line.equals("quit")) {

			printWriter.println(line);
			line = bufferedReader.readLine();
		}

		writer.close();
		printWriter.close();
		inputStreamReader.close();

	}

}
