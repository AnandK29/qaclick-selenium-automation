package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/newfeatures", glue = "stepDefinitions")
public class TestNgRunner extends AbstractTestNGCucumberTests {
	
}