//package orangehrm;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import team2.base.CommonAPI;
//import team2.orangehrmpages.HomePage;
//import team2.orangehrmpages.LeavePage;
//import team2.orangehrmpages.LoginPage;
//import team2.orangehrmpages.TimePage;
//import team2.utility.Utility;
//
//import java.util.Properties;
//
//public class LeaveTest extends CommonAPI {
//    Logger log = LogManager.getLogger(LeaveTest.class.getName());
//    Properties properties = Utility.loadProperties();
//    String validUsername = Utility.decode(properties.getProperty("orangehrm.username"));
//    String validPassword = Utility.decode(properties.getProperty("orangehrm.password"));
//
//    @Test
//    public void addLeaveEntitlement(){
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        LeavePage leavePage = new LeavePage(getDriver());
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
//        leavePage.clickOnLeaveSection();
//        String expectedPageHeader = "Leave";
//        String actualPageHeader = leavePage.getPageHeaderText();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//        log.info("Page header validation success");
//
//        leavePage.clickOnEntitlement();
//        leavePage.clickOnAddEntitlement();
//        String expectedAddLeavePageHeader = "Add Leave Entitlement";
//        String actualAddLeavePageHeader = leavePage.getAddLeaveEntitlementPageHeaderText();
//        Assert.assertEquals(expectedAddLeavePageHeader,actualAddLeavePageHeader);
//        log.info("Add leave page validation success");
//
//        leavePage.clickOnIndividualRadioButton();
//        leavePage.enterEmployeeName("Charlie  Carter");
//        leavePage.clickLeaveTypeDropdown();
//        leavePage.selectUSVacation("US - Vacation");
//        leavePage.clickOnLeavePeriodDropdown();
//        leavePage.selectLeavePeriod("2023-01-01 - 2023-12-31");
//        leavePage.enterEntitlement("02");
//        leavePage.clickOnSaveButton();
//        leavePage.clickOnConfirmButton();
//        String expecredAddMessage = " Add ";
//        String actualAddMessage = leavePage.getaddValidationMessage();
//        Assert.assertEquals(expecredAddMessage,actualAddMessage);
//        log.info("add message validation success");
//
//
//    }
//
//}
