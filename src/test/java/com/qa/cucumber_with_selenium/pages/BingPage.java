package com.qa.cucumber_with_selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingPage {
	
	@FindBy(id = "sb_form_q")
	private WebElement searchBar;
	
	public void makeASearch(String search) {
		searchBar.sendKeys(search);;
		searchBar.sendKeys(Keys.ENTER);
	}
}
