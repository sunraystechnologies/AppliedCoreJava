package com.sunrays.applet;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusHandler extends FocusAdapter {

	public void focusGained(FocusEvent arg0) {
		System.out.println("Focus Gained!");

	}

}
