Feature: Capbook Login feature
Using this feature user will be able to login to his/her user profile successfully.

Scenario: User wants to login into his or her Capbook profile using correct credentials
Given User is on Capbook login page
When User enters valid username and password
Then User must be directed to his/her profile page

Scenario: User wants to login into his or her Capbook profile using invalid credentials
Given User is on Capbook login page
When User enters invalid username and password 
Then 'Incorrect username and password!Try again' message shold be displayed

Scenario: User wants to login into his or her Capbook profile with no credentials 
Given User is on Capbook login page
When User enters nothing in the username or password field
Then 'Require valid credentials' message should be displayed