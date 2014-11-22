package com.sunrays.iface;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

/**
 * Contains Dropdown list interface methods. City, University implements this
 * inteface to make a drop down list
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author SUNRAYS Developer
 * @Copyright (c) sunRays Technologies. All rights reserved.
 * @URL www.sunrays.co.in
 */

public interface DropDownList {

	/**
	 * Key of the List
	 * 
	 * @return
	 */
	public String getKey();

	/**
	 * Value of the List
	 * 
	 * @return
	 */
	public String getValue();

}
