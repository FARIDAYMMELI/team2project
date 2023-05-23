package magento;
import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import team2.magentopages.*;

public class ProductsPageTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(CreateAccountTest.class.getName());

        @Test
        public void displayingtheProducts() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento= new SigninPage(getDriver());
        PantsPage pantsPage = new PantsPage(getDriver());
        homePage.clickOnShopPantsToday();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Pants");
        LOG.info("Pants title page validation success");
        pantsPage.clickOnStyleButton();
        //pantsPage.clickOnBaseLayerButton();
        pantsPage.clickOnClimatBbutton();
        //pantsPage.clickOnColdButton();
        }

    @Test
    public void SortingtheProducts() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento= new SigninPage(getDriver());
        WomenProductsPage womenPage = new WomenProductsPage(getDriver());
        JacketsPage jacketsPage=new JacketsPage(getDriver());
        homePage.clickOnWomenProducts();
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Women");
        LOG.info("Women title page validation success");
        womenPage.clickOnJackets();
        String title2 = getCurrentTitle();
        Assert.assertEquals(title2, "Jackets - Tops - Women");
        LOG.info("Jackets title page validation success");
        jacketsPage.clicKOnList();
        jacketsPage.clicKOnGrid();
        jacketsPage.clickOnSigninButton();
        //String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "login page title");
        String expectedTitle="Customer Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        //String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress("thonmoy.b@icloud.com");
        //String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword("password&1234");
        signinPageMagento.clickOnSigninButton2();
        LOG.info("Signin success");
        jacketsPage.clickOnDropDown();
        jacketsPage.clickOnSignOut();
    }


    }




