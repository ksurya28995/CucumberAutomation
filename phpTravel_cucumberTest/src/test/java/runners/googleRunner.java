package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/*
 * Method is used to run cucumber google featue file
 * 
 * @author Surya
*/ 

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/googleRunner-html-report", "json:target/googleRunner-json-report/report.json"}, 
		features = {"src/test/resources/FuncFeatureFile/googleSearch.feature" }, 
		glue = {"stepsDefinition","supports"},
		dryRun = false, 	
		monochrome = true, 
		snippets = SnippetType.CAMELCASE
	)

public class googleRunner {
}