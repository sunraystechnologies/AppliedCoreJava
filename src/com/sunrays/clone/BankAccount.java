package com.sunrays.clone;

/**
 * Bank Account implements Cloneable interface to be part of Deep Cloning.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */

public class BankAccount implements Cloneable {

	/*
	 * Account ID
	 */
	public int accountId;

	/**
	 * Account Balance
	 */
	public double balance;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
