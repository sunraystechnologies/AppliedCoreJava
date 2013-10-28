package com.sunrays.basic;

/**
 * Java training example source code developed by sunRays Technologies, Indore
 * Copyright (c) 2008 sunRays Technologies
 * 
 * @date 08/08/08
 * @version 1.0
 * @author sunRays Developer
 * 
 */

public class MySystem {
	
	/**
	 * Launch and native application notepad.exe
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String[] args)throws Exception{
		Runtime.getRuntime().exec("notepad.exe");
	}

}
