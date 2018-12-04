Feature: Capbook Registration feature
Using this feature a new user can register for capbook application

Scenario: User wants to register for Capbook application by providing correct details
Given User is on Capbook registration page
When User enters all required details correctly 
And click on submit
Then User must be directed to welcome user page 

Scenario: User wants to register for Capbook application by providing incorrect user details
Given User is on Capbook registration page
When User enters only first name correct and other details incorrect
And click on submit
Then 'Enter valid details' message should be displayed

Scenario: User wants to register for Capbook application by providing incorrect user details
Given User is on Capbook registration page
When User enters only last name correct and other details incorrect
And click on submit
Then 'Enter valid details' message should be displayed

Scenario: User wants to register for Capbook application by providing incorrect user details
Given User is on Capbook registration page
When User enters invalid emailId but other details correctly
And click on submit
Then 'Enter valid email' message should be displayed

Scenario: User wants to register for Capbook application by providing incorrect user details
Given User is on Capbook registration page
When User enters all required details correctly but invalid password pattern
And click on submit
Then 'Choose a suggested pattern password' message should be displayed