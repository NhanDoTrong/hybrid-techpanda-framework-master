package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class NewsletterSubscriptionsPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public NewsletterSubscriptionsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
