package magento;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * This class extends the BaseTest class and provides additional functionality for
 * generating Extent Reports for test execution.
 */

public class BaseTestWithExtent extends BaseTest{

	protected ExtentReports extent;
	protected ExtentTest test;
	
	 /**
     * This method is executed before each test method and sets up Extent Reports.
     * It creates an ExtentSparkReporter and attaches it to ExtentReports.
     */

	@BeforeMethod
	public void setUpExtent() {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		
		//create ExtentReports and attach reporter(s)
		if(extent == null) {
		   extent = new ExtentReports();
		   extent.attachReporter(htmlReporter);
		}
		//creates a toggle for the given test, add all log events under it
		
		test = extent.createTest("Test", "Description");
	}

	
	/**
     * This method is executed after each test method and logs the test result
     * (PASS, FAIL, or SKIP) to the Extent Report.
     *
     * @param result The result of the test method.
     */
	
	@AfterMethod
	public void tearDownExtent(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test passed");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test failed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test skipped");
		}

        // Flush the Extent Report to generate the report file

		extent.flush();
	}
}
