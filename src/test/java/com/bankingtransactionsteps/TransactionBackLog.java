package com.bankingtransactionsteps;

import java.util.Map;

import com.bankingtransaction.TransactionProcess;
import com.google.gson.internal.LinkedTreeMap;
import com.qmetry.qaf.automation.step.QAFTestStep;


/**
 * @author nidhi.shah
 */
public class TransactionBackLog {

	TransactionProcess transactionProcess = new TransactionProcess() ;
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Login to the online banking portal with data {0}")
	public void loginToTheOnlineBankingPortalWithData(Map<String,String> loginData) {
		if (transactionProcess.login(loginData.get("username"), loginData.get("password"))) {
			System.out.println("Login Successful");
//			LinkedTreeMap<K, V>
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user transfer {0} to {1}")
	public void userTransferTo(String amountToBePaid, Map<String,String> payee) {
		transactionProcess.userTransferTheMoney(amountToBePaid, payee.get("name"));
		System.out.println("Transfer done\n");
	}
	
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "Amount {0} is deducted from {1}")
	public void amountIsDeductedFrom(String ammountPaid, String currentBalance) {
		if(transactionProcess.verifyMoneyDeducted(ammountPaid, currentBalance)) {
			System.out.println("Account holder's balance verification successful\n");
		}
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "{0} is increased by {1}")
	public void IsIncreasedBy(String currentBalance, String ammountReceived) {
		if(transactionProcess.verifyMoneyAdded(currentBalance, ammountReceived)) {
			System.out.println("Payee's balance verification successful\n");
		}
	}
}
