Feature: Leaftaps Automation 

@Smoke @Sanity
Scenario Outline: Login into Leaftaps using DemoSalesManager 
	When Enter the username as <username> 
	And Enter the password as <password> 
	When Click on login button 
	And click on logout 
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|	
@Sanity
Scenario: signIN 
	When Enter the username as DemoCSR 
	And Enter the password as crmsfa 
	When Click on login button  
	
