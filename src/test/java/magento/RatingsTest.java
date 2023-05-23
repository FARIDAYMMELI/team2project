package magento;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.magentopages.*;

public class RatingsTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(RatingsTest.class.getName());

    @Test
    public void AddThefirstratingAndReview() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        ShopNewYogaPage shopNewYogaPage = new ShopNewYogaPage(getDriver());
        ElisaEverCoolTeePage elisaEverCoolTeePage = new ElisaEverCoolTeePage(getDriver());

        homePage.clickOnSigninButton();
        // String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "login page title");
        String expectedTitle="Customer Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        // String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress("thonmoy.b@icloud.com");
        // String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword("password&1234");
        signinPageMagento.clickOnSigninButton2();
        //String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key", "home page title");
        String expectedTitle1="Home Page";
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        LOG.info("Signin success");
        homePage.clickOnShopNewYoga();

        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "New Luma Yoga Collection");
        LOG.info("shop New Yoga  title page validation success");

        shopNewYogaPage.clickOnElisaEverCoolTee();
        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Elisa EverCool™ Tee");
        LOG.info("Elisa ever cool Tee  title page validation success");
        Thread.sleep(3000);
        elisaEverCoolTeePage.clickOnReviews();
        elisaEverCoolTeePage.hoverOverRatingButton(getDriver());

        elisaEverCoolTeePage.typeSummary("Nice product");
        Thread.sleep(3000);
        elisaEverCoolTeePage.typeReview("Perfect");
        elisaEverCoolTeePage.clickOnSubmitReview();

    }


}