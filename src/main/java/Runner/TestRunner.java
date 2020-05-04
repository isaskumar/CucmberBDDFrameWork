package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\semmalai\\eclipse-workspace\\BDDFramework\\src\\main\\java\\Features\\hradmin.feature"
		,glue = {"stepDefinitions"},
		format = {"pretty", "html:test-output"},
		dryRun = false,
		monochrome = true
		)
public class TestRunner {

}
