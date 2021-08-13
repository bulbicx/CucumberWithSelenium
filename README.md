# Cucumber with Selenium

This repository is part of a series of exercises done with Cucumber and Selenium. In particular the tasks solved were:

## Task 1

1. Setup a Maven project with Selenium and Cucumber

2. Create a feature file for opening bing.com and searching for "doge"

3. Verify the search in your step definitions by checking the page title

4. Add the HTML reporter plugin (example on GH and in booklet)

Make sure to use hooks for setting up your webdrivers. These can be in the same file as the step definitions or in separate files and injected using PicoContainer
	

## Task 2

Add a calculator addition feature and implementation with Cucumber in the same project as your Selenium & Cucumber project that you created in task 1
Use tag expressions to tell Cucumber to only run Selenium hooks for the Selenium features

## Task 3

1. As a user, I want to login into thedemosite.co.uk to confirm my account was successfully registered.
 Steps include:
- Registering
- Logging in
- Asserting successful login

You must use the Page Object Model (POM).

2. As a user, I want to select an item in the list so I can carry out some action with it.

http://way2automation.com/way2auto_jquery/selectable.php#load_box

Steps include:
- Selecting the item in the list
- Verify the item was selected

POM not required.

3. As a user, I want to display an alert box when I click a button so that I have some visual feedback.

http://way2automation.com/way2auto_jquery/alert.php#load_box

Steps include:
- Selecting the INPUT ALERT tab
- Opening the alert box
- Entering input
- Verifying the expected message appears in the alert window

POM not required.

## Task 4

Go back through your Cucumber & Selenium tests from today and take screenshots of your tests (before and after every step), the screenshots need to be attached to your generated HTML report.

## Task 5

Implement the feature files using BDD as step definitions

Use the followings:

```
Feature: DVD store accepts new dvds
	As a user, when I add a new dvd to my store, 
	then the DVD should be saved to the stores item list.
	
	Scenario: Add a new dvd
	Given a dvd store
	And the following new DVDs
		| Id | Title 	     | Year 	| Actor 	|	
		| 1  | Jurassik Park |	2010	| Frank Blair   |	
		| 2  | Polkadot	     | 1998	| Marie Bulen	|
		| 3  | Scary Movie   | 2008	| Paul Kavinski |	
	And the expected outputs
	    | 1 - Jurassik Park - 2010 - Frank Blair |
	    | 2 - Polkadot - 1998 - Marie Bulen |
	    | 3 - Scary Movie - 2008 - Paul Kavinski |
	When the new DVDs are added to the store
	Then the get dvd list request should return the expected outputs
```
```
Feature: DVD store can remove old DVDs
  As a user, when I remove a DVD from the store, 
  the DVD should longer be available in the stores item list.
  
  Scenario: Remove a dvd
	  Given a dvd store
	  And the following DVDs in the store
		| Id | Title 	     | Year 	| Actor 	|	
		| 1  | Jurassik Park |	2010	| Frank Blair   |	
		| 2  | Polkadot	     | 1998	| Marie Bulen	|
		| 3  | Scary Movie   | 2008	| Paul Kavinski |	
	  And the expected outputs
	    | 2 - Polkadot - 1998 - Marie Bulen |
	    | 3 - Scary Movie - 2008 - Paul Kavinski |
	  When the dvd with the title "Jurassik Park" is removed
	  Then the get dvd list request should return the expected outputs
	  
```
```
Feature: DVD store can update DVDs
  As a user, when I update the details of a film, 
  the changes should be reflected in the stores item list.
  
  Scenario: Update a dvd
	  Given a dvd store
	  And the following DVDs in the store
		| Id | Title 	     | Year 	| Actor 	|	
		| 1  | Jurassik Park |	2010	| Frank Blair   |	
		| 2  | Polkadot	     | 1998	| Marie Bulen	|
		| 3  | Scary Movie   | 2008	| Paul Kavinski |	
	  And the expected outputs
	    | 1 - Jurassik Park - 2010 - Frank Blair |
	    | 2 - Polkadot 2 - 1998 - Marie Bulen |
	    | 3 - Scary Movie - 2008 - Paul Kavinski |
	  When I change the title of the film with the id 2 to "Polkadot 2"
	  Then the get dvd list request should return the expected outputs
```
