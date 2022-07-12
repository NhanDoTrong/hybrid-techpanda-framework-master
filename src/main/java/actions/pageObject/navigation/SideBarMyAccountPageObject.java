package actions.pageObject.navigation;

import actions.pageObject.User.*;
import interfaces.pageUIs.User.SideBarMyAccountPageUI;
import org.openqa.selenium.WebDriver;

public class SideBarMyAccountPageObject extends cores.common.BasePage_Executor{
    WebDriver driver;

    public SideBarMyAccountPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public AccountInformationPage openAccountInformation() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.ACCOUNT_INFORMATION);
        clickToElement(driver, SideBarMyAccountPageUI.ACCOUNT_INFORMATION);
        return PageGeneratorManager.openAccountInformation(driver);
    }

    public AddressBookPage openAddressBookPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.ADDRESS_BOOK);
        clickToElement(driver, SideBarMyAccountPageUI.ADDRESS_BOOK);
        return PageGeneratorManager.openAddressBook(driver);
    }

    public MyOrdersPage openMyOrdersPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.MY_ORDERS);
        clickToElement(driver, SideBarMyAccountPageUI.MY_ORDERS);
        return PageGeneratorManager.openMyOrders(driver);
    }

    public BiLLingAgreenentsPage openBiLLingAgreenentsPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.BILLING_AGREEMENTS);
        clickToElement(driver, SideBarMyAccountPageUI.BILLING_AGREEMENTS);
        return PageGeneratorManager.openBiLLingAgreenents(driver);
    }

    public RecurringProfilesPage openRecurringProfilesPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.RECURRING_PROFILES);
        clickToElement(driver, SideBarMyAccountPageUI.RECURRING_PROFILES);
        return PageGeneratorManager.openRecurringProfiles(driver);
    }

    public MyProductReviewsPage openMyProductReviewsPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.MY_PRODUCT_REVIEWS);
        clickToElement(driver, SideBarMyAccountPageUI.MY_PRODUCT_REVIEWS);
        return PageGeneratorManager.openMyProductReviews(driver);
    }

    public MyWishListPage openMyWishListPage(WebDriver driver) {
        waitForElementClickable(driver, SideBarMyAccountPageUI.MY_WISHLIST);
        clickToElement(driver, SideBarMyAccountPageUI.MY_WISHLIST);
        return PageGeneratorManager.openMyWishList(driver);
    }

    public MyApplicationsPage openMyApplicationsPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.MY_APPLICATIONS);
        clickToElement(driver, SideBarMyAccountPageUI.MY_APPLICATIONS);
        return PageGeneratorManager.openMyApplicationsPage(driver);
    }

    public NewsletterSubscriptionsPage openNewsletterSubscriptionsPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.NEWSLETTER_SUBSCRIPTIONS);
        clickToElement(driver, SideBarMyAccountPageUI.NEWSLETTER_SUBSCRIPTIONS);
        return PageGeneratorManager.openNewsletterSubscriptionsPage(driver);
    }

    public MyDownLoadableProductsPage openMyDownLoadableProductsPage() {
        waitForElementClickable(driver, SideBarMyAccountPageUI.MY_DOWNLOADABLE_PRODUCTS);
        clickToElement(driver, SideBarMyAccountPageUI.MY_DOWNLOADABLE_PRODUCTS);
        return PageGeneratorManager.openMyDownLoadableProductsPage(driver);
    }

}
