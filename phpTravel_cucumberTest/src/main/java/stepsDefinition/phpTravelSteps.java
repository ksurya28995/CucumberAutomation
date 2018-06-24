package stepsDefinition;

import ElementActions.phpTravelLogInOutActions;
import ElementActions.phpTravelNavigateActions;
import ElementObjects.phpTravelNavigateObjects;
import TextContest.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import supports.commonUtilities;
import supports.loadProperties;

public class phpTravelSteps {

	DriverManager _driverObj;
	commonUtilities commObj;
	phpTravelLogInOutActions phpTravelLogObj;
	phpTravelNavigateActions phpTravelNavObj;
	
	public phpTravelSteps(DriverManager driverObj) throws Exception {
		_driverObj = driverObj;
		phpTravelLogObj = new phpTravelLogInOutActions(_driverObj);
		commObj = new commonUtilities(_driverObj);
		phpTravelNavObj = new phpTravelNavigateActions(_driverObj);
	}
	
	@Given("^open \"([^\"]*)\" in the browser$")
	public void openInTheBrowser(String url) throws Throwable {
		commObj.openURL(loadProperties.get(url));
	}
	
	@When("^navigate to \"([^\"]*)\" site$")
	public void navigateToSite(String page) throws Throwable {
		phpTravelNavObj.navigateToSite(page);
	}

	@When("^login to the WebPortal$")
	public void loginToTheWebPortal() throws Throwable {
		phpTravelLogObj.loginFlow();
	}

	@Then("^logout from the WebPortal$")
	public void logoutFromTheWebPortal() throws Throwable {
		phpTravelLogObj.logoutFlow();
	}
	
	@And("^signUp on the phpTravels$")
	public void signup_to_the_WebPortal() throws Throwable {
	    phpTravelLogObj.signUp();
	}

}