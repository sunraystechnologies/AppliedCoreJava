package com.sunrays.iface;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class TestBusinessMan {

	public static void main(String[] args) {
		
		BusinessMan bm = new BusinessMan();
	
		RichMan rm = new BusinessMan();
		rm.donation();
		
		SocialWorker sw = new BusinessMan();
		
		BusinessMan bm1 = (BusinessMan)sw;
		
		
		
		

	}

}
