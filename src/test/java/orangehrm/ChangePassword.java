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

public class ChangePassword extends CommonAPI {
    Logger log = LogManager.getLogger(ChangePassword.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void password() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        waitFor(3);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        waitFor(3);

        homePage.clickDropdownArrow(); //
        Thread.sleep(1000);
        homePage.clickOnChangePasswordOption();
        String expectedPageHeader = "Update Password";
        String actualPageHeader = homePage.getPageHeaderText();
        Assert.assertEquals(expectedPageHeader,actualPageHeader);
        log.info("Page header validation success");

        homePage.enterCurrentPassword("admin123");
        homePage.enterNewPassword("she420420");
        homePage.enterConfirmPassword("she420420");
        homePage.clickOnSaveButton();

        String expectedPIMheader = "PIM";
        String actualPIMheader = homePage.getPIMmessage();
        Assert.assertEquals(expectedPIMheader,actualPIMheader);
        log.info("Password update validation success");


    }

}
