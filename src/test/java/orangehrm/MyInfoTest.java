package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.AdminPage;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.MyInfoPage;
import team2.utility.Utility;

import java.util.Properties;

public class MyInfoTest extends CommonAPI {
    Logger log = LogManager.getLogger(AdminTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void updateMyInfo(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        MyInfoPage myInfoPage = new MyInfoPage(getDriver());
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

        myInfoPage.clickOnMyInfo();
        String expectedPageHead = "PIM";
        String actualPageHeader = myInfoPage.getPIMmessage();
        Assert.assertEquals(expectedPageHead,actualPageHeader);
        log.info("Page header validation success");


        myInfoPage.enterFirstName("Abu");
        myInfoPage.enterMiddleName("Yousuf");
        myInfoPage.enterLastName("Rana");
        myInfoPage.enterEmployeeID("0024");
        myInfoPage.enterSSN("123-45-6789");
        myInfoPage.clickOnNationalityDropdown();
        myInfoPage.selectAmerican("American");
        myInfoPage.clickOnMaritalStatusDropdown();
        myInfoPage.selectSingle("Single");
        myInfoPage.enterDateOfBirth("1975-10-15");
        myInfoPage.clickOnMaleRadioButton();
        myInfoPage.clickOnSaveButton();
        String expectedHeader = "Personal Details";
        String actualHeader = myInfoPage.getPersonalDetailsText();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("Personal details validation success");


    }


}
