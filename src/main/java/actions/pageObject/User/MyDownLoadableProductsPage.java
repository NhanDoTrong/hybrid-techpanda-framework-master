
package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class MyDownLoadableProductsPage extends actions.pageObject.navigation.SideBarMyAccountPageObject{
    WebDriver driver;

    public MyDownLoadableProductsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
