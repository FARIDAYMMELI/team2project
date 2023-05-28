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

public class AdminTest extends CommonAPI {
    Logger log = LogManager.getLogger(AdminTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

//    @Test
//    public void addButton(){
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        AdminPage adminPage = new AdminPage(getDriver());
//        String expectedTitle = "OrangeHRM";
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
//        adminPage.clickOnAdminButton();
//        String expectedHeader = "Admin";
//        String actualHeader = adminPage.getAdminHeader();
//        Assert.assertEquals(expectedHeader,actualHeader);
//        log.info("Admin header validation success");
//
//        adminPage.clickOnAddButton();
//        String expectedAddUserHeader = "Add User";
//        String actualAddUserHeader = adminPage.getAddUserHeader();
//        Assert.assertEquals(expectedAddUserHeader,actualAddUserHeader);
//
//
//    }
//
//@Test
//    public void searchButton(){
//    LoginPage loginPage = new LoginPage(getDriver());
//    HomePage homePage = new HomePage(getDriver());
//    AdminPage adminPage = new AdminPage(getDriver());
//    String expectedTitle = "OrangeHRM";
//    String actualTitle = getCurrentTitle();
//    Assert.assertEquals(expectedTitle,actualTitle);
//    loginPage.enterUsername(validUsername);
//    loginPage.enterPassword(validPassword);
//    loginPage.clickOnLoginButton();
//    String expectedHomePageHeader = "Dashboard";
//    String actualHomePageHeader = homePage.getHomePageHeaderText();
//    Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//    waitFor(3);
//
//    adminPage.clickOnAdminButton();
//    String expectedHeader = "Admin";
//    String actualHeader = adminPage.getAdminHeader();
//    Assert.assertEquals(expectedHeader,actualHeader);
//    log.info("Admin header validation success");
//
//    adminPage.enterUsername("Admin");
//    adminPage.enterEmployeeName("Paul Collings");
//    adminPage.clickOnStatusDropdown();
//    String expectedMessage = "Invalid";
//    log.info("message validation success");
//    }

    @Test
    public void searchButtonInvalidInfo(){
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
        adminPage.clickOnAdminButton();
        String expectedHeader = "Admin";
        String actualHeader = adminPage.getAdminHeader();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("Admin header validation success");
        adminPage.enterUsername("Admi");
        adminPage.clickOnUserRoleDropdown();
        adminPage.clickOnSearchESSposition();
        adminPage.enterEmployeeName("Paul Collings");
        adminPage.clickOnStatusDropdown();

        adminPage.clickOnSearchButton();
        String expectedMessage = "No Records Found";
        String actualMessage = adminPage.invalidMessage();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("No record found message validation success");

    }
//    @Test
//    public void addingJobTitles(){
//        LoginPage loginPage = new LoginPage(getDriver());
//        HomePage homePage = new HomePage(getDriver());
//        AdminPage adminPage = new AdminPage(getDriver());
//        String expectedTitle = "OrangeHRM";
//        String actualTitle = getCurrentTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);
//        loginPage.enterUsername(validUsername);
//        loginPage.enterPassword(validPassword);
//        loginPage.clickOnLoginButton();
//        String expectedHomePageHeader = "Dashboard";
//        String actualHomePageHeader = homePage.getHomePageHeaderText();
//        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//
//        adminPage.clickOnAdminButton();
//        String expectedHeader = "Admin";
//        String actualHeader = adminPage.getAdminHeader();
//        Assert.assertEquals(expectedHeader,actualHeader);
//        log.info("Admin header validation success");
//
//        adminPage.clickOnJobDropdown();
//        adminPage.clickOnJobTitles();
//        String expectedJobHeader = "Job Titles";
//        String actaulJobHeader = adminPage.getJobTitleHeaderText();
//        Assert.assertEquals(expectedJobHeader,actaulJobHeader);
//        log.info("Job title validation success");
//
//        adminPage.clickOnAddButton();
//        String expectedAddJobTitle = "Add Job Title";
//        String actualAddJobTitle = adminPage.getAddJobTitleHeaderText();
//        Assert.assertEquals(expectedAddJobTitle,actualAddJobTitle);
//        log.info("Add job title validation success");
//
//        adminPage.enterJobTitle("Love Specialist");
//        adminPage.enterJobDescription("Love is funny!");
//        adminPage.enterAddNote("Love is for everyone");
//        adminPage.clickOnJobSaveButton();
//        String expectedJobTitleHeaderAfterSaving = "Job Titles";
//        String actualJobTitleHeaderAfterSaving = adminPage.getJobTitleHeaderText();
//        Assert.assertEquals(expectedJobTitleHeaderAfterSaving,actualJobTitleHeaderAfterSaving);
//        log.info("Job title validation success");
// }


}
