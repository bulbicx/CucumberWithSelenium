@calculator
Feature: Calculator Addition
	Testing whether the calculator can successfully add numbers.

	As a user, I want to add two or more numbers so I can then use
	the sum in further calculations or data based decision making.

  Scenario: Integer addition
    Given the number 2
    And the second number 8
    When the numbers are added
    Then the result should be 10
    
  Scenario: Float addition
	  Given the number 2.5
	  And the second number 8.6
	  When the numbers are added
	  Then the result should be 11.1