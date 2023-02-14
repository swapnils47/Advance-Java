package com.jspiders.designpatterntask1.resource;

public class Account {

	  private static Account instance = new Account();
	  private int accountBalance = 10000;

	  private Account() {}

	  public static Account getInstance() {
	    return instance;
	  }

	  public int getAccountBalance() {
	    return this.accountBalance;
	  }

	  public void setAccountBalance(int balance) {
	    this.accountBalance = balance;
	  }
	
}
