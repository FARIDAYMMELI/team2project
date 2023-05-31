package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.*;

public class ShoppingFromMenuButtonsTest extends CommonAPI {


    Logger log = LogManager.getLogger(ShoppingFromMenuButtonsTest.class.getName());

    String validUsername = "faridaymmeli@gmail.com";
   String validPassword = "Password14@";
    @Test
    public void shoppingFromShopButton() throws InterruptedException {
            MainPage mainPage = new MainPage(getDriver());
            LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
            MyAccountPage myAccountPage = new MyAccountPage(getDriver());
            ShopPage shopPage = new ShopPage(getDriver());
            CartPage cartPage = new CartPage(getDriver());
//        String validUsername = "faridaymmeli@gmail.com";
//        String validPassword = "Password14@";
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
            loginRegisterPage.typepassword(validPassword);
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

        @Test
        public void shoppingFromMenCollectionButton() throws InterruptedException {
            MainPage mainPage = new MainPage(getDriver());
            LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
            MyAccountPage myAccountPage = new MyAccountPage(getDriver());
            MenCollectionCategoriesPage menCollectionCategoriesPage = new MenCollectionCategoriesPage(getDriver());
            CartPage cartPage = new CartPage(getDriver());
//        String validUsername = "faridaymmeli@gmail.com";
//        String validPassword = "Password14@";
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
            loginRegisterPage.typepassword(validPassword);
            loginRegisterPage.clickOnLoginButton();
            //check user is logged in
            String expectedHomePageHeader = "My account";
            String actualHomePageHeader = myAccountPage.getHeaderText();
            Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
            waitFor(3);
            // Hover Over  and click  and click on  shop menu
            myAccountPage.clickOnMenCollectionNew();
            waitFor(3);
            // validation of Men collection page
            String expectedHomePageHeaderMen = "Men Collection";
            String actualHomePageHeaderMen = menCollectionCategoriesPage.getHeaderTextMenCollectionCategoriesPage();
            Assert.assertEquals(expectedHomePageHeaderMen, actualHomePageHeaderMen);
            waitFor(3);
            // add belt to cart by clicking to addToCart
            menCollectionCategoriesPage.clickOnAddToCartButtonMenCollection();
            // click on cart button
            menCollectionCategoriesPage.clickOnCartButtonOnMenCollection();
            Thread.sleep(3000);
                // validation of the new page cart page
            String cartTitle = getCurrentTitle();
            Assert.assertEquals(cartTitle, "Cart – Automation");
            // validation that the item ( guitar ) is added to the cart
            cartPage.HoverOverGuitar();
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
    @Test
    public void shoppingFromWomenCollectionButton() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        WomenCollectionCategoriesPage womenCollectionCategoriesPage = new WomenCollectionCategoriesPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        ConversePage conversePage = new ConversePage(getDriver());
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
        loginRegisterPage.typepassword(validPassword);
        loginRegisterPage.clickOnLoginButton();
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        waitFor(3);
        // Hover Over  and click  and click on  shop menu
        myAccountPage.clickOnWomenMenCollectionNew();
        waitFor(3);
        // validation of Women collection page
        String expectedHomePageHeaderWomen = "Women Collection";
        String actualHomePageHeaderWomen = womenCollectionCategoriesPage.getHeaderTextWomenCollectionCategoriesPage();
        Assert.assertEquals(expectedHomePageHeaderWomen, actualHomePageHeaderWomen);
        waitFor(3);
        // add nail polish to cart by clicking to addToCart
        womenCollectionCategoriesPage.clickOnAddToCartButtonWomenCollectionNailPolish();
        // click on cart button
        womenCollectionCategoriesPage.clickOnCartButtonOnWomenCollection();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        log.info( " cart page validation");
        // validation that the item ( converse ) is added to the cart
        cartPage.HoverOverNailPolish();
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

    @Test
    public void shoppingFromBlogButton() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        BlogPage blogPage = new BlogPage(getDriver());
        LaptopPage laptopPage = new LaptopPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
//        String validUsername = "faridaymmeli@gmail.com";
//        String validPassword = "Password14@";
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
        loginRegisterPage.typepassword(validPassword);
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
        String expectedHomePageHeaderBlog= "Blog";
        String actualHomePageHeaderBlog = blogPage.getHeaderTextBlogPage();
        Assert.assertEquals(expectedHomePageHeaderBlog, actualHomePageHeaderBlog);
        waitFor(3);
//        // add laptop to cart by clicking to addToCart
//        blogPage.clickOnAddToCartButtonBlog();
//        // click on cart button
//        blogPage.clickOnCartButtonOnBlogButton();
//        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( LAPTOP ) is added to the cart
        cartPage.HoverOverLaptop();
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
    @Test
    public void shoppingFromHomeButton() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        HomeButtonPage homeButtonPage = new HomeButtonPage(getDriver());
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
        loginRegisterPage.typepassword(validPassword);
        loginRegisterPage.clickOnLoginButton();
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        waitFor(3);
        // Hover Over  and click  and click on  home menu
        myAccountPage.clickOnHomeButton();
        waitFor(3);
        // validation of home  page
        String expectedHomePageHeaderHomeButton= "Onsale Products";
        String actualHomePageHeaderHomeButton = homeButtonPage.getHeaderTextHomeButtonPage();
        Assert.assertEquals(expectedHomePageHeaderHomeButton, actualHomePageHeaderHomeButton);
        waitFor(3);
        // add flying ninja to cart by clicking to addToCart
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
