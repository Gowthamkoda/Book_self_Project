package com.urbanladder.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
//		tags = "",
		dryRun = !true,
		features = {"src/test/resources/features",
				},
		glue = "com.urbanladder.definitions",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true

		)

public class urbanTestRunner extends AbstractTestNGCucumberTests {

}
