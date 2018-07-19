package com.bankingtransaction;

public class TransactionProcess {
	
	public boolean login(String username, String password) {
		return true;
	}

	public void userTransferTheMoney(String amountToBePaid, String payee) {
		System.out.println("User has successfully transfered $" + amountToBePaid + " to " + payee);
	}
	
	public boolean verifyMoneyDeducted(String amountPaid, String currentBalance) {
		System.out.println("Account Holder--" + "\nCurrent Balace is -> " + currentBalance + " | Amount paid -> " + amountPaid);
		System.out.println("Verifying the current balance of account holder is $" + (Integer.parseInt(currentBalance) - Integer.parseInt(amountPaid)));
		return true;
	} 
	
	public boolean verifyMoneyAdded(String currentBalance, String amountReceived) {
		System.out.println("Payee--" + "\nCurrent Balace is -> " + currentBalance + " | Amount received -> " + amountReceived);
		System.out.println("Verifying the current balance of payee is $" + (Integer.parseInt(currentBalance) + Integer.parseInt(amountReceived)));
		return true;
	} 
	
}
