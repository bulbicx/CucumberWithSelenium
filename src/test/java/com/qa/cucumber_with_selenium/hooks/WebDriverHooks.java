package com.qa.cucumber_with_selenium.hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.cucumber_with_selenium.utilities.WebDriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class WebDriverHooks {

	private WebDriver driver;
	
	@Before("@search or @login")
	public void setup() throws Exception {
		if (driver == null) {
			this.driver = WebDriverFactory.getDriver();
			this.driver.manage().window().maximize();
			this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}
	}
	
	@After("@search or @login")
	public void tearDown(Scenario scenario) {
		scenario.attach(takeSceenshot(), "image/png", scenario.getName());
		if (driver != null) this.driver.quit();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	private byte[] takeSceenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}