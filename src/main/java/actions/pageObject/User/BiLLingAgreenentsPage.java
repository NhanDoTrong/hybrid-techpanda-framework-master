package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class BiLLingAgreenentsPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public BiLLingAgreenentsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
