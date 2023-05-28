package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.DirectoryPage;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.MaintenancePage;
import team2.utility.Utility;

import java.util.Properties;

public class DirectoryTest extends CommonAPI {
    Logger log = LogManager.getLogger(AdminTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

//@Test
//    public void directory(){
//    LoginPage loginPage = new LoginPage(getDriver());
//    HomePage homePage = new HomePage(getDriver());
//    DirectoryPage directoryPage = new DirectoryPage(getDriver());
//    String expectedTitle = "OrangeHRM";
//    String actualTitle = getCurrentTitle();
//    Assert.assertEquals(expectedTitle,actualTitle);
//    loginPage.enterUsername(validUsername);
//    loginPage.enterPassword(validPassword);
//    loginPage.clickOnLoginButton();
//    String expectedHomePageHeader = "Dashboard";
//    String actualHomePageHeader = homePage.getHomePageHeaderText();
//    Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
//    waitFor(1);
//
//    directoryPage.clickOnDirectoryButton();
//    String expectedHeader = "Directory";
//    String actualHeader = directoryPage.getPageHeaderText();
//    Assert.assertEquals(expectedHeader,actualHeader);
//    log.info("Page Header validation success");
//}
@Test
    public void searching(){
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    DirectoryPage directoryPage = new DirectoryPage(getDriver());
    String expectedTitle = "OrangeHRM";
    String actualTitle = getCurrentTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    loginPage.enterUsername(validUsername);
    loginPage.enterPassword(validPassword);
    loginPage.clickOnLoginButton();
    String expectedHomePageHeader = "Dashboard";
    String actualHomePageHeader = homePage.getHomePageHeaderText();
    Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
    waitFor(1);
    directoryPage.clickOnDirectoryButton();
    String expectedHeader = "Directory";
    String actualHeader = directoryPage.getPageHeaderText();
    Assert.assertEquals(expectedHeader,actualHeader);
    log.info("Page Header validation success");

    directoryPage.enterEmployeeName("Paul Collings");
    directoryPage.clickOnJobTitleDropdown();
    waitFor(1);
    directoryPage.clickOnLocationDropdwon();
   // directoryPage.clickOnNewYorkSalesOffice();
    directoryPage.clickOnSearchButton();



}




}
