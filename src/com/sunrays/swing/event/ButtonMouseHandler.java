package com.sunrays.swing.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class ButtonMouseHandler implements MouseListener {

	public void mouseClicked(MouseEvent event) {
		System.out.println("Mouse Clicked");

	}

	public void mouseEntered(MouseEvent event) {
		System.out.println("Mouse Enetred");

	}

	public void mouseExited(MouseEvent event) {
		System.out.println("Mouse Exit");

	}

	public void mousePressed(MouseEvent event) {
		System.out.println("Mouse Pressed");

	}

	public void mouseReleased(MouseEvent event) {
		System.out.println("Mouse Released");

	}

}
