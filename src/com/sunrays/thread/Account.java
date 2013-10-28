package com.sunrays.thread;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Account {

	private int balance = 0;

	public synchronized void deposit(String message, int amount) {

		// public void deposit(String message, int amount) {

		int bal;

		// synchronized (this){
		bal = getBalance() + amount;
		setBalance(bal);
		// }
		System.out.println(message + " Now Balance is " + bal);

	}

	public int getBalance() {
		try {
			Thread.sleep(200); // Simulate Database Operation
		} catch (InterruptedException e) {
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);// Simulate Database Operation
		} catch (InterruptedException e) {
		}
		this.balance = balance;
	}

}
