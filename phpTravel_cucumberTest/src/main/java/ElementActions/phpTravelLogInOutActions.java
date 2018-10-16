package ElementActions;

import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ElementObjects.phpTravelLogInOutObjects;
import TextContest.DriverManager;
import supports.PropertyManager;
import supports.commonUtilities;
/**
 * Class is used to do validations on the site
 * 
 * @author surya.k.kumaresan
 */
public class phpTravelLogInOutActions extends phpTravelLogInOutObjects {

	WebDriver driver;
	Map<String, String> arrData;
	commonUtilities commObj;
	phpTravelNavigateActions phpTravelNavObj;
	
	/**
	 * Method is used as a constructor
	 * 
	 * @param driverManager driver of the UI
	 * 
	 * @author surya.k.kumaresan
	 */
	public phpTravelLogInOutActions(DriverManager driverObj) throws Exception {
		driver = driverObj.getDriver();
		commObj = new commonUtilities(driverObj);
		phpTravelNavObj = new phpTravelNavigateActions(driverObj);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method is used to login to the site
	 * 
	 * @author surya.k.kumaresan
	 */
	public void loginFlow() throws Throwable {
		phpTravelNavObj.navigateToLoginPage();
		commObj.setTextBox(loUsernameFld, PropertyManager.getPropertyVal("email"));
		commObj.setTextBox(loPasswrdFld, PropertyManager.getPropertyVal("password"));
		commObj.clickElement(loLoginBtn);
		commObj.getFiveSecWait();
		commObj.verify(userNameText);
	}
	
	/**
	 * Method is used to logout of the site
	 * 
	 * @author surya.k.kumaresan
	 */
	public void logoutFlow() throws Throwable {
		commObj.waitForElement(myAccountBtn);
		commObj.clickElement(myAccountBtn);
		commObj.clickElement(loLogoutBtn);
		commObj.getThreeSecWait();
		commObj.verify(loUsernameFld);
	}	
	
	/**
	 * Method is used to signup in the site
	 * 
	 * @author surya.k.kumaresan
	 */
	public void signUp() throws Throwable {
		arrData = commObj.readCsvData("signUp_Php.csv");
		phpTravelNavObj.navigateToSignUpPage();
		commObj.waitForElement(suSignUpText);
		commObj.setTextBox(suFrstNameFld, arrData.get("Firstname"));
		commObj.setTextBox(suLastNameFld, arrData.get("Lastname"));
		commObj.setTextBox(suMobNumberFld, arrData.get("Mobile Number"));
		String email = arrData.get("Email");
		String randNo = commObj.generateRandomNumber(3);
		email = email.split("@")[0]+randNo+"@"+email.split("@")[1];
		commObj.setTextBox(suEmailFld, email); 
		commObj.setTextBox(suPasswrdFld, arrData.get("Password"));
		commObj.setTextBox(suConfPasswrdFld, arrData.get("Confirm Password"));
		commObj.clickElement(suSignUpBtn);
		commObj.getThreeSecWait();
	}
}
