@search
Feature: Search on Bing

	As a user, I want to navigate on Bing so that I can search what I need
	
	Scenario: Search for doge
		When I go to www.bing.com
		And I am on Bing hompage
		When I search the keyword doge
		Then the title of the page should contain doge
		
