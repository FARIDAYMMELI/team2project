package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.*;

public class ShoppingCartManagement extends CommonAPI {

    Logger log = LogManager.getLogger(LoginTest.class.getName());

    @Test

    public void searchAndAddProductToCart() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        ShoesPage shoesPage  = new ShoesPage(getDriver());
        LightShoesPage lightShoesPage = new LightShoesPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());


        String validUsername = "faridaymmeli@gmail.com";
        String validPassword = "Password14@";
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
        log.info("enter email success");
        loginRegisterPage.typepassword(validPassword);
        log.info("enter password success");

        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user logged in success");
        waitFor(3);


        // type shoes on research box

        myAccountPage.typeItemToSearch("shoes");
        myAccountPage.clickOnSearchButton();
       // validation of research by shoes page title

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Search Results for “shoes” – Automation");
        log.info("shoes search title validation success");

        // click on readmore for light shoe on shoespage

        shoesPage.ClickOnReadMoreLightShoes();

        // validate the new page of light shoe title
        String newTitle = getCurrentTitle();
        Assert.assertEquals(newTitle, "Light Shoes – Automation");
        log.info("Light shoes page  title validation success");

        // click on add to cart in light shoe Page
        lightShoesPage.clickOnAddToCartButton();

        // go to shopping cart and verify is there
        // click on cart button
        myAccountPage.clickOnCartButton();
        Thread.sleep(3000);

        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        log.info("cart  page  title validation success");

        // verification that the item added ( light shoes ) is inside the cart
        cartPage.HoverOverLightShoes();
        log.info("the light shoe is added to the cart");


    }

    public void ApplyCoupon() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        ShoesPage shoesPage  = new ShoesPage(getDriver());
        LightShoesPage lightShoesPage = new LightShoesPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());


        String validUsername = "faridaymmeli@gmail.com";
        String validPassword = "Password14@";
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
        log.info("enter email success");
        loginRegisterPage.typepassword(validPassword);
        log.info("enter password success");

        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user logged in success");
        waitFor(3);


        // type shoes on research box

        myAccountPage.typeItemToSearch("shoes");
        myAccountPage.clickOnSearchButton();
        // validation of research by shoes page title

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Search Results for “shoes” – Automation");
        log.info("shoes search title validation success");

        // click on readmore for light shoe on shoespage

        shoesPage.ClickOnReadMoreLightShoes();

        // validate the new page of light shoe title
        String newTitle = getCurrentTitle();
        Assert.assertEquals(newTitle, "Light Shoes – Automation");
        log.info("Light shoes page  title validation success");

        // click on add to cart in light shoe Page
        lightShoesPage.clickOnAddToCartButton();

        // go to shopping cart and verify is there
        // click on cart button
        myAccountPage.clickOnCartButton();

        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        log.info("cart  page  title validation success");

        // verification that the item added ( light shoes ) is inside the cart
        cartPage.HoverOverLightShoes();
        log.info("the light shoe is added to the cart");
        // change the quantity of light shoes in cart page
        cartPage.typeCoupon("farida");

        // click on coupon button
        cartPage.clickOnCouponButton();

        // expected error message verified

        String expectedErrorCoupon = "Coupon \"farida\" does not exist!";
        String actualErrorCoupon = cartPage.getErrorMessageCoupon();
        Assert.assertEquals(expectedErrorCoupon, actualErrorCoupon);
        log.info("validate error success");




    }

    @Test
    public void EmptyShoppingCart() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());

        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());

        String validUsername = "faridaymmeli@gmail.com";
        String validPassword= "Password14@";
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
        log.info("enter email success");
        loginRegisterPage.typepassword(validPassword);
        log.info("enter password success");

        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user logged in success");
        waitFor(3);

        // click on cart button
        myAccountPage.clickOnCartButton();


        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        log.info("cart  page  title validation success");

        // verification that the item wanted to delete ( light shoes ) is inside the cart
        cartPage.HoverOverLightShoes();
        log.info("the light shoe is added to the cart");
        Thread.sleep(3000);
        // delete the item


        cartPage.clickOnDeleteButton();

        // verify the light shoes is removed
        String expectedError = "“Light Shoes” removed.";
        String actualError = cartPage.getErrorMessageRemove();
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success");
        // verify the shopping cart is empty
        String expectedErrorCart = "our cart is currently empty.";
        String actualErrorCart = cartPage.getErrorMessageEmpty();
        Assert.assertEquals(expectedErrorCart, actualErrorCart);

    }
}
