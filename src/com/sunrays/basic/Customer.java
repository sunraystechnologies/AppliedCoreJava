package com.sunrays.basic;

public class Customer implements Cloneable {
	public int custId;

	public String name;

	public Account acc = new Account();

	public Object clone() throws CloneNotSupportedException {
		Customer obj = (Customer) super.clone();
		obj.acc = (Account) acc.clone();
		return obj;
	}

	public static void main(String[] args) throws Exception {
		Customer c1 = new Customer();
		Customer c3 = (Customer) c1.clone();// calls the override clone method.
	}

}
