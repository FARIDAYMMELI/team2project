package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.LoginPage;
import team2.npcommercepages.WishlistPage;
import java.util.Properties;
public class WishListTest extends CommonAPI {

    Logger log = LogManager.getLogger(WishListTest.class.getName());

    @Test

    public void JewelryPage() {
        LoginPage loginPage = new LoginPage(getDriver());
        WishlistPage wishlistPage = new WishlistPage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("page title validation success, user is in the homepage");

    wishlistPage.jewelry();
    String expectedPageTitle = "Jewelry";
    String actualPageTitle = wishlistPage.getTitleOfJewelryPage();
    Assert.assertEquals(actualPageTitle, expectedPageTitle);
    log.info("page validation success");

    wishlistPage.engagementRing();
    wishlistPage.wishListButton();
    wishlistPage.wishListPage();
    String expectedTitleOfPage = "Wishlist";
    String actualTitleOfPage = wishlistPage.getTitleOfJewelryPage();
    Assert.assertEquals(expectedTitleOfPage, actualTitleOfPage);
    log.info("page validation success");

    }

}
