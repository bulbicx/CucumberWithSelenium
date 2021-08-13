@dvd_removal
Feature: DVD store can remove old DVDs
  As a user, when I remove a DVD from the store, 
  the DVD should longer be available in the stores item list.
  
  Scenario: Remove a dvd
	  Given a dvd store
	  And the following DVDs in the store
			|	Id	| Title 				| Year 	| Actor 				|
			|	1		| Jurassik Park |	2010	|	Frank Blair 	|	
			|	2		|	Polkadot			| 1998	| Marie Bulen		|
			|	3		| Scary Movie		| 2008	| Paul Kavinski |	
	  And the expected outputs
	    | 2 - Polkadot - 1998 - Marie Bulen |
	    | 3 - Scary Movie - 2008 - Paul Kavinski |
	  When the dvd with the title "Jurassik Park" is removed
	  Then the get dvd list request should return the expected outputs
	  