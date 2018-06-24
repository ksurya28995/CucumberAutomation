package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-test-report/report.json"}, 
		features = {"src/test/resources/FuncFeatureFile/googleSearch.feature" }, 
		glue = {"stepsDefinition","supports"},
		dryRun = false, 	
		monochrome = true, 
		snippets = SnippetType.CAMELCASE
	)

public class googleRunner {
}