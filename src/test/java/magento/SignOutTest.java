package magento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.magentopages.HomePage;
import team2.magentopages.SigninPage;

import java.time.Duration;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;


public class SignOutTest extends CommonAPI {
    Logger log = LogManager.getLogger(SignOutTest.class.getName());

    @Test
    public void signOutFromHomepage() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        homePage.clickOnSigninButton();
        //String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "login page title");
        String expectedTitle="Customer Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        //String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress("thonmoy.b@icloud.com");
        //String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword("password&1234");
        signinPageMagento.clickOnSigninButton2();
       // String expectedTitle1 = read.getCellValueForGivenHeaderAndKey("key", "home page title");

        String expectedTitle1="Home Page";
        String actualTitle1 = getCurrentTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        LOG.info("Signin success");

        homePage.clickOnDropDown();
        homePage.clickOnSignOut();
    }
}
