package magento;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.magentopages.*;

public class SearchItemTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(SearchItemTest.class.getName());

    //ExcelReader read = new ExcelReader("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void searchAnItemAndAddToCart() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());

        //String expectedTitle = read.getCellValueForGivenHeaderAndKey("key","home page title");
        String expectedTitle="Home Page";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("Sign in title page validation success");
        String item = "Bag";
        homePage.typeItemToSearch(item);
        homePage.clickOnSearchButton();

        //String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key","Bag search title");
        String expectedTitle1="Search results for: 'Bag'";
        String actualTitle1 = getCurrentTitle();
        System.out.println(actualTitle1);
        Assert.assertEquals(expectedTitle1, actualTitle1);

        LOG.info("search bag title page validation success");
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickOnVoyageYogaBag();
        VoyageYogaPage voyageyoga=new VoyageYogaPage(getDriver());
        voyageyoga.clickOnAddToCartButton();

    }
    public void searchAnItemAndAddToWishList() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

       // String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress("thonmoy.b@icloud.com");
        //String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword("password&1234");
        signinPageMagento.clickOnSigninButton2();
        LOG.info("Signin success");
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Sign in title page validation success");

        String item = "jacket";
        homePage.typeItemToSearch(item);
        Thread.sleep(3000);
        homePage.clickOnSearchButton();
        String expectedTitle1="Search results for: 'jacket'";
        //String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key","jacket search title");
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);

        LOG.info("search jacket title page validation success");

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.hoverOverTyphonPerformanceFleecelinedJacket(getDriver());
        searchPage.clickOnAddToWishList();

    }

    @Test
    public void AdvancedSearch() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        AdvancedSearchPage advancedSearchPage=new AdvancedSearchPage(getDriver());

        homePage.clickOnAdvancedSearchButton();

        String title1= getCurrentTitle();
        Assert.assertEquals(title1, "Advanced Search");
        LOG.info("Advanced Search title page validation success");
        advancedSearchPage.typeProductName("pant");
        advancedSearchPage.typeSKU("pant");
        advancedSearchPage.typeDescription("large pant");
        advancedSearchPage.typeShortDescription("Black");
        advancedSearchPage.typePriceMinimum("20");
        advancedSearchPage.typePriceMaximum("70");
        advancedSearchPage.clickOnSearchButton();
        String errorMessage = advancedSearchPage.geterrorMessage();
        Assert.assertEquals(errorMessage, "We can't find any items matching these search criteria. Modify your search.");

    }
}
