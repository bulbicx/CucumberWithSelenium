package com.qa.cucumber_with_selenium;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"}, //feature files
		glue = {"classpath:com.qa.cucumber_with_selenium"}, //step definition file location
		snippets = SnippetType.CAMELCASE,
		plugin = {
				"summary",
				"html:target/cucumber-reports/cucumber-html-reports.html",
				"junit:target/cucumber-reports/cucumber-junit-report.xml"
		},
		monochrome = true
)
public class CucumberTestRunner {


}
