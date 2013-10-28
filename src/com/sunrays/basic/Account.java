package com.sunrays.basic;

public class Account implements Cloneable {

	public int accountId;

	public double balance;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
