package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LeavePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.PerformancePage;
import team2.utility.Utility;

import java.util.Properties;

public class PerformanceTest extends CommonAPI {
    Logger log = LogManager.getLogger(PerformanceTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void performance(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        PerformancePage performancePage = new PerformancePage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        waitFor(3);

        performancePage.clickOnPerformance();
        String expectedHeader = "Performance";
        String actualHeader = performancePage.getPerformanceHeaderText();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("Performance validation success");

        performancePage.clickMyTrackers();
        String expectedTrackerHeader = "";
        String actualTrackerHeader = performancePage.getMyTrackerHeader();
        Assert.assertEquals(expectedTrackerHeader,actualTrackerHeader);
        log.info("Tracker Header validation success");


    }


}
