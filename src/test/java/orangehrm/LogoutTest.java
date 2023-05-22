package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;

public class LogoutTest extends CommonAPI {
    Logger log = LogManager.getLogger(LoginTest.class.getName());
    String validUsername = "Admin";
    String validPassword = "admin123";

    @Test
    public void logout() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //check user is logged in
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        //check user is logged in
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = loginPage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        log.info("User logged in success");

        homePage.clickDropdownArrow();
        Thread.sleep(1000);
        homePage.clickLogoutButton();

        //check user is landed to the login page
        Assert.assertTrue(loginPage.checkPresenceOfLoginPageHeader());

        String expectedLoginPageHeaderText = "OrangeHRM";
        String actualLoginPageHeaderText = loginPage.getHomePageHeaderText();
        Assert.assertEquals(actualLoginPageHeaderText,expectedLoginPageHeaderText);
        log.info("Login page header text validation success");
        captureScreenshot();




    }


}
