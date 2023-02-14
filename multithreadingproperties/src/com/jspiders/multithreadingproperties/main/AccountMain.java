package com.jspiders.multithreadingproperties.main;

import com.jspiders.multithreadingproperties.resource.Account;
import com.jspiders.multithreadingproperties.thread.Husband;
import com.jspiders.multithreadingproperties.thread.Wife;

public class AccountMain {

	public static void main(String[] args) {
		Account account=new  Account(10000);
		
		Husband husband=new Husband(account);
		
		Wife wife=new Wife(account);
		
		husband.start();
		wife.start();
	}
}
