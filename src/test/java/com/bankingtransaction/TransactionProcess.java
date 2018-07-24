package com.bankingtransaction;

import com.qmetry.qaf.automation.step.client.gherkin.GherkinScenarioFactory;

public class TransactionProcess {
	GherkinScenarioFactory a;
	public boolean login(String username, String password) {
		return true;
	}
	
	public boolean login() {
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
	
	public boolean verifyMoneyDeducted(String amountPaid) {
		int currentBalance = 4500;
		System.out.println("Account Holder--" + "\nCurrent Balace is -> " + currentBalance + " | Amount paid -> " + amountPaid);
		System.out.println("Verifying the current balance of account holder is $" + (currentBalance - (Integer.parseInt(amountPaid))));
		return true;
	} 
	
	
	
	public boolean verifyMoneyAdded(String currentBalance, String amountReceived) {
		System.out.println("Payee--" + "\nCurrent Balace is -> " + currentBalance + " | Amount received -> " + amountReceived);
		System.out.println("Verifying the current balance of payee is $" + (Integer.parseInt(currentBalance) + Integer.parseInt(amountReceived)));
		return true;
	} 
	
	public boolean verifyMoneyAdded(String amountReceived) {
		int currentBalance = 5000;
		System.out.println("Payee--" + "\nCurrent Balace is -> " + currentBalance + " | Amount received -> " + amountReceived);
		System.out.println("Verifying the current balance of payee is $" + (currentBalance + (Integer.parseInt(amountReceived))));
		return true;
	} 
	
	public boolean pinVerification(String payee, String pin) {
		return true;
	}
	
	public boolean amountVerification(String amountToBeWithdrawn, String currentBalance) {
		if (Integer.parseInt(amountToBeWithdrawn) <= Integer.parseInt(currentBalance)) {
			return true;
		}
		return false;
	}
	
}
