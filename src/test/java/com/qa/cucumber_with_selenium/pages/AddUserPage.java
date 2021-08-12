package com.qa.cucumber_with_selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {

	final String URL = "http://php.thedemosite.co.uk/addauser.php";
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement username;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=password]")
	private WebElement password;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=button]")
	private WebElement saveBtn;
	
	@FindBy(css = "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)")
	private WebElement addUserLink;
	
	@FindBy(css = "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")
	private WebElement loginLink;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote")
	private WebElement blockquote;
	
	public void register(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.saveBtn.click();
	}
	
	public void clickAddUser() {
		this.addUserLink.click();
	}
}
