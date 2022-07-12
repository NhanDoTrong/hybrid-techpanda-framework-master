package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class MyOrdersPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public MyOrdersPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
