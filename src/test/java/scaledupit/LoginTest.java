package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.MainPage;
import team2.scaledupitpages.LoginRegisterPage;
import team2.scaledupitpages.MyAccountPage;
import team2.utility.Utility;

import java.util.Properties;

public class LoginTest extends CommonAPI {

    Logger log = LogManager.getLogger(LoginTest.class.getName());


    Properties prop = Utility.loadProperties();
    String validUsername = prop.getProperty("Scaledupit.username");
    String validPassword = prop.getProperty("Scaledupit.password");
    String invalidUsername= prop.getProperty("Scaledupit.invalidusername");
    String invalidPassword= prop.getProperty("Scaledupit.invalidpassword");

//    String validUsername = "faridaymmeli@gmail.com";
//    String validPassword = "Password14@";
//    String invalidUsername = "fari";
//    //String invalidPassword = "Password";

    @Test
    public void validCredential() {

        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        // navigate to scaledupit website
        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Home page  title page validation success");
        waitFor(3);
        // click on MyAccount Button
        mainPage.clickOnMyAccountButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //enter  username, password, and click on login button
        loginRegisterPage.typeusername(validUsername);
        loginRegisterPage.typepassword(validPassword);
        loginRegisterPage.clickOnLoginButton();
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = MyAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        //captureScreenshot();
        waitFor(3);


    }

    @Test
    public void invalidUsername() {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        // navigate to scaledupit website
        String expectedTitle ="Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Home page  title page validation success");

        // click on MyAccount Button
        mainPage.clickOnMyAccountButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //enter  invalid username, password, and click on login button
        loginRegisterPage.typeInvalidUsername(invalidUsername);
        log.info("enter email success");
        loginRegisterPage.typepassword(validPassword);
        log.info("enter password success");
        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");
        //check user is logged in/error messsage displayed
        //validate the error message
        String expectedError = "Error: The username fari is not registered on this site. If you are unsure of your username, try your email address instead.";
        String actualError = loginRegisterPage.getErrorMessage();
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success");


        // check user is still in login/register page
        String expectedHomePageHeader = "Login";
        String actualHomePageHeader = loginRegisterPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user could not log in, still in log in page registration");
        waitFor(3);






      /*
        // change to git
        // navigate to scaledupit website

        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        // click on login/register button
        clickOn("#menu-item-324 > a");
        log.info("click on to login/register button success");

        //enter  username, password, and click on login button


        type("#username","fari");
        log.info("enter username success");
        type("#password","hhhhh");
        log.info("enter password success");

        clickOn("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button");
        log.info("click on login button Success");

        //validate the error message
        String expectedError = "Error: The username fari is not registered on this site. If you are unsure of your username, try your email address instead.";
        String actualError = getElementText("#post-9 > div > div > div.woocommerce-notices-wrapper > ul > li");
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success");*/
    }

    @Test
    public void missingUsername() {

        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        // navigate to scaledupit website
        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Home page  title page validation success");
        waitFor(3);
        // click on MyAccount Button
        mainPage.clickOnMyAccountButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //do not enter username, password, and click on login button

        log.info(" username did not entered success");
        loginRegisterPage.typepassword(validPassword);
        log.info("enter password success");
        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");

        //check user is logged in/error messsage displayed
        //validate the error message
        String expectedError = "Error: Username is required.";
        String actualError = loginRegisterPage.getErrorMessageUsernameMissing();
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success");


        // check user is still in login/register page
        String expectedHomePageHeader = "Login";
        String actualHomePageHeader = loginRegisterPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user could not log in, still in log in page registration");
        waitFor(3);





/*
        // navigate to scaledupit website
        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        // click on login/register button
        clickOn("#menu-item-324 > a");
        log.info("click on to login/register button success");

        //enter password, and click on login button


        type("#username","");
        log.info("enter username success");
        type("#password","Password14@");
        log.info("enter password success");

        clickOn("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button");
        log.info("click on login button Success");

        //validate the error message
        String expectedError = "Error: Username is required.";
        String actualError = getElementText("#post-9 > div > div > div.woocommerce-notices-wrapper > ul > li");
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success, username is required"); */

    }

    @Test
    public void missingPassword() {


        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        // navigate to scaledupit website
        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Home page  title page validation success");
        waitFor(3);
        // click on MyAccount Button
        mainPage.clickOnMyAccountButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //enter  invalid username, password, and click on login button
        loginRegisterPage.typeInvalidUsername(invalidUsername);
        log.info("enter email success");
        log.info("password not entered");
        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");
        //check user is logged in/error messsage displayed
        //validate the error message
        String expectedError = "Error: The password field is empty.";
        String actualError = loginRegisterPage.getErrorMessagePasswordMissing();
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success");


        // check user is still in login/register page
        String expectedHomePageHeader = "Login";
        String actualHomePageHeader = loginRegisterPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user could not log in, still in log in page registration");
        waitFor(3);
    }
}















    /*

        // navigate to scaledupit website
        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        // click on login/register button
        clickOn("#menu-item-324 > a");
        log.info("click on to login/register button success");

        //enter  username, and click on login button


        type("#username","faridaymmeli@gmail.com");
        log.info("enter username success");
        type("#password","");
        log.info("enter password success");

        clickOn("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button");
        log.info("click on login button Success");

        //validate the error message
        String expectedError = "Error: The password field is empty.";
        String actualError = getElementText("#post-9 > div > div > div.woocommerce-notices-wrapper > ul > li");
        Assert.assertEquals(expectedError, actualError);
        log.info("validate error success, password is required"); */

