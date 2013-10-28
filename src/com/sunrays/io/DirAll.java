package com.sunrays.io;

import java.io.File;
import java.util.List;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 * Lists files & subdirectories of a folders
 */
public class DirAll {

	public static void main(String[] args) {
		File directory = new File("C:/temp");
		String[] list = directory.list();

		for (int i = 0; i < list.length; i++) {

			System.out.println((i + 1) + " : " + list[i]);
		}
	}

}
