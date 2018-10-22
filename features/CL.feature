Feature: Leaftaps Automation 
Background: 
	Given Launch the browser 
	And Load the URL  
	And Maximize the browser 
	And Set timeout
Scenario: Login into Leaftaps using DemoSalesManager 
	When Enter the username as DemoSalesManager 
	And Enter the password as crmsfa
	When Click on login button 
	Then Verify login is success