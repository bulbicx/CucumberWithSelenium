package com.qa.cucumber_with_selenium.stepdefs;

import static org.junit.Assert.assertEquals;

import com.qa.cucumber_with_selenium.calculator.Calculator;
import com.qa.cucumber_with_selenium.hooks.CalculatorHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {

	private Calculator calculator;
	private double num1;
	private double num2;
	private double actualResult;

	public CalculatorStepDefs(CalculatorHooks hooks) {
		this.calculator = hooks.getCalculator();
	}
	
	@Given("the number {double}")
	public void theNumber(Double int1) {
		this.num1 = int1;
	}

	@Given("the second number {double}")
	public void theSecondNumber(Double int1) {
		this.num2 = int1;
	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
		this.actualResult = this.calculator.add(num1, num2);
	}

	@Then("the result should be {double}")
	public void theResultShouldBe(double expectedResult) {
		assertEquals(expectedResult, actualResult, 0);
	}
	
	@When("the numbers are divided")
	public void theNumbersAreDivided() {
	    this.actualResult = this.calculator.divide(num1, num2);
	}
}
