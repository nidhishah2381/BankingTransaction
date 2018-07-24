Feature: Transfer Money to Jack. Jack and I went for the dinner and I owe him 500

Scenario: Transfer 500 to Jack 
	Given Login to the online banking portal
	When Transfer '500' to 'Jack'
	Then Amount '500' is deducted from current balance
	And Amount '500' is incresed in current balance of 'Jack'

	

