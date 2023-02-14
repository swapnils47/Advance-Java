package com.jspiders.designpatterntask1.object;

import com.jspiders.designpatterntask1.resource.Account;

public class CheckBalance {
	  public void doCheckBalance() {
		    Account account = Account.getInstance();
		    System.out.println("Your current balance is: " + account.getAccountBalance());
		  }
}
