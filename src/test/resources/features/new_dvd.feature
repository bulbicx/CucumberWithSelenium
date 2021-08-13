@dvd_addition
Feature: DVD store accepts new dvds
	As a user, when I add a new dvd to my store, 
	then the DVD should be saved to the stores item list.
	
	Scenario: Add a new dvd
		Given a dvd store
		And the following new DVDs
			|	Id	| Title 				| Year 	| Actor 				|
			|	1		| Jurassik Park |	2010	|	Frank Blair 	|	
			|	2		|	Polkadot			| 1998	| Marie Bulen		|
			|	3		| Scary Movie		| 2008	| Paul Kavinski |	
		And the expected outputs
	    | 1 - Jurassik Park - 2010 - Frank Blair |
	    | 2 - Polkadot - 1998 - Marie Bulen |
	    | 3 - Scary Movie - 2008 - Paul Kavinski |
	  When the new DVDs are added to the store
	  Then the get dvd list request should return the expected outputs