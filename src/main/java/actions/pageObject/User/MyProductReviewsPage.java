package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class MyProductReviewsPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public MyProductReviewsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
