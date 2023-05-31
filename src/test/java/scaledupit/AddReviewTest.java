package scaledupit;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.*;
import team2.utility.ExcelReader;

import java.io.File;
import java.util.List;

public class AddReviewTest extends CommonAPI {
    Logger log = LogManager.getLogger(ShoppingFromMenuButtonsTest.class.getName());

    String currentDir = System.getProperty("user.dir");
    String path = currentDir+File.separator+"data"+File.separator+"scaledupit"+File.separator+ "scaleupit.xlsx";
    ExcelReader excelReader = new ExcelReader(path);
    String validUsername = excelReader.getDataFromCell("data", 1, 1);
    String validPassword = excelReader.getDataFromCell("data", 2, 1);

//    String validUsername = "faridaymmeli@gmail.com";
//    String validPassword = "Password14@";
    @Test
    public void AddReviewTest() throws InterruptedException {

            MainPage mainPage = new MainPage(getDriver());
            LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
            MyAccountPage myAccountPage = new MyAccountPage(getDriver());
            ShopPage shopPage = new ShopPage(getDriver());
            GuitarPage guitarPage = new GuitarPage(getDriver());
            CartPage cartPage = new CartPage(getDriver());
            // navigate to scaledupit website
            String expectedTitle = "Automation – Automate eCommerce";
            String actualTitle = getCurrentTitle();
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
            loginRegisterPage.typeInvalidPassword(validPassword);
            loginRegisterPage.clickOnLoginButton();

            //check user is logged in
            String expectedHomePageHeader = "My account";
            String actualHomePageHeader = myAccountPage.getHeaderText();
            Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
            waitFor(3);
            // Hover Over  and click  and click on  shop menu
            myAccountPage.clickOnShopButton();
            waitFor(3);
            // validation of shop  page
            String expectedHomePageHeaderShop= "Shop";
            String actualHomePageHeaderShop = shopPage.getHeaderTextShopPage();
            Assert.assertEquals(expectedHomePageHeaderShop, actualHomePageHeaderShop);
            waitFor(3);
            // add guitar to cart by clicking to addToCart
            shopPage.clickOnAddToCartButtonShop();
            // click on cart button
            shopPage.clickOnCartButtonOnShopButton();
            Thread.sleep(3000);
            // validation of the new page cart page
            String cartTitle = getCurrentTitle();
            Assert.assertEquals(cartTitle, "Cart – Automation");
            // validation that the item ( guitar ) is added to the cart
            cartPage.HoverOverGuitar();
            waitFor(3);
        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Guitar – Automation");
        log.info("Guitar page validation success");
        guitarPage.clickReviewButton();
        guitarPage.clickRating();
        guitarPage.typeReview("very good");
        guitarPage.clickOnSubmitButton();
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

