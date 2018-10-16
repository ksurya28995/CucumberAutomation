package ElementActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ElementObjects.googleObjects;
import TextContest.DriverManager;
/**
 * Method is used to test the google page
 * 
 * @author surya.k.kumaresan
 */
public class googleActions extends googleObjects{
	WebDriver _driver;

	/**
	 * Method is used as a constructor
	 * 
	 * @author surya.k.kumaresan
	 */
	public googleActions(DriverManager driverObj) {
		_driver = driverObj.getDriver();
		PageFactory.initElements(_driver, this);
	}
	
	/**
	 * Method is used to add text in the google search field
	 * 
	 * @author surya.k.kumaresan
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
	 * @author surya.k.kumaresan
	 */
	public void checkPage() throws Throwable {
		resultStats.isDisplayed();
	}
}
