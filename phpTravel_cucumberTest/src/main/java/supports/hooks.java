package supports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TextContest.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Class is used to do the initial task of the testcase
 * 
 * @author surya.k.kumaresan
 */
public class hooks {
	private static WebDriver driver;
	DriverManager driverObj = new DriverManager();

	/**
	 * Method is used to run at first if provided in the feature file, used to open the firefox browser
	 * 
	 * @author surya.k.kumaresan
	 */
	@Before("@firefox")
	public void initFirefoxBrowser() throws Exception {
			//System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\eclipse_jar\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Firefox Driver initalized");
			driverObj.setDriver(driver);
	}

	/**
	 * Method is used to run at first if provided in the feature file, used to open the chrome browser
	 * 
	 * @author surya.k.kumaresan
	 */
	@Before("@chrome")
	public void initChromeBrowser() throws Exception {
			//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\eclipse_jar\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Chrome Driver initalized");
			driverObj.setDriver(driver);
	}
	
	/**
	 * Method is used to run at last if provided in the feature file, used to close the browser
	 * 
	 * @author surya.k.kumaresan
	 */
	@After("@quit")
	public void quitDriver() throws Throwable {
		driver.quit();
	}
}
