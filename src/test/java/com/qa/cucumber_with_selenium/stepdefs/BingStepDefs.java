package com.qa.cucumber_with_selenium.stepdefs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber_with_selenium.hooks.WebDriverHooks;
import com.qa.cucumber_with_selenium.pages.BingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingStepDefs {

	private WebDriver driver;
	private String word;
	private BingPage bingPage;
	
	public BingStepDefs(WebDriverHooks hooks) {
		this.driver = hooks.getDriver();
		bingPage = PageFactory.initElements(driver, BingPage.class);
	}
	
	@When("I go to www.bing.com")
	public void i_go_to_www_bing_com() {
	    this.driver.get("https://www.bing.com");
	}

	@When("I am on Bing hompage")
	public void i_am_on_bing_hompage() {
	    assertTrue(this.driver.getTitle().equals("Bing"));
	}

	@When("I search the keyword {word}")
	public void i_search_the_keyword(String word) {
		this.word = word;
		bingPage.makeASearch(word);
	}
	
	@Then("the title of the page should contain {word}")
	public void the_title_of_the_page_should_contain(String searchTerm) {
		assertTrue(this.driver.getTitle().contains(word));
	}
}
