package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * This class represents the LoginPage Page Object.
 */

public class LoginPage {

	private WebDriver driver;

	@FindBy(linkText="Sign In")
	WebElement SignInButton;

	@FindBy(id = "email")
	private WebElement usernameInput;

	@FindBy(id = "pass")
	private WebElement passwordInput;

	@FindBy(id = "send2")
	private WebElement loginButton;
	
	@FindBy(className = "logged-in")
	public WebElement welcomePage;
	
	@FindBy(xpath = "//div[@role='alert']")
	public WebElement alertLabel;
	
	  /**
     * Constructor to initialize the LoginPage with a WebDriver instance.
     *
     * @param driver The WebDriver instance.
     */
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 /**
     * Clicks the "Sign In" button on the login page.
     */
	
	public void clickSignIn() {
		SignInButton.click();
	}

	 /**
     * Enters the username in the username input field.
     *
     * @param username The username to enter.
     */

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	  /**
     * Enters the password in the password input field.
     *
     * @param password The password to enter.
     */
	
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	 /**
     * Clicks the login button on the login page.
     */

	public void clickLogin() {
		loginButton.click();
	}
	
	  /**
     * Gets the text of the email error message.
     *
     * @return The text of the email error message.
     */
	
	public String getAlertLabelText() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(d -> !alertLabel.getText().isEmpty());
		return alertLabel.getText();
	}
}
