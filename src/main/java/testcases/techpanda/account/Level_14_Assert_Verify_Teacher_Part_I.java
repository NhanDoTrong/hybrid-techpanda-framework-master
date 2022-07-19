package testcases.techpanda.account;

import actions.pageObject.User.MyDashBoardPageObject;
import actions.pageObject.User.UserHomePageObject;
import actions.pageObject.User.UserLoginPageObject;
import actions.pageObject.navigation.PageGeneratorManager;
import cores.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Level_14_Assert_Verify_Teacher_Part_I extends BaseTest{
    WebDriver driver;
    UserHomePageObject homePageObject;
    UserLoginPageObject loginPageObject;
    MyDashBoardPageObject myDashBoardPageObject;

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName,url);
        driver.get("http://live.techpanda.org/");
        homePageObject = PageGeneratorManager.openUserHomePage(driver);
    }
   @Test
    public void TC_01_LoginWithEmptyEmailAndPassword()  {
        loginPageObject = homePageObject.clickToMyAccountLink();
        loginPageObject.inputToEmailAddressTextBox("");
        loginPageObject.inputToPasswordTextBox("");
        loginPageObject.clickToLoginButton();
        // False
       VerifyEquals(loginPageObject.getEmailAddressEmptyErrorMessage(),"This is a required field.testFaise");

       VerifyEquals(loginPageObject.getPasswordEmptyErrorMessage(),"This is a required field.");
    }

    @Test
    public void TC_02_LoginWithInvalidEmail() {
        loginPageObject.inputToEmailAddressTextBox("123@456.789");
        loginPageObject.inputToPasswordTextBox("123456");
        loginPageObject.clickToLoginButton();
        VerifyEquals(loginPageObject.getEmailAddressInvalidErrorMessage(), "Please enter a valid email address. For example johndoe@domain.com.");
    }

    @Test(description = "Email not exist in application")
    public void TC_03_LoginWithIncorrectEmail() {
        loginPageObject.inputToEmailAddressTextBox("auto_test" + getRandomNumber() + "@live.com");
        loginPageObject.inputToPasswordTextBox("123456");
        loginPageObject.clickToLoginButton();
        VerifyEquals(loginPageObject.emailPasswordIncorrectErrorMessage(), "Invalid login or password.");
    }

    @Test(description = "Password less than 6 characters")
    public void TC_04_LoginWithInvalidPassword() {
        loginPageObject.inputToEmailAddressTextBox("auto_test" + getRandomNumber() + "@live.com");
        loginPageObject.inputToPasswordTextBox("123");
        loginPageObject.clickToLoginButton();
        VerifyEquals(loginPageObject.passwordINValidErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
    }

    @Test
    public void TC_05_LoginWithIncorrectPassword() {
        loginPageObject.inputToEmailAddressTextBox("auto_test" + getRandomNumber() + "@live.com");
        loginPageObject.inputToPasswordTextBox("");
        loginPageObject.clickToLoginButton();
        VerifyEquals(loginPageObject.passwordINValidErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
    }

    @Test
    public void TC_06_LoginWithValidEmailAndPassword() {
        loginPageObject.inputToEmailAddressTextBox("automationfc.vn@gmail.com");
        loginPageObject.inputToPasswordTextBox("123123");
        myDashBoardPageObject = loginPageObject.clickToLoginButton();
        // False
        VerifyFalse(myDashBoardPageObject.getContactInformationByUserName().isDisplayed());

        VerifyTrue(myDashBoardPageObject.getContactInformationByEmail().isDisplayed());
        //False
        VerifyFalse(myDashBoardPageObject.getContactInformationByEmail().isDisplayed());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
