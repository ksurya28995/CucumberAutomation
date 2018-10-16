package TextContest;

import org.openqa.selenium.WebDriver;
/**
 * Method is used to hold the driver of the browser
 * 
 * @author surya.k.kumaresan
 */
public class DriverManager {

	private static WebDriver driver;
	
	public void setDriver(WebDriver _driver) {
		driver = _driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
