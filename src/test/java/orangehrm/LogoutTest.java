package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.utility.Utility;

import java.util.Properties;

public class LogoutTest extends CommonAPI {
    Logger log = LogManager.getLogger(LoginTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void logout() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //check user is logged in
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        //check user is logged in
        String expectedHomePageHeader = "";
        String actualHomePageHeader = loginPage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        log.info("User logged in success");

        homePage.clickDropdownArrow();
        Thread.sleep(1000);
        homePage.clickLogoutButton();

        //check user is landed to the login page


        String expectedLoginPageHeaderText = "";
        String actualLoginPageHeaderText = loginPage.getHomePageHeaderText();
        Assert.assertEquals(actualLoginPageHeaderText,expectedLoginPageHeaderText);
        log.info("Login page header text validation success");
        captureScreenshot();




    }


}
