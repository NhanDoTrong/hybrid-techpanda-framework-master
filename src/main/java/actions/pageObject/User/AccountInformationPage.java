package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class AccountInformationPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public AccountInformationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
