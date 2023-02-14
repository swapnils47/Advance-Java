package com.jspiders.designpatterntask1.object;

import com.jspiders.designpatterntask1.resource.Account;

public class Deposit {

	 private int depositAmount;

	  public Deposit(int depositAmount) {
	    this.depositAmount = depositAmount;
	  }

	  public void doDeposit() {
	    Account account = Account.getInstance();
	    int currentBalance = account.getAccountBalance();
	    currentBalance += depositAmount;
	    account.setAccountBalance(currentBalance);
	    System.out.println("Deposit successful. Your current balance is: " + currentBalance);
	  }
}
