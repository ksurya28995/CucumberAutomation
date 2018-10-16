package ElementActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ElementObjects.phpTravelNavigateObjects;
import TextContest.DriverManager;
import supports.commonUtilities;

public class phpTravelNavigateActions extends phpTravelNavigateObjects{
	
	public WebDriver driver;
	public commonUtilities commObj;
	/**
	 * Method is used as a constructor
	 * 
	 * @author surya.k.kumaresan
	 */
	public phpTravelNavigateActions(DriverManager driverObj) {
		driver = driverObj.getDriver();
		commObj = new commonUtilities(driverObj);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method is used to navigate to the site 
	 * 
	 * @author surya.k.kumaresan
	 */
	public void navigateToSite(String page) throws Throwable {
		String loginUrl = "";
		if(page.equalsIgnoreCase("homepage"))
			loginUrl = homePageLink.getText();
		else if(page.equalsIgnoreCase("adminpage"))
			loginUrl = adminPageLink.getText();
		else
			loginUrl = supplierPageLink.getText();
		commObj.openURL(loginUrl);
	}
	
	/**
	 * Method is used to navigate to the signup page
	 * 
	 * @author surya.k.kumaresan
	 */
	public void navigateToSignUpPage() throws Throwable {
		commObj.waitForElement(myAccountBtn);
		commObj.actionClickElement(myAccountBtn);
		commObj.clickElement(signUpBtn);
		commObj.getThreeSecWait();
	}
	
	/**
	 * Method is used to navigate to the login page
	 * 
	 * @author surya.k.kumaresan
	 */
	public void navigateToLoginPage() throws Throwable {
		commObj.waitForElement(myAccountBtn);
		commObj.clickElement(myAccountBtn);
		commObj.clickElement(loginBtn);
		commObj.getThreeSecWait();
	}
}
