package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class MyApplicationsPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public MyApplicationsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
