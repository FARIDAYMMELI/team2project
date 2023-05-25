package orangehrm;

import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import team2.orangehrmpages.HomePage;
import team2.utility.Utility;
import team2.orangehrmpages.LoginPage;
import java.util.Properties;

public class LoginTest extends CommonAPI {
    Logger log = LogManager.getLogger(LoginTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = Utility.decode(properties.getProperty("orangehrm.username"));
    String validPassword = Utility.decode(properties.getProperty("orangehrm.password"));

    @Test
    public void validCredential(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        waitFor(3);

        //check user is logged in
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        //check user is logged in
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        waitFor(3);
    }
    @Test
    public void invalidUsername(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //enter username, password and click on login button
        loginPage.enterUsername("invalidUsername");
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        //validate the error message
        String expectedError = "Invalid credentials";
        String actualError = loginPage.getErrorMessage();
        Assert.assertEquals(expectedError,actualError);
    }
    @Test
    public void missingUsername(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //enter username, password and click on login button
        loginPage.enterUsername("");
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();

        //validate the error message
        String expectedError = "Required";
        String actualError = loginPage.getErrorRequiredMessage();
        Assert.assertEquals(expectedError,actualError);
    }

    @Test
    public void missingPassword(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //enter username, password and click on login button
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();

        //validate the error message
        String expectedError = "Required";
        String actualError = loginPage.getErrorRequiredMessage();
        Assert.assertEquals(expectedError,actualError);
    }





}
