package com.jspiders.designpatterntask1.main;

import java.util.Scanner;

import com.jspiders.designpatterntask1.object.CheckBalance;
import com.jspiders.designpatterntask1.object.Deposit;
import com.jspiders.designpatterntask1.object.Withdraw;

public class AccountMain {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Welcome to the Account");
		    while (true) {
		      System.out.println("Enter your choice: \n"
		      		+ "1. Withdraw\n"
		      		+ "2. Deposit\n"
		      		+ "3. Check Balance\n"
		      		+ "4. Exit");
		      int choice = sc.nextInt();
		      switch (choice) {
		        case 1:
		          System.out.print("Enter the amount to withdraw: ");
		          int withdrawAmount = sc.nextInt();
		          Withdraw withdraw = new Withdraw(withdrawAmount);
		          withdraw.doWithdraw();
		          break;
		        case 2:
		          System.out.print("Enter the amount to deposit: ");
		          int depositAmount = sc.nextInt();
		          Deposit deposit = new Deposit(depositAmount);
		          deposit.doDeposit();
		          break;
		        case 3:
		          CheckBalance checkBalance = new CheckBalance();
		          checkBalance.doCheckBalance();
		          break;
		        case 4:
		          System.out.println("Thank you for using the Account");
		          sc.close();
		          System.exit(0);
		          break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	  }
}
