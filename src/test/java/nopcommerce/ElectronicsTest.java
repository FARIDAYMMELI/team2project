package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.ElectronicsPage;
import team2.npcommercepages.LoginPage;

public class ElectronicsTest extends CommonAPI {

    Logger log = LogManager.getLogger(BooksTest.class.getName());

    @Test

    public void electronics(){
        LoginPage loginPage = new LoginPage(getDriver());
        ElectronicsPage electronicsPage = new ElectronicsPage(getDriver());
//        String expectedTitle = "nopCommerce demo store. Camera & photo";
//        String actualTitle = loginPage.getPageTitleMessage();
//        Assert.assertEquals(expectedTitle, actualTitle);
//        log.info("The page title validation success");



       electronicsPage.homePageElectronics();
//       electronicsPage.hoverOverOnTheElectronics();
//        String expectedPageTitle = "Camera & photo";
//        String actualPageTitle = electronicsPage.cameraAndPhotosTitle();
//        Assert.assertEquals(expectedPageTitle, actualPageTitle);
//        log.info("Page title is displayed success");





    }


}
