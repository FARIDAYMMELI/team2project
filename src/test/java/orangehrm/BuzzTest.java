package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.BuzzPage;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.MyInfoPage;
import team2.utility.Utility;

import java.util.Properties;

public class BuzzTest extends CommonAPI {
    Logger log = LogManager.getLogger(AdminTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void newsFeedPost(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        BuzzPage buzzPage = new BuzzPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);

        buzzPage.clickOnBuzzSection();
        String expectedMessage = "Dashboard";
        String actualMessage = buzzPage.getPageMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Page message validation success");


    }
}
