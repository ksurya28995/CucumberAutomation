package stepsDefinition;

import ElementActions.googleActions;
import TextContest.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import supports.commonUtilities;
import supports.loadProperties;

public class googleSteps {
	DriverManager _driverObj;
	commonUtilities commObj;
	googleActions gooObj;
	
	public googleSteps(DriverManager driverObj) {
		_driverObj = driverObj;
		commObj = new commonUtilities(_driverObj);
		gooObj = new googleActions(_driverObj);
	}
	
	@Given("^Open \"([^\"]*)\" page in the browser$")
	public void openPageInTheBrowser(String url) throws Throwable {
		commObj.openURL(loadProperties.googleUrl);
	}
	
	@When("^search text is added$")
	public void searchTextIsAdded() throws Throwable {
		gooObj.addSearchTxt();
	}

	@Then("^check the page$")
	public void check_the_page() throws Throwable {
		gooObj.checkPage();
	}

}
