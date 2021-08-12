#2. As a user, I want to select an item in the list so I can carry out some action with it.
#
#http://way2automation.com/way2auto_jquery/selectable.php#load_box
#
#Steps include:
#- Selecting the item in the list
#- Verify the item was selected
#
#POM not required.
@select_an_item
Feature: Select an item
	As a user, I want to select an item in the list so I can carry out some action with it.
	
	Scenario: Successful item selected
		Given I navigate to website
		And I am in the right page
		And I am in the right section of the page
		When I select an item from a list
		Then I can view the item was selected
		
		
		


