package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource/AppFeatures"},
		glue = {"stepdef","appHooks"},
		plugin = {"pretty"}
		)
public class TestRunner {
	
}
