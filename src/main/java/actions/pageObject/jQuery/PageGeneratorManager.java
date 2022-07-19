package actions.pageObject.jQuery;

import actions.pageObject.User.UserHomePageObject;
import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    public static HomePageObject openUserHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }
}
