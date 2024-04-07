package com.urbanladder.definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.urbanladder.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

	@BeforeAll
	public static void setUp() {

		HelperClass.setUpDriver();
	}

	public void checkFailed(Scenario scenario) {
		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test"); 
		}	
	}


	@AfterAll
	public static void tearDown() {		
		HelperClass.tearDown();
	}
}