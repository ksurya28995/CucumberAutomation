package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/*
 * Method is used to run cucumber PHP travels testcase
 * @author Surya.K
*/ 

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/phpTravelRunner-html-report", "json:target/phpTravelRunner-json-report/report.json"}, 
		features = {"src/test/resources/FuncFeatureFile/phpTravel.feature" }, 
		glue = {"stepsDefinition","supports"},
		dryRun = false, 	
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		tags = {"@loginCheck, @signUpCheck"}
	)

public class phpTravelRunner {
}

