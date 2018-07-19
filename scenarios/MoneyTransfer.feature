Feature: Banking As a user I want to use a ATM Trasanction

Scenario Outline: Money Transfer	
	Given Login to the online banking portal with data 'dona.bose@gmail.com,Ispl123'
	When user transfer '500' to '3413434134'
	Then Amount 500 is deducted from 5000
	And 4000 is increased by 500
   
END
