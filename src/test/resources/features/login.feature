# As a user, I want to login into thedemosite.co.uk to confirm my account was successfully registered.
# Steps include:
#- Registering
#- Logging in
#- Asserting successful login
#
# You must use the Page Object Model (POM).

@login
Feature: Login successfully
	
	As a user, I want to login into thedemosite.co.uk to confirm my account was successfully registered.
	
	Background: Go to the website
		Given I navigate to "http://thedemosite.co.uk/" 
		And I go to the add a user page
		And I register with someone and password123
		And I am able to see a successful registration
			
		Scenario: Login into the account
			When I go to the login page
			And I enter the username someone 
			And I enter the password password123
			When I click on the login button
			Then It should be displayed "**Successful Login**" 
