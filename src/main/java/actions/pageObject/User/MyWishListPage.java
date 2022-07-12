package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class MyWishListPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public MyWishListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
