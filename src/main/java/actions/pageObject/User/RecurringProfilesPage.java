package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class RecurringProfilesPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public RecurringProfilesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
