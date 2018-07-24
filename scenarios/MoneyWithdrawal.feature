Feature: Withdraw Money from ATM. Jack is running out of cash.He wants to withdraw 2000 from his account

	Scenario: Transfer 500 to Jack 
	Given 'Jack' has entered correct pin '4564'
	When 'Jack' entered '2000' for wirhdrawal
	Then ATM validate the '2000' with current balance '1000'
	And Amount is withdrawn. 
	

