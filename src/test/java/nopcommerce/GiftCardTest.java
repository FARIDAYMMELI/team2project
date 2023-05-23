package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.GiftCard;
import team2.npcommercepages.LoginPage;

public class GiftCardTest extends CommonAPI {
    Logger log = LogManager.getLogger(GiftCardTest.class.getName());

    @Test
    public void giftCards() {
        LoginPage loginPage = new LoginPage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        GiftCard giftCard =  new GiftCard(getDriver());
        giftCard.giftCard();
        giftCard.giftCardAmount();
        giftCard.friendsName("Shahin");
        giftCard.friendEmail("abc@abc.com");
        giftCard.userEmail("Tamanna@begum.com");
        giftCard.userName("Tamanna");
        giftCard.message("Heres a gift for you");
        giftCard.addToCart();
        giftCard.cart();

        String expectedPageTitle= "Shopping cart";
        String actualPageTitle = giftCard.shoppingCartPage();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("Shopping card page validation success");




    }
}