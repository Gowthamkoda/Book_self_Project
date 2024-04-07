package com.urbanladder.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		tags = "",
//		dryRun = true,
		features = "./src/test/resources/features/Header.feature",
		glue = "com.urbanladder.definitions",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class urbanTestRunner extends AbstractTestNGCucumberTests {

}
