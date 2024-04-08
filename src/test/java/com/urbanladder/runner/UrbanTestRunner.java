package com.urbanladder.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = !true,
		features = {"src/test/resources/features",
				},
		glue = "com.urbanladder.definitions",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		publish = true

		)

public class UrbanTestRunner extends AbstractTestNGCucumberTests {

}
