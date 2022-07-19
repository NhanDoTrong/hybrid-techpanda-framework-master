package cores.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class BaseTest {

    WebDriver driver;
    protected final Log log;
    public BaseTest() {
        log = LogFactory.getLog(getClass());
    }

    protected WebDriver getBrowserDriver(String browserName, String url) {
        browserList1 browserList = browserList1.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case CHROME:
                driver = WebDriverManager.chromedriver().create();
                break;
            case FIREFOX:
                driver = WebDriverManager.firefoxdriver().create();
                break;
            case EDGE:
                driver = WebDriverManager.edgedriver().create();
                break;
            default:
                throw new RuntimeException("Browser name is not  valid");
        }
        driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    protected WebDriver getBrowserDrivers(String browserName) {
        browserList1 browserList = browserList1.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case CHROME:
                driver = WebDriverManager.chromedriver().create();
//                WebDriverManager.chromedriver().browserVersion("101.0.4951.67").setup();
                break;
            case FIREFOX:
                driver = WebDriverManager.firefoxdriver().create();
                break;
            case EDGE:
                driver = WebDriverManager.edgedriver().create();
                break;
            default:
                throw new RuntimeException("Browser name is not  valid");
        }
        driver.manage().window().maximize();
        driver.get(GlobalConstants.LIVE_USER_URL);
        driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);

        return driver;
    }

    protected int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(999999);
    }

    protected boolean VerifyTrue(boolean condition) {
        boolean status = true;
        try {
            assertTrue(condition);
            log.info("---------------------------Passed---------------------------");
        } catch (Throwable e) {
            status = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
            log.info("---------------------------False---------------------------");

        }
        return status;
    }

    protected boolean VerifyFalse(boolean condition) {
        boolean status = true;
        try {
            assertFalse(condition);
            log.info("---------------------------Passed---------------------------");

        } catch (Throwable e) {
            status = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
            log.info("---------------------------False---------------------------");

        }
        return status;
    }

    protected boolean VerifyEquals(Object actual, Object expected) {
        boolean status = true;
        try {
            assertEquals(actual, expected);
            log.info("---------------------------Passed---------------------------");

        } catch (Throwable e) {
            status = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
            log.info("---------------------------False---------------------------");

        }
        return status;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
