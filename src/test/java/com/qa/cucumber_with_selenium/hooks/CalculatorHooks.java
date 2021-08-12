package com.qa.cucumber_with_selenium.hooks;

import com.qa.cucumber_with_selenium.calculator.Calculator;

import io.cucumber.java.Before;

public class CalculatorHooks {

	private Calculator calculator;
	
	@Before("@calculator")
	public void setup() {
		this.calculator = new Calculator();
	}
	
	public Calculator getCalculator() {
		return this.calculator;
	}
}
