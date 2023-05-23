//package orangehrm;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import team2.base.CommonAPI;
//import team2.orangehrmpages.BuzzPage;
//import team2.orangehrmpages.HomePage;
//import team2.orangehrmpages.LoginPage;
//import team2.orangehrmpages.TimePage;
//import team2.utility.Utility;
//
//import java.util.Properties;
//
//public class TimeTest extends CommonAPI {
//    Logger log = LogManager.getLogger(TimeTest.class.getName());
//    Properties properties = Utility.loadProperties();
//    String validUsername = Utility.decode(properties.getProperty("orangehrm.username"));
//    String validPassword = Utility.decode(properties.getProperty("orangehrm.password"));
//
//    @Test
//    public void addingProjectPage(){
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        TimePage timePage = new TimePage(getDriver());
//        String expectedTitle = "Login";
//        String actualTitle = getCurrentTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);
//        loginPage.enterUsername(validUsername);
//        loginPage.enterPassword(validPassword);
//        loginPage.clickOnLoginButton();
//        String expectedHomePageHeader = "Dashboard";
//        String actualHomePageHeader = homePage.getHomePageHeaderText();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        waitFor(3);
//
//        timePage.clickTimeSection();
//        String expectedPageTitle = "Time";
//        String actualPageTitle = timePage.getTimeHeader();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        log.info("page title validation success");
//
//        timePage.clickOnProjectInfoDropdown();
//        timePage.selectProjectFromDropdown("Projects");
//        String expectProjectHeader = "Projects";
//        String actualProjectHeader = timePage.getProjectHeader();
//        Assert.assertEquals(expectedPageTitle,actualPageTitle);
//        log.info("Project header validation success");
//
//    }
//    @Test
//    public void searchProject(){
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        TimePage timePage = new TimePage(getDriver());
//        String expectedTitle = "Login";
//        String actualTitle = getCurrentTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);
//        loginPage.enterUsername(validUsername);
//        loginPage.enterPassword(validPassword);
//        loginPage.clickOnLoginButton();
//        String expectedHomePageHeader = "Dashboard";
//        String actualHomePageHeader = homePage.getHomePageHeaderText();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        waitFor(3);
//
//        timePage.clickTimeSection();
//        String expectedPageTitle = "Time";
//        String actualPageTitle = timePage.getTimeHeader();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        log.info("page title validation success");
//
//        timePage.clickOnProjectInfoDropdown();
//        timePage.selectProjectFromDropdown("Projects");
//        String expectProjectHeader = "Projects";
//        String actualProjectHeader = timePage.getProjectHeader();
//        Assert.assertEquals(expectedPageTitle,actualPageTitle);
//        log.info("Project header validation success");
//
//        timePage.selectCustomerName("Internal");
//        timePage.selectProjectName("Recruitment");
//        timePage.selectProjectAdmin("Paul  Collings");
//        timePage.clickOnSearchButton();
//        String expectedMessage = "(1) Record Found";
//        String actualMessage = timePage.getRecordFoundMessage();
//        Assert.assertEquals(expectedMessage,actualMessage);
//        log.info("message validation success");
//
//    }
//    @Test
//    public void employeeTimeSheet(){
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        TimePage timePage = new TimePage(getDriver());
//        String expectedTitle = "Login";
//        String actualTitle = getCurrentTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);
//        loginPage.enterUsername(validUsername);
//        loginPage.enterPassword(validPassword);
//        loginPage.clickOnLoginButton();
//        String expectedHomePageHeader = "Dashboard";
//        String actualHomePageHeader = homePage.getHomePageHeaderText();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        waitFor(3);
//
//        timePage.clickTimeSection();
//        String expectedPageTitle = "Time";
//        String actualPageTitle = timePage.getTimeHeader();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        log.info("page title validation success");
//
//        timePage.enterEmployeeName("Paul  Collings");
//        timePage.clickOnViewButton();
//        String expectNoMessage = "No Timesheets Found";
//        String actualNoMessage = timePage.getNoTimeSheetMessage();
//        Assert.assertEquals(expectNoMessage,actualNoMessage);
//        log.info("Message validation success");
//
//
//
//
//    }
//
//
//}
