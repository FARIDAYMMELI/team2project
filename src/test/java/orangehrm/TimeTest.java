package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.BuzzPage;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.TimePage;
import team2.utility.Utility;

import java.util.Properties;

public class TimeTest extends CommonAPI {
    Logger log = LogManager.getLogger(TimeTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void addingProjectPage(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        TimePage timePage = new TimePage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);

        timePage.clickTimeSection();
        String expectedPageTitle = "Time";
        String actualPageTitle = timePage.getTimeHeader();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
        log.info("page title validation success");

        timePage.clickOnProjectInfoDropdown();
        timePage.clickProjectFromDropdown();
        String expectProjectHeader = "Projects";
        String actualProjectHeader = timePage.getProjectHeader();
        Assert.assertEquals(expectProjectHeader,actualProjectHeader);
        log.info("Project header validation success");

   }
    @Test
    public void searchProject(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        TimePage timePage = new TimePage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);


        timePage.clickTimeSection();
        String expectedPageTitle = "Time";
        String actualPageTitle = timePage.getTimeHeader();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
        log.info("page title validation success");

        timePage.clickOnProjectInfoDropdown();
        timePage.clickProjectFromDropdown();
        String expectProjectHeader = "Projects";
        String actualProjectHeader = timePage.getProjectHeader();
        Assert.assertEquals(expectProjectHeader,actualProjectHeader);
        log.info("Project header validation success");

        timePage.enterCustomerName("Internal");
        timePage.clickOnCustormerName();
        timePage.enterProjectName("Recruitment");
        timePage.enterProjectAdmin("Paul  Collings");
        timePage.clickOnResetButton();
        String expectedMessage = "Reset";
        String actualMessage = timePage.getRecordFoundMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("message validation success");

    }
    @Test
    public void employeeTimeSheet(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        TimePage timePage = new TimePage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);


        timePage.clickTimeSection();
        String expectedPageTitle = "Time";
        String actualPageTitle = timePage.getTimeHeader();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
        log.info("page title validation success");

        timePage.enterEmployeeName("Paul Collings");
        String expectedViewMessage = "View";
        String actualViewMessage = timePage.getViewButtonText();
        Assert.assertEquals(expectedViewMessage,actualViewMessage);
        log.info("Message validation success");


    }


}
