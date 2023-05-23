package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.HomePage;
import team2.npcommercepages.LoginPage;

public class HomePageTest extends CommonAPI {
    Logger log = LogManager.getLogger(HomePageTest.class.getName());


    @Test
    public void homePageTitles(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "Welcome to our store";
        String actualPageTitle = homePage.getHomePageTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        log.info("Home page title validation success");
    }

    @Test
    public void homePageFeaturedTitle(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "Featured products";
        String actualPageTitle = homePage.featuredTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("Featured title validation success");

    }
    @Test
    public void newsTitle(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "News";
        String actualPageTitle = homePage.homePageNewsTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("News title validation success");

    }
    @Test
    public void homePageCommunityTitle(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "Community poll";
        String actualPageTitle = homePage.communityTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("Community title validation success");
    }
    @Test
    public void homePageInformationElement(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "Information";
        String actualPageTitle = homePage.homePageInformation();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("Information element validation success");
    }
    @Test
    public void customerServiceTab(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "Customer service";
        String actualPageTitle = homePage.customerServiceElement();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("customer service element validation success");
    }
    @Test
    public void homePageMyAccountElement(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        String expectedPageTitle = "My account";
        String actualPageTitle = homePage.myAccountElement();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("my account element validation success");
    }
    @Test
    public void shippingAndReturnsElements(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        homePage.shippingAndReturns();
        String expectedPageTitle = "Shipping & returns";
        String actualPageTitle = homePage.shippingAndReturns();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("Shipping and returns validation success");
    }
}








