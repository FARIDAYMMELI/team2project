package orangehrm;

import com.amazonaws.services.dynamodbv2.xspec.S;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.PIMPage;
import team2.orangehrmpages.RecruitmentPage;
import team2.utility.Utility;

import java.util.Properties;

public class PIMTest extends CommonAPI{
    Logger log = LogManager.getLogger(PIMTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void pimSection(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        PIMPage pimPage = new PIMPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("Page header validation success");
        pimPage.clickOnPIMSeciton();
        String expectedHeader = "Leave";
        String actualHeader = pimPage.getPIMHeader();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("Header validation success");

    }

@Test
    public void addButton(){
    LoginPage loginPage = new LoginPage(getDriver());
    HomePage homePage = new HomePage(getDriver());
    PIMPage pimPage = new PIMPage(getDriver());
    String expectedTitle = "OrangeHRM";
    String actualTitle = getCurrentTitle();
    Assert.assertEquals(expectedTitle, actualTitle);
    loginPage.enterUsername(validUsername);
    loginPage.enterPassword(validPassword);
    loginPage.clickOnLoginButton();
    String expectedHomePageHeader = "Dashboard";
    String actualHomePageHeader = homePage.getHomePageHeaderText();
    Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
    log.info("Page header validation success");
    pimPage.clickOnPIMSeciton();
    String expectedHeader = "Leave";
    String actualHeader = pimPage.getPIMHeader();
    Assert.assertEquals(expectedHeader,actualHeader);
    log.info("Header validation success");

    pimPage.clickOnAddButton();
    String expectedMessage = "Add Employee";
    String actualMessage = pimPage.getAddEmployeeHeader();
    Assert.assertEquals(expectedMessage,actualMessage);
    log.info("Message validation success");
    pimPage.enterFirstName("u");
    pimPage.enterMiddleName("v");
    pimPage.enterLastName("i");
    pimPage.enterEmployeeID("998");
    pimPage.clickOnSaveButton();
    String expectedPageHeader ="Personal Details";
    String actualPageHeader = pimPage.getPersonalDetailsHeader();
    Assert.assertEquals(expectedPageHeader,actualPageHeader);
    log.info("Page header validation success");

}


}
