Feature: Banking As a user I want to use a ATM Trasanction

SCENARIO: Money Transfer	
	Given Login to the online banking portal with data '${accountHolder.login}'
	When user transfer '${accountHolder.amountToBePaid}' to '${payee}'
	Then Amount '${accountHolder.amountToBePaid}' is deducted from '${accountHolder.currentBalance}' 
	And '${payee.currentBalance}' is increased by '${accountHolder.amountToBePaid}'

END
