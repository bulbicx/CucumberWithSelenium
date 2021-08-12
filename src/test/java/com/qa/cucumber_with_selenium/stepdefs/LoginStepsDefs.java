package com.qa.cucumber_with_selenium.stepdefs;

import static org.junit.Assert.assertTrue;

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
	private String username;
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

	@Given("I register with {word} and {word}")
	public void iRegister(String username, String password) {
		this.username = username;
	    this.addUserPage.register(username, password);
	}

	@Given("I am able to see a successful registration")
	public void iAmAbleToSeeASuccessfulRegistration() {
	    assertTrue(this.addUserPage.getUsernameDisplayed().contains(username));
	}

	@When("I go to the login page")
	public void iGoToTheLoginPage() {
	    this.driver.get(loginPage.getUrl());
	}
	
	@When("I enter the username {word}")
	public void iEnterTheUsername(String username) {
	    loginPage.insertUsername(username);
	}
	@When("I enter the password {word}")
	public void iEnterThePasswordPassword123(String password) {
		loginPage.insertPassword(password);
	}

	@When("I click on the login button")
	public void iClickOnTheLoginButton() {
	    loginPage.clickLogin();
	}

	@Then("It should be displayed {string}")
	public void itShouldBeDisplayed(String message) {
	    assertTrue(loginPage.getText().equals(message));
	}
}
