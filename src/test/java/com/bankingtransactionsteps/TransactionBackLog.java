package com.bankingtransactionsteps;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.bankingtransaction.TransactionProcess;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;

/**
 * @author nidhi.shah
 */
public class TransactionBackLog {
	
	TransactionProcess transactionProcess = new TransactionProcess();
	
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Login to the online banking portal with data {0}")
	public void loginToTheOnlineBankingPortalWithData(Map<String, String> loginData) {
		if (transactionProcess.login(loginData.get("username"),
				loginData.get("password"))) {
			System.out.println("Login Successful");
			// LinkedTreeMap<K, V>
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user transfer {0} to {1}")
	public void userTransferTo(String amountToBePaid, Map<String, String> payee) {
		transactionProcess.userTransferTheMoney(amountToBePaid, payee.get("name"));
		System.out.println("Transfer done\n");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Amount {0} is deducted from {1}")
	public void amountIsDeductedFrom(String ammountPaid, String currentBalance) {
		if (transactionProcess.verifyMoneyDeducted(ammountPaid, currentBalance)) {
			System.out.println("Account holder's balance verification successful\n");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "{0} is increased by {1}")
	public void IsIncreasedBy(String currentBalance, String ammountReceived) {
		if (transactionProcess.verifyMoneyAdded(currentBalance, ammountReceived)) {
			System.out.println("Payee's balance verification successful\n");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Login to the online banking portal")
	public void loginToTheOnlineBankingPortal() {
		
		if (transactionProcess.login()) {
			System.out.println("Login Successful");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Transfer {0} to {1}")
	public void transferTo(String amountToBePaid, String payee) {
		transactionProcess.userTransferTheMoney(amountToBePaid, payee);
		System.out.println("Transfer done\n");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Amount {0} is deducted from current balance")
	public void amountIsDeductedFromCurrentBalance(String ammountPaid) {
		if (transactionProcess.verifyMoneyDeducted(ammountPaid)) {
			System.out.println("Account holder's balance verification successful\n");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Amount {0} is incresed in current balance of {1}")
	public void amountIsIncresedInCurrentBalanceOf(String ammountReceived, String payee) {
		if (transactionProcess.verifyMoneyAdded(ammountReceived)) {
			System.out.println(payee + "'s balance verification successful\n");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "{0} has entered correct pin {1}")
	public void hasEnteredCorrectPin(String payee, String pin) {
		if (transactionProcess.pinVerification(payee, pin)) {
			System.out.println(payee + " has entered correct pin");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "{0} entered {1} for wirhdrawal")
	public void enteredForWirhdrawal(String payee, String amountToBeWithdrawn) {
		System.out
				.println(payee + " has entered " + amountToBeWithdrawn + " to withdraw.");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "ATM validate the {0} with current balance {1}")
	public void aTMValidateTheWithCurrentBalance(String amountToBeWithdrawn,
			String currentBalance) {
		if (transactionProcess.amountVerification(amountToBeWithdrawn, currentBalance)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);	
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Amount is withdrawn.")
	public void amountIsWithdrawn() {
		System.out.println("Amount is withdrawn");
	}

}
