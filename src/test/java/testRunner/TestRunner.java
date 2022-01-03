package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/feature/sample.feature"},
		//tags = "@smoketest",
		glue = {"stepDefination","Hooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
 