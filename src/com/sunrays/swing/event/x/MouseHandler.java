package com.sunrays.swing.event.x;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class MouseHandler extends MouseAdapter {

	public void mouseEntered(MouseEvent event) {
		System.out.println("Mouse Enetred");

	}

	public void mouseExited(MouseEvent event) {
		System.out.println("Mouse Exit");

	}

}
