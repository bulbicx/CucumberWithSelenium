@calculator
Feature: Calculator division
  Testing whether the calculator can successfully divide two numbers
  
  As a user, I want to divide two numbers so that I can then use
	the sum in further calculations or data based decision making.
	  	
  Scenario Outline: Varying values for division
  	Given the number <num1>
    And the second number <num2>
    When the numbers are divided
    Then the result should be <expected>
    
    	Examples: Integer values
    		| num1	|	num2	|	expected	|
    		| 15		|	5			| 3					|
    		|	20		| 2			| 10				|
    		| 10.8	| 2			| 5.4				|

