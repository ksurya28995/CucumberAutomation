package TextContest;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static WebDriver driver;
	
	public void setDriver(WebDriver _driver) {
		driver = _driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
