package com.acumensolutions.bank;

import account.CheckingAccount;
import account.SavingsAccount;

public class AcumenBank {

	public static void main(String[] args) {
		System.out.println("Welcome to Acumen Bank!");
		System.out.println();

		CheckingAccount michaelsAccount = new CheckingAccount("Michael", 5000);
		CheckingAccount gobsAccount = new CheckingAccount("Gob", 2000);

		System.out.println("Open Accounts:");
		System.out.println();
		printAccountDetails(michaelsAccount);
		System.out.println();
		printAccountDetails(gobsAccount);
		System.out.println();
		

		System.out.println();
		System.out.println("Making transfer of $1000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}

		michaelsAccount.transfer(gobsAccount, 1000);

		System.out.println("Updated Account Details:");
		System.out.println();
		printAccountDetails(michaelsAccount);
		System.out.println();
		printAccountDetails(gobsAccount);
		System.out.println();

		// Initialize new savings account with initial balance of $30,000 and 0.89% interest
		SavingsAccount acesSavingsAccount = new SavingsAccount("Ace", 30000, .0089, 4);
		
		SavingsAccount garysSavingsAccount = new SavingsAccount("Gary", 10000, .0056, 4);
		System.out.println();
		printAccountDetails(acesSavingsAccount);
		System.out.println();
		printAccountDetails(garysSavingsAccount);
		System.out.println();
		
		System.out.println();
		System.out.println("Making transfer of $5000...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
		
		acesSavingsAccount.transfer(garysSavingsAccount, 5000);
		
		System.out.println("Updated Account Details:");
		System.out.println();
		printAccountDetails(acesSavingssAccount);
		System.out.println();
		printAccountDetails(garysSavingsAccount);
		System.out.println();
		
		
		// apply 2 years of interest to the savings accounts
		
		System.out.println();
		System.out.println("Applying Interest");
		acesSavingsAccount.applyInterest(2);
		garysSavingsAccount.applyInterest(2);
		
		System.out.println("Updated Account Details:");
		System.out.println();
		printAccountDetails(acesSavingssAccount);
		System.out.println();
		printAccountDetails(garysSavingsAccount);
		System.out.println();
	}

	private static void printAccountDetails(CheckingAccount account) {
		System.out.format("Account for %s:\r\n", account.getOwnerName());
		System.out.format("Balance: $%.2f\r\n", account.getBalance());
	}
	
	private static void printAccountDetails(SavingsAccount account) {
		System.out.format("Account for %s:\r\n", account.getOwnerName());
		System.out.format("Balance: $%.2f\r\n", account.getBalance());
	}
}