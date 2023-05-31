package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.*;
import team2.utility.Utility;

import java.util.Properties;

public class ShoppingFromCategoriesTest  extends CommonAPI {

    Logger log = LogManager.getLogger(ShoppingFromCategoriesTest.class.getName());


    Properties prop = Utility.loadProperties();
    String validUsername = prop.getProperty("Scaledupit.username");
    String validPassword = prop.getProperty("Scaledupit.password");
    @Test

    public void shoppingFromWomenCollectionCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        WomenCollectionCategoriesPage womenCollectionCategoriesPage = new WomenCollectionCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
         myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
         myAccountPage.clickOnCategoryButton();
        waitFor(3);
        // click on Women Collection categories
          myAccountPage.clickOnWomenCollectionCategories();
          // validation of women collection page
        String expectedHomePageHeaderWomen = "Women Collection";
        String actualHomePageHeaderWomen = womenCollectionCategoriesPage.getHeaderTextWomenCollectionCategoriesPage();
        Assert.assertEquals(expectedHomePageHeaderWomen, actualHomePageHeaderWomen);
        waitFor(3);
          // add shoes nail polish to cart by clicking to addToCart
        womenCollectionCategoriesPage.clickOnAddToCartButtonWomenCollectionNailPolish();;
        // click on cart button
     womenCollectionCategoriesPage.clickOnCartButtonOnWomenCollection();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( shoes converse) is added to the cart
        cartPage.HoverOverNailPolish();
        waitFor(3);
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
    public void shoppingFromMenCollectionCategories() throws InterruptedException {
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on Men Collection categories
        myAccountPage.clickOnMenCollectionCategories();
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
        // validation that the item ( belt ) is added to the cart
        cartPage.HoverOverBelt();
        waitFor(3);
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
    public void shoppingFromMusicCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        MusicCategoriesPage musicCategoriesPage = new MusicCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on Music categories
        myAccountPage.clickOnMusicCategories();
        // validation of Men collection page
        String expectedHomePageHeaderMusic = "Music";
        String actualHomePageHeaderMusic = musicCategoriesPage.getHeaderTextMusicPage();
        Assert.assertEquals(expectedHomePageHeaderMusic, actualHomePageHeaderMusic);
        waitFor(3);
        // add Woo Album #1 to cart by clicking to addToCart
       musicCategoriesPage.clickOnAddToCartButtonMusic();
        // click on cart button
        musicCategoriesPage.clickOnCartButtonOnMusic();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( Woo Album #1) is added to the cart
        cartPage.HoverOverWooAlbum();
        waitFor(3);
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
    public void shoppingFromPostersCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        PostersCategoriesPage postersCategoriesPage = new PostersCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on Posters categories
        myAccountPage.clickOnPostersCategories();
        // validation of Poster page
        String expectedHomePageHeaderPosters = "Posters";
        String actualHomePageHeaderPosters = postersCategoriesPage.getHeaderTextPostersPage();
        Assert.assertEquals(expectedHomePageHeaderPosters, actualHomePageHeaderPosters);
        waitFor(3);
        // add Woo flying ninja to cart by clicking to addToCart
        postersCategoriesPage.clickOnAddToCartButtonPosters();
        // click on cart button
        postersCategoriesPage.clickOnCartButtonOnPosters();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( flying ninja ) is added to the cart
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
    @Test
    public void shoppingFromFeaturedBesideCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        FeaturedBesideCategoriesPage featuredBesideCategoriesPage = new FeaturedBesideCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on featured and beside  categories
        myAccountPage.clickOnFeaturedBesideCategories();
        // validation of featured beside page
        String expectedHomePageHeaderFeaturedBeside= "Featured Beside";
        String actualHomePageHeaderFeaturedBeside = featuredBesideCategoriesPage.getHeaderTextFeaturedBesidePage();
        Assert.assertEquals(expectedHomePageHeaderFeaturedBeside, actualHomePageHeaderFeaturedBeside);
        waitFor(3);
        // add bag collection to cart by clicking to addToCart
         featuredBesideCategoriesPage.clickOnAddToCartButtonFeaturedBeside();
        // click on cart button
        featuredBesideCategoriesPage.clickOnCartButtonOnFeaturedBeside();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( bag collection ) is added to the cart
        cartPage.HoverOverBagCollection();
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
    public void shoppingFromFeaturedCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        FeaturedCategoriesPage featuredCategoriesPage = new FeaturedCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on featured   categories
        myAccountPage.clickOnFeaturedCategories();
        // validation of featured  page
        String expectedHomePageHeaderFeatured= "Featured";
        String actualHomePageHeaderFeatured = featuredCategoriesPage.getHeaderTextFeaturedPage();
        Assert.assertEquals(expectedHomePageHeaderFeatured, actualHomePageHeaderFeatured);
        waitFor(3);
        // add women collection to cart by clicking to addToCart
        featuredCategoriesPage.clickOnAddToCartButtonFeatured();
        // click on cart button
        featuredCategoriesPage.clickOnCartButtonOnFeatured();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( bag collection ) is added to the cart
        cartPage.HoverOverWomenCollectionItem();
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
    public void shoppingFromClothingCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        ClothingCategoriesPage clothingCategoriesPage = new ClothingCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on clothing  categories
        myAccountPage.clickOnClothingCategories();
        // validation of featured  page
        String expectedHomePageHeaderClothing= "Clothing";
        String actualHomePageHeaderClothing = clothingCategoriesPage.getHeaderTextClothingPage();
        Assert.assertEquals(expectedHomePageHeaderClothing, actualHomePageHeaderClothing);
        waitFor(3);
        // add happy ninja to cart by clicking to addToCart
        clothingCategoriesPage.clickOnAddToCartButtonClothing();
        // click on cart button
        clothingCategoriesPage.clickOnCartButtonOnClothing();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( happy ninja  ) is added to the cart
        cartPage.HoverOverHappyNinja();
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
    public void shoppingFromShoesCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        ShoesCategoriesPage shoesCategoriesPage = new ShoesCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on shoes  categories
        myAccountPage.clickOnShoesCategories();
        // validation of shoes categories  page
        String expectedHomePageHeaderShoesCategories= "Shoes";
        String actualHomePageHeaderShoesCategories = shoesCategoriesPage.getHeaderTextShoesCategoriesPage();
        Assert.assertEquals(expectedHomePageHeaderShoesCategories, actualHomePageHeaderShoesCategories);
        waitFor(3);
        // add black shoes  to cart by clicking to addToCart
        shoesCategoriesPage.clickOnAddToCartButtonShoesCategories();
        // click on cart button
        shoesCategoriesPage.clickOnCartButtonOnShoesCategories();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( black shoes  ) is added to the cart
        cartPage.HoverOverBlackShoes();
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
    public void shoppingFromSuglassCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        SunglassCategoriesPage sunglassCategoriesPage = new SunglassCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on sunglass categories
        myAccountPage.clickOnSunglassCategories();
        // validation of sunglass categories  page
        String expectedHomePageHeaderSunglassCategories= "Sunglass";
        String actualHomePageHeaderSunglassCategories = sunglassCategoriesPage.getHeaderTextSunglassCategoriesPage();
        Assert.assertEquals(expectedHomePageHeaderSunglassCategories, actualHomePageHeaderSunglassCategories);
        waitFor(3);
        // add mountain glass  to cart by clicking to addToCart
        sunglassCategoriesPage.clickOnAddToCartButtonSunglassCategories();
        // click on cart button
        sunglassCategoriesPage.clickOnCartButtonOnSunglassCategories();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( mountain glass ) is added to the cart
        cartPage.HoverOverMountainGlass();
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
    public void shoppingFromBeautyCareCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        BeautyCareCategoriesPage beautyCareCategoriesPage = new BeautyCareCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on beauty care  categories
        myAccountPage.clickOnBeautyCareCategories();
        // validation of beauty care  categories  page
        String expectedHomePageHeaderBeautyCareCategories= "Beauty and Care";
        String actualHomePageHeaderBeautyCareCategories = beautyCareCategoriesPage.getHeaderTextBeautyCareCategoriesPage();
        Assert.assertEquals(expectedHomePageHeaderBeautyCareCategories, actualHomePageHeaderBeautyCareCategories);
        waitFor(3);
        // add hair care  to cart by clicking to addToCart
        beautyCareCategoriesPage.clickOnAddToCartButtonBeautyCareCategories();
        // click on cart button
        beautyCareCategoriesPage.clickOnCartButtonOnBeautyCareCategories();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( hair care  ) is added to the cart
        cartPage.HoverOverHairCare();
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
    public void shoppingFromFoodBeverageCategories() throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        FoodBeverageCategoriesPage foodBeverageCategoriesPage = new FoodBeverageCategoriesPage(getDriver());
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
        // Hover Over  and click on  Categories menu
        myAccountPage.hoverOverCategories(getDriver());
        waitFor(3);
        myAccountPage.clickOnCategoryButton();
        // click on food beverage  categories
        myAccountPage.clickOnFoodBeverageCategories();
        // validation of food beverage  categories  page
        String expectedHomePageHeaderFoodBeverageCategories= "Food & Beverage";
        String actualHomePageHeaderFoodBeverageCategories = foodBeverageCategoriesPage.getHeaderTextFoodBeverageCategoriesPage();
        Assert.assertEquals(expectedHomePageHeaderFoodBeverageCategories, actualHomePageHeaderFoodBeverageCategories);
        waitFor(3);
        // add Biscuits  to cart by clicking to addToCart
        foodBeverageCategoriesPage.clickOnAddToCartButtonFoodBeverageCategories();
        // click on cart button
        foodBeverageCategoriesPage.clickOnCartButtonOnBeautyCareCategories();
        Thread.sleep(3000);
        // validation of the new page cart page
        String cartTitle = getCurrentTitle();
        Assert.assertEquals(cartTitle, "Cart – Automation");
        // validation that the item ( biscuits ) is added to the cart
        cartPage.HoverOverBiscuits();
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
