package com.jspiders.designpatterntask1.object;

import com.jspiders.designpatterntask1.resource.Account;

public class Withdraw {

	 private int withdrawAmount;

	  public Withdraw(int withdrawAmount) {
	    this.withdrawAmount = withdrawAmount;
	  }

	  public void doWithdraw() {
	    Account account = Account.getInstance();
	    int currentBalance = account.getAccountBalance();
	    if (currentBalance >= withdrawAmount) {
	      currentBalance -= withdrawAmount;
	      account.setAccountBalance(currentBalance);
	      System.out.println("Withdraw successful. Your current balance is: " + currentBalance);
	    } else {
	      System.out.println("Insufficient balance. Your current balance is: " + currentBalance);
	    }
	  }
}
