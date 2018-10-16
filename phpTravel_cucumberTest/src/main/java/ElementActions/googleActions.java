package ElementActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ElementObjects.googleObjects;
import TextContest.DriverManager;
/**
 * Method is used to test the google page
 * 
 * @author SuryaRay
 */
public class googleActions extends googleObjects{
	WebDriver _driver;

	/**
	 * Method is used as a constructor
	 * 
	 * @author SuryaRay
	 */
	public googleActions(DriverManager driverObj) {
		_driver = driverObj.getDriver();
		PageFactory.initElements(_driver, this);
	}
	
	/**
	 * Method is used to add text in the google search field
	 * 
	 * @author SuryaRay
	 */
	public void addSearchTxt() throws Throwable {
		searchBox.sendKeys("Yes");
		Thread.sleep(5000);
		searchBtn.click();
		Thread.sleep(5000);
	}

	/**
	 * Method is used to check the result is displayed
	 * 
	 * @author SuryaRay
	 */
	public void checkPage() throws Throwable {
		resultStats.isDisplayed();
	}
}
