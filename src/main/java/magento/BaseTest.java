package magento;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


/**
 * This is the base test class that sets up and tears down the WebDriver instance.
 * It supports multi-browser execution using TestNG parameters.
 */


public class BaseTest {

	protected WebDriver driver;
	
	/**
     * This method is executed before each test method and sets up the WebDriver
     * based on the specified browser parameter.
     *
     * @param browser The browser to use for the test (e.g., "chrome" or "firefox").
     */
	
	

	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			
            // Set up Chrome WebDriver using WebDriverManager

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			
            // Set up Firefox WebDriver using WebDriverManager
            WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			 
        } 
        // Navigate to the test website
		
        driver.get("https://magento.softwaretestingboard.com/");
    }
	
	/**
     * This method is executed after each test method and closes the WebDriver
     * instance to free up resources.
     */
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
