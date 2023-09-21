package magento;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DataDrivenTest extends BaseTestWithExtent {

    @Test(dataProvider = "testdata")
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);

        // Navigate to the login page (assuming the URL is set in the LoginPage class)

        test.log(Status.INFO, "Starting test case");

        // Perform login actions
        loginPage.clickSignIn();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        if (loginPage.welcomePage.isDisplayed()) {
            test.log(Status.PASS, "Login successful");
        } else {
            test.log(Status.FAIL, "Login failed");
        }

    }

    @DataProvider(name = "testdata")
    public Object[][] testData() {
    	return new Object[][] {{"jhonsena@gmail.com", "Ab1111@2222"}};
    }
    @Test(dataProvider = "testdata1")
    public void testLoginInvalidUser(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);

        // Navigate to the login page (assuming the URL is set in the LoginPage class)

        test.log(Status.INFO, "Starting test case");

        // Perform login actions
        loginPage.clickSignIn();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        String err = loginPage.getAlertLabelText();

        Assert.assertEquals(err,
                "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");

    }
    @DataProvider(name = "testdata1")
    public Object[][] testData1() {
    	return new Object[][] {{"jj@gnau.com", "Ab1111@2222"}};
    }
}
