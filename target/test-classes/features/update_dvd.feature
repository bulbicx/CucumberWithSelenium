@dvd_update
Feature: DVD store can update DVDs
  As a user, when I update the details of a film, 
  the changes should be reflected in the stores item list.
  
  Scenario: Update a dvd
	  Given a dvd store
	  And the following DVDs in the store
			|	Id	| Title 				| Year 	| Actor 				|
			|	1		| Jurassik Park |	2010	|	Frank Blair 	|	
			|	2		|	Polkadot			| 1998	| Marie Bulen		|
			|	3		| Scary Movie		| 2008	| Paul Kavinski |	
	  And the expected outputs
	    | 1 - Jurassik Park - 2010 - Frank Blair |
	    | 2 - Polkadot 2 - 1998 - Marie Bulen |
	    | 3 - Scary Movie - 2008 - Paul Kavinski |
	  When I change the title of the film with the id 2 to "Polkadot 2"
	  Then the get dvd list request should return the expected outputs