#3. As a user, I want to display an alert box when I click a button so that I have some visual feedback.
#
#http://way2automation.com/way2auto_jquery/alert.php#load_box
#
#Steps include:
#- Selecting the INPUT ALERT tab
#- Opening the alert box
#- Entering input
#- Verifying the expected message appears in the alert window
#
#POM not required.
@alert
Feature: Click button

	As a user, I want to display an alert box when I click a button so that I have some visual feedback.
	
	Scenario: Simple alert 
		Given I navigate to the website
		And I verify I am in the right page
		And I am in the right part of the page
		When I click the button
		Then an alert box should appear with the message "I am an alert box!"
