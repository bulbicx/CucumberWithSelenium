package com.qa.cucumber_with_selenium.stepdefs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.qa.cucumber_with_selenium.dvd.Dvd;
import com.qa.cucumber_with_selenium.dvd.DvdBuilder;
import com.qa.cucumber_with_selenium.dvd.DvdStore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DvdStepDefs {

	private DvdStore dvdStore;
	private Dvd dvd;
	private List<Dvd> listOfDvds;
	List<String> expectedOutputDvds;
	List<String> actualOutputDvds;
	
	public DvdStepDefs() {
		listOfDvds = new ArrayList<>();
		actualOutputDvds = new ArrayList<>();
	}
	
	@Given("a dvd store")
	public void aDvdStore() {
		dvdStore = new DvdStore();
	}

	@Given("the following new DVDs")
	public void theFollowingNewDVDs(List<Map<String, String>> data) {
	    for (Map<String, String> row : data) {
	    	//Create new Dvd from input data
	    	this.dvd = new DvdBuilder()
		    			.id(Integer.valueOf(row.get("Id")))
						.title(row.get("Title"))
						.year(Integer.valueOf(row.get("Year")))
						.actor(row.get("Actor"))
						.build();
	    	
	    	//Add dvd to list
	    	this.listOfDvds.add(dvd);
	    }
	}
	
	@Given("the expected outputs")
	public void theExpectedOutputs(List<String> expectedOutput) {
	    this.expectedOutputDvds = expectedOutput;
	}

	@When("the new DVDs are added to the store")
	public void theNewDVDsAreAddedToTheStore() {
		for (int i = 0; i < listOfDvds.size(); i++) {
			this.dvdStore.add(listOfDvds.get(i));
		}
	}

	@Then("the get dvd list request should return the expected outputs")
	public void theGetDvdListRequestShouldReturnTheExpectedOutputs() {
		//Get the dvd catalog and store it into a list variable
		List<Dvd> list = this.dvdStore.getDvdCatalog();
		
		for (int i = 0; i < list.size(); i++) {
			//Get each dvd object into a string variable
			String dvdObj = list.get(i).toString();
			
			//Add string variable into the actualOutputDvds list
			actualOutputDvds.add(dvdObj);
		}
	    
	    //assert expectedOutput is equal to actualOutput 
	    assertEquals(expectedOutputDvds, actualOutputDvds);
	}
	
	/**
	 * Remove a DVD
	 */
	@Given("the following DVDs in the store")
	public void theFollowingDVDsInTheStore(List<Map<String, String>> data) {
	    for (Map<String, String> row : data) {
	    	//Create new Dvd from input data
	    	this.dvd = new DvdBuilder()
		    			.id(Integer.valueOf(row.get("Id")))
						.title(row.get("Title"))
						.year(Integer.valueOf(row.get("Year")))
						.actor(row.get("Actor"))
						.build();
	    	
	    	//Add dvd to list
	    	this.listOfDvds.add(dvd);
	    }
	    theNewDVDsAreAddedToTheStore();
	}
	
	@When("the dvd with the title {string} is removed")
	public void theDvdWithTheTitleIsRemoved(String string) {
		for (int i = 0; i < listOfDvds.size(); i++) {
			if (listOfDvds.get(i).getTitle().contains(string)) {
				this.dvdStore.remove(listOfDvds.get(i));	
			}
		}
	}
	
	/**
	 * Update a DVD
	 */
	@When("I change the title of the film with the id {int} to {string}")
	public void iChangeTheTitleOfTheFilmWithTheIdTo(int id, String newTitle) {
		for (int i = 0; i < listOfDvds.size(); i++) {
	    	if (listOfDvds.get(i).getId() == id) {
	    		this.dvdStore.update(i, newTitle);
	    	}
	    }
	}

}
