package runner;

import org.junit.runner.Runner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(CucumberOptions.class)
@CucumberOptions(
		features = "C:\\Users\\makka\\eclipse-workspace\\freecrm\\src\\Features\\login.feature"
		.glue= {"C:\\Users\\makka\\eclipse-workspace\\freecrm\\src\\main\\java\\stepdefinition"}
				
		)

class testrunner {

}
