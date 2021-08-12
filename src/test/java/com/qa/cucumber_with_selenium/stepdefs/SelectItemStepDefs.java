package com.qa.cucumber_with_selenium.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber_with_selenium.hooks.WebDriverHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectItemStepDefs {

	private WebDriver driver;
	private WebElement iframe;
	
	public SelectItemStepDefs(WebDriverHooks hooks) {
		this.driver = hooks.getDriver();
	}
	
	@Given("I navigate to website")
	public void iNavigateToWebsite() {
	    this.driver.get("http://way2automation.com/way2auto_jquery/selectable.php#load_box");
	}

	@Given("I am in the right page")
	public void iAmInTheRightPage() {
	    String titlePage = this.driver.findElement(By.cssSelector("#wrapper > div.container.margin-top-20 > h1")).getText();
	    assertEquals(titlePage, "Selectable");
	}
	
	@Given("I am in the right section of the page")
	public void iAmInTheRightSectionOfThePage() {
		//Get iframe element
		iframe = this.driver.findElement(By.className("demo-frame"));
		
		//Switch to the iframe document attached in it
		this.driver.switchTo().frame(iframe);
	}

	@When("I select an item from a list")
	public void iSelectAnItemFromAList() {
	    this.driver.findElement(By.cssSelector("#selectable > li:nth-child(3)")).click();;
	}

	@Then("I can view the item was selected")
	public void iCanViewTheItemWasSelected() {
	    Boolean isElementColored = this.driver.findElement(By.cssSelector("#selectable > li:nth-child(3)")).getAttribute("class").contains("ui-selected");
	    assertTrue(isElementColored);
	}
}
