package actions.pageObject.User;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

    public static HomePageObject openHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static LoginPageObject openLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static MyDashBoardPageObject openMyDashBoard(WebDriver driver) {
        return new MyDashBoardPageObject(driver);
    }

    public static AccountDashboardPage openAccountDashboard (WebDriver driver) {
        return new AccountDashboardPage(driver);
    }

    public static AccountInformationPage openAccountInformation (WebDriver driver) {
        return new AccountInformationPage(driver);
    }

    public static AddressBookPage openAddressBook (WebDriver driver) {
        return new AddressBookPage(driver);
    }

    public static  MyOrdersPage openMyOrders (WebDriver driver) {
        return new MyOrdersPage(driver);
    }

    public static BiLLingAgreenentsPage openBiLLingAgreenents (WebDriver driver) {
        return new BiLLingAgreenentsPage(driver);
    }

    public static RecurringProfilesPage openRecurringProfiles (WebDriver driver) {
        return new RecurringProfilesPage(driver);
    }

    public static MyProductReviewsPage openMyProductReviews (WebDriver driver) {
        return new MyProductReviewsPage(driver);
    }

    public static MyWishListPage openMyWishList (WebDriver driver) {
        return new MyWishListPage(driver);
    }

    public static  MyApplicationsPage  openMyApplicationsPage(WebDriver driver) {
        return new MyApplicationsPage(driver);
    }

    public static NewsletterSubscriptionsPage openNewsletterSubscriptionsPage(WebDriver driver) {
        return new NewsletterSubscriptionsPage(driver);
    }
    public static MyDownLoadableProductsPage openMyDownLoadableProductsPage(WebDriver driver) {
        return new MyDownLoadableProductsPage(driver);
    }

}
