package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.AdminPage;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.utility.Utility;

import java.util.Properties;

public class MagnifyingSearchBoxTest extends CommonAPI {
    Logger log = LogManager.getLogger(MagnifyingSearchBoxTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void searchBox(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        AdminPage adminPage = new AdminPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        waitFor(3);
        homePage.enterInMagnifyingSearchBox("Admin");
//        homePage.clickOnAdmin();
//        String expectedHeader = "Admin";
//        String actualHeader = adminPage.getAdminHeader();
//        Assert.assertEquals(expectedHeader,actualHeader);
//        log.info("Admin page header validation success");

    }

}
