package ShareData;

import ExtentUtility.ExtentUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Hooks {
    public String testName;
    @BeforeSuite
    public void initiateTestReport(){
      ExtentUtility.initiateReport();
    }

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        ExtentUtility.createTest(testName);
        prepareBrowser();

    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){

    }
}
