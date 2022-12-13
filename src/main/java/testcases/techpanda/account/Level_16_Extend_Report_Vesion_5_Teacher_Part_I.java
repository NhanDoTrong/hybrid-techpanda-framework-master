package testcases.techpanda.account;

import actions.pageObject.User.MyDashBoardPageObject;
import actions.pageObject.User.UserHomePageObject;
import actions.pageObject.User.UserLoginPageObject;
import actions.pageObject.navigation.PageGeneratorManager;
import com.aventstack.extentreports.Status;
import cores.common.BaseTest;
import cores.reportConfig.ExtentManager;
import cores.reportConfig.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.AssertJUnit.*;


public class Level_16_Extend_Report_Vesion_5_Teacher_Part_I extends BaseTest {
    WebDriver driver;
    UserHomePageObject homePageObject;
    UserLoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;
    String emailTextbox = "123@456.789";

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        driver.get("http://live.techpanda.org/");
        homePageObject = PageGeneratorManager.openUserHomePage(driver);

    }

    @Test
    public void TC_01_LoginWithEmptyEmailAndPassword(Method method) {
        ExtentTestManager.startTest(method.getName(),"Login with empty Email and Password");
        ExtentTestManager.getTest().log(Status.INFO,"Login - Step 01 : Click to my account link");
        loginPageObject = homePageObject.clickToMyAccountLink();

        ExtentTestManager.getTest().log(Status.INFO,"Login - Step 02 : Enter to Email Address textbox with empty Email");
        loginPageObject.inputToEmailAddressTextBox("");

        ExtentTestManager.getTest().log(Status.INFO,"Login - Step 03 : Enter to Password textbox with empty Password");
        loginPageObject.inputToPasswordTextBox("");

        ExtentTestManager.getTest().log(Status.INFO,"Login - Step 04 : Click to button Login");
        loginPageObject.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO,"Login - Step 05 : Verify error Password message Empty");
        assertEquals(loginPageObject.getPasswordEmptyErrorMessage(), "This is a required field.");
    }

    @Test
    public void TC_02_LoginWithInvalidEmail(Method method) {
        ExtentTestManager.startTest(method.getName(),"Login with error Email ");
        ExtentTestManager.getTest().log(Status.INFO,"Login_02-Step 01 : Enter Email  Textbox with " + emailTextbox);
        loginPageObject.inputToEmailAddressTextBox(emailTextbox);

        ExtentTestManager.getTest().log(Status.INFO,"Login_02-Step 02 : Enter to Password textbox with  Password");
        loginPageObject.inputToPasswordTextBox("123456");

        ExtentTestManager.getTest().log(Status.INFO,"Login_02-Step 03 : Click to button Login");
        loginPageObject.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO,"Login_02-Step 04 : Verify error email address message ");
        assertEquals(loginPageObject.getEmailAddressInvalidErrorMessage(), "Please enter a valid email address. For example johndoe@domain.com.");
    }

    @Test()
    public void TC_03_LoginWithIncorrectEmail(Method method) {
        ExtentTestManager.startTest(method.getName(),"Login with InCorrect  Email ");
        ExtentTestManager.getTest().log(Status.INFO,"Login_03-Step 01 : Enter Email  Textbox with InCorrect" );
        loginPageObject.inputToEmailAddressTextBox("auto_test" + getRandomNumber() + "@live.com");

        ExtentTestManager.getTest().log(Status.INFO,"Login_03-Step 02 : Enter to Password textbox with  Password");
        loginPageObject.inputToPasswordTextBox("123456");

        ExtentTestManager.getTest().log(Status.INFO,"Login_03-Step 03 : Click to button Login");
        loginPageObject.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO,"Login_03-Step 04 : Verify error email address message ");
        assertEquals(loginPageObject.emailPasswordIncorrectErrorMessage(), "Invalid login or password.");
    }

    @Test()
    public void TC_04_LoginWithInvalidPassword(Method method) {
        ExtentTestManager.startTest(method.getName(),"Password less than 6 characters");
        ExtentTestManager.getTest().log(Status.INFO,"Login_04-Step 01 : Enter Email  Textbox with Correct" );
        loginPageObject.inputToEmailAddressTextBox("auto_test" + getRandomNumber() + "@live.com");

        ExtentTestManager.getTest().log(Status.INFO,"Login_04-Step 02 : Enter to Password textbox with InCorrect Password");
        loginPageObject.inputToPasswordTextBox("123");

        ExtentTestManager.getTest().log(Status.INFO,"Login_04-Step 03 : Click to button Login");
        loginPageObject.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO,"Login_04-Step 04 : Verify error password message ");
        assertEquals(loginPageObject.passwordINValidErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
    }

    @Test
    public void TC_05_LoginWithIncorrectPassword(Method method) {
        ExtentTestManager.startTest(method.getName(),"Login with incorect Password");
        ExtentTestManager.getTest().log(Status.INFO,"Login_05-Step 01 : Enter Email  Textbox with Correct" );
        loginPageObject.inputToEmailAddressTextBox("auto_test" + getRandomNumber() + "@live.com");

        ExtentTestManager.getTest().log(Status.INFO,"Login_05-Step 02 : Enter empty Password" );
        loginPageObject.inputToPasswordTextBox("");

        ExtentTestManager.getTest().log(Status.INFO,"Login_05-Step 03 : Click to button Login");
        loginPageObject.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO,"Login_05-Step 04 : Verify error password message ");
        assertEquals(loginPageObject.passwordINValidErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
    }

    @Test
    public void TC_06_LoginWithValidEmailAndPassword(Method method) {
        ExtentTestManager.startTest(method.getName(),"Login with invalid Email and Password");
        ExtentTestManager.getTest().log(Status.INFO,"Login_06-Step 01 : Enter  invalid Email" );
        loginPageObject.inputToEmailAddressTextBox("automationfc.vn@gmail.com");

        ExtentTestManager.getTest().log(Status.INFO,"Login_06-Step 02 : Enter  invalid Password" );
        loginPageObject.inputToPasswordTextBox("123123");

        ExtentTestManager.getTest().log(Status.INFO,"Login_06-Step 03 : Click to button Login");
        myDashBoardPageObject = loginPageObject.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO,"Login_06-Step 04 : Verify Contact Pass");
        assertTrue(myDashBoardPageObject.getContactInformationByEmail().isDisplayed());
        //False
        ExtentTestManager.getTest().log(Status.INFO,"Login_06-Step 04 : Verify Contact False");
        assertFalse(myDashBoardPageObject.getContactInformationByEmail().isDisplayed());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}

