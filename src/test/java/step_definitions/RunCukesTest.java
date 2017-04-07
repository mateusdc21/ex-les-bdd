package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		features = "classpath:features",
		monochrome = true,
		plugin = {"pretty"},
		glue = "step_definitions",
		tags = {})
public class RunCukesTest {

}
