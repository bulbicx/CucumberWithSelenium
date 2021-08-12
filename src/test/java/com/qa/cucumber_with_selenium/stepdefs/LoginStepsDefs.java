package com.qa.cucumber_with_selenium.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber_with_selenium.hooks.WebDriverHooks;
import com.qa.cucumber_with_selenium.pages.AddUserPage;
import com.qa.cucumber_with_selenium.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefs {

	private WebDriver driver;
	private AddUserPage addUserPage;
	private LoginPage loginPage;
	
	public LoginStepsDefs(WebDriverHooks hooks) {
		this.driver = hooks.getDriver();
		this.addUserPage = PageFactory.initElements(driver, AddUserPage.class);
		this.loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given("I navigate to {string}")
	public void iNavigateTo(String url) {
	    this.driver.get(url);
	}

	@Given("I go to the add a user page")
	public void iGoToTheAddAUserPage() {
	    this.addUserPage.clickAddUser();
	}

	@Given("I enter the username {word}")
	public void iEnterTheUsername(String username) {
	    this.ad
	}

	@Given("I enter the password {word}")
	public void iEnterThePassword(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I click on the save button")
	public void iClickOnTheSaveButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I am able to see my details")
	public void iAmAbleToSeeMyDetails() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I go to the login page")
	public void iGoToTheLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on the login button")
	public void iClickOnTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("It should be displayed {string}")
	public void itShouldBeDisplayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
