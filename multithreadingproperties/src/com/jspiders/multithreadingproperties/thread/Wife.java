package com.jspiders.multithreadingproperties.thread;

import com.jspiders.multithreadingproperties.resource.Account;

public class Wife extends Thread{
	Account account;

	public  Wife(Account account) {
		this.account=account;
	}

	@Override
	public void run() {
		account.deposit(500);
		account.withdraw(5000);
	}
}
