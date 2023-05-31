package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.LoginPage;
import team2.npcommercepages.RemoveItem;

public class RemoveItemTest extends CommonAPI {
    Logger log = LogManager.getLogger(RemoveItemTest.class.getName());
    @Test
    public void removeItems() {

//        LoginPage loginPage = new LoginPage(getDriver());
////        String expectedTitle = "nopCommerce demo store. Camera & photo";
////        String actualTitle = loginPage.getPageTitleMessage();
////        Assert.assertEquals(expectedTitle, actualTitle);
////        log.info("The page title validation success");

        RemoveItem removeItem = new RemoveItem(getDriver());
        removeItem.clickOnJewelry();
        String expectedPageTitle = "Jewelry";
        String actualPageTitle = removeItem.jeweleryPageHeader();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("Jewelry page title validation success");

        removeItem.flowerGirlBracelet();
        removeItem.addToCart();
        removeItem.shoppingCart();
        removeItem.removeButton();

        String expectedMessage = "Your Shopping Cart is empty!";
        String actualMessage = removeItem.getEmptyCartMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Empty cart message validation success");
    }
}
