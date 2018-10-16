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
	
	/**
	 * Method is used as a constructor
	 * 
	 * @author surya.k.kumaresan
	 */
	public googleSteps(DriverManager driverObj) {
		_driverObj = driverObj;
		commObj = new commonUtilities(_driverObj);
		gooObj = new googleActions(_driverObj);
	}
	
	/**
	 * Method is used to do the initial steps/preconditions of the test
	 * 
	 * @param "^Open \"([^\"]*)\" page in the browser$"  <- this is used to match with the step of the feature file and run this method
	 * 
	 * @param  \"([^\"]*)\  <-this will get the value from the steps of the cucumber feature file
	 * 
	 * @author surya.k.kumaresan
	 */
	@Given("^Open \"([^\"]*)\" page in the browser$")
	public void openPageInTheBrowser(String url) throws Throwable {
		commObj.openURL(loadProperties.googleUrl);
	}
	
	/**
	 * Method is used to do the testing steps of the test
	 * 
	 * @author surya.k.kumaresan
	 */
	@When("^search text is added$")
	public void searchTextIsAdded() throws Throwable {
		gooObj.addSearchTxt();
	}
	
	/**
	 * Method is used to do finishing steps of the test
	 * 
	 * @author surya.k.kumaresan
	 */
	@Then("^check the page$")
	public void check_the_page() throws Throwable {
		gooObj.checkPage();
	}

}
