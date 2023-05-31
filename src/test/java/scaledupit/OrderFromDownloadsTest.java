package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.*;
import team2.utility.Utility;

import java.util.Properties;

public class OrderFromDownloadsTest  extends CommonAPI {

    Logger log = LogManager.getLogger(scaledupit.UserRegistration.class.getName());
    Properties prop = Utility.loadProperties();
    String validUsername = prop.getProperty("Scaledupit.username");
    String validPassword = prop.getProperty("Scaledupit.password");



    // navigate to scaledupit website
    @Test
    public void OrdersFromDownloads() throws InterruptedException {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        HomeButtonPage homeButtonPage = new HomeButtonPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        OrdersPage ordersPage = new OrdersPage(getDriver());
        DownloadsPage downloadsPage = new DownloadsPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());

        String actualTitle = getCurrentTitle();
        String expectedTitle = "Automation – Automate eCommerce";
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Home page  title page validation success");
        waitFor(3);
        // click on MyAccount Button
        mainPage.clickOnMyAccountButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //enter  username, password, and click on login button
        loginRegisterPage.typeusername(validUsername);
        loginRegisterPage.typepassword(validPassword);


        loginRegisterPage.clickOnLoginButton();

        myAccountPage.clickOnDownloadButton();
        String expectedHomePageHeaderDownloads = "Downloads";
        String actualHomePageHeaderDownloads = downloadsPage.getHeaderTextDownloadsPage();
        Assert.assertEquals(expectedHomePageHeaderDownloads, actualHomePageHeaderDownloads);
        log.info("user downloads  page in success");
        waitFor(3);


        downloadsPage.setClickOnBrowseProduct();

        homeButtonPage.clickOnAddToCartButtonHome();
        // click on cart button
        homeButtonPage.clickOnCartButtonOnHomeButton();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( guitar ) is added to the cart
        cartPage.HoverOverFlyingNinja();
        waitFor(3);
        // click on my account
        mainPage.clickOnMyAccountButtonTop();
        Thread.sleep(3000);
        // click on log out
        myAccountPage.clickOnLogOut();
        // verify that logout process is working and are in main page again
        String expectedText = "LOGIN/REGISTER";
        String actualText = mainPage.getAText();
        Assert.assertEquals(expectedText, actualText);


    }
}
