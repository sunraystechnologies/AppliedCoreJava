package com.sunrays.thread;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class HelloWithRunnableThread extends Object implements Runnable  {

	String name = null;
	public HelloWithRunnableThread(String threadName) {
		
		name = threadName;
	}

	public void run() { // TODO Auto-generated method stub
		try{
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello Runnable Thread " + name);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
