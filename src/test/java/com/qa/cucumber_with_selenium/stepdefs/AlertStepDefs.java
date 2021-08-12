package com.qa.cucumber_with_selenium.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber_with_selenium.hooks.WebDriverHooks;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertStepDefs {

	private WebDriver driver;
	private WebElement iframe;

	public AlertStepDefs(WebDriverHooks hooks) {
		this.driver = hooks.getDriver();
	}

	@Given("I navigate to the website")
	public void iNavigateToTheWebsite() {
		this.driver.get("http://way2automation.com/way2auto_jquery/alert.php#load_box");
	}

	@Given("I verify I am in the right page")
	public void iVerifyIAmInTheRightPage() {
		String titlePage = this.driver.findElement(By.cssSelector("#wrapper > div.container.margin-top-20 > h1"))
				.getText();
		assertEquals(titlePage, "Alert");

	}

	@Given("I am in the right part of the page")
	public void iAmInTheRightPartOfThePage() {
		// Get iframe element
		iframe = this.driver.findElement(By.className("demo-frame"));

		// Switch to the iframe document attached in it
		this.driver.switchTo().frame(iframe);
	}

	@When("I click the button")
	public void iClickTheButton() {
		this.driver.findElement(By.cssSelector("body > button")).click();
	}

	@Then("an alert box should appear with the message {string}")
	public void anAlertBoxShouldAppearWithTheMessage(String message) {
		String alertMsg = this.driver.switchTo().alert().getText();
		assertTrue(alertMsg.equals(message));
	}
	
	@After("@alert")
	public void tearDown() {
		this.driver.switchTo().alert().accept();
	}
}
