package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\semmalai\\eclipse-workspace\\BDDFramework\\src\\main\\java\\com\\qa\\feature\\login.feature"
		,glue = {"com\\qa\\stepDefinition"},
		format = {"pretty", "html:test-output"},
		dryRun = false,
		monochrome = true
		)
public class TestRunner {

}
