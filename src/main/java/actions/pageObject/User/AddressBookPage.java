package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class AddressBookPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public AddressBookPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
