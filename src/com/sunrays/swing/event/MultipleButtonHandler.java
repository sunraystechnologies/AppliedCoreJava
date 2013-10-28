package com.sunrays.swing.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class MultipleButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		
		Date d = new Date();
		
		Object source = event.getSource();
		JButton button = (JButton)source;
		
		System.out.println("You have Clicked Button : " + button.getText());

	}

}
