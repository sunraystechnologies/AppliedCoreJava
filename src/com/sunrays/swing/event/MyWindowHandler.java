package com.sunrays.swing.event;

import java.awt.event.WindowEvent;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class MyWindowHandler extends MyWindowAdapter
{
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Window Deactiveted");
	}

	
}
