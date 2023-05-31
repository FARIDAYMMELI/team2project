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
        WishlistPage wishlistPage = new WishlistPage(getDriver());

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
    @Test
    public void emailFriend(){
        WishlistPage wishlistPage = new WishlistPage(getDriver());
        wishlistPage.jewelry();
        String expectedPageTitle = "Jewelry";
        String actualPageTitle = wishlistPage.getTitleOfJewelryPage();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        log.info("page validation success");

        wishlistPage.engagementRing();
        wishlistPage.wishListButton();
        wishlistPage.wishListPage();
        wishlistPage.emailAFriendButton();
        String expectedTitlePage = "Email your wishlist to a friend";
        String actualTitlePage = wishlistPage.getTitleOfEmailAFriendPage();
        Assert.assertEquals(expectedTitlePage, actualTitlePage);
        log.info("page title validation");

    }
    @Test
    public void sendAFriendAEmail(){
        WishlistPage wishlistPage = new WishlistPage(getDriver());
        wishlistPage.jewelry();
        String expectedPageTitle = "Jewelry";
        String actualPageTitle = wishlistPage.getTitleOfJewelryPage();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        log.info("page validation success");

        wishlistPage.engagementRing();
        wishlistPage.wishListButton();
        wishlistPage.wishListPage();
        wishlistPage.emailAFriendButton();
        wishlistPage.friendsEmail("shahin@shahin.com");
        wishlistPage.usersOwnEmail("abc@abc.com");
        wishlistPage.aPersonalMessage("Hey girl");


    }

}
