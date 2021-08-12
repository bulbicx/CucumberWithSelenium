package com.qa.cucumber_with_selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	final String URL = "http://thedemosite.co.uk/login.php";
			
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement usernameLogin;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=password]")
	private WebElement passwordLogin;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=button]")
	private WebElement loginBtn;

	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b")
	private WebElement textValue;
	
	public String getUrl() {
		return this.URL;
	}
	
	public void insertUsername(String username) {
		this.usernameLogin.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		this.passwordLogin.sendKeys(password);
	}

	public void clickLogin() {
		this.loginBtn.click();
	}

	public String getText() {
		return this.textValue.getText();
	}
}
