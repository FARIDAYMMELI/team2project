package nopcommerce;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.LoginPage;
import team2.npcommercepages.RegisterPage1;
import team2.utility.Utility;

import java.util.Properties;

public class LoginTest extends CommonAPI {
    Logger log = LogManager.getLogger(LoginTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = Utility.decode(properties.getProperty(""));
    String validPassword = Utility.decode(properties.getProperty(""));
    @Test
    public void userRegister() {
        LoginPage loginPage = new LoginPage(getDriver());
        RegisterPage1 registerPage1 = new RegisterPage1(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        //clicking on register
        registerPage1.clickOnRegister();
//        String expectedRegisterPageTitle = "Register";
//        String actualRegisterPageTitle = registerPage1.getTitleOfThePage();
        String expectedPageTitle = "Register";
        String actualPageTitle = registerPage1.getTitleOfThePage();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        log.info("The page title is displayed");

        registerPage1.clickOnGenderFemale();
        registerPage1.enterFirstName(validUsername);
        registerPage1.enterLastName(validUsername);
        registerPage1.usersDateOfBirth();
        registerPage1.userDateOfBirthMonth();
        registerPage1.userDateOfYear();
        registerPage1.enterEmail("email");
        registerPage1.nameOfCompany("company");
        registerPage1.newLetterCheckbox();
        registerPage1.createPassword(validPassword);
        registerPage1.confirmsPassword(validPassword);
        registerPage1.registerButton();

        //validate user is registered
        String expectedRegisterTitle = "Your registration completed";
        String actualRegisterTitle = registerPage1.registrationSuccessText();
        Assert.assertEquals(expectedRegisterTitle, actualRegisterTitle);
        log.info("The page title validation success");
    }


        @Test

        public void userLogin() {

            LoginPage loginPage = new LoginPage(getDriver());
            String expectedTitle = "nopCommerce demo store. Camera & photo";
            String actualTitle = loginPage.getPageTitleMessage();
            Assert.assertEquals(expectedTitle, actualTitle);
            log.info("The page title validation success");

            loginPage.clickOnLoginBtn();
            String expectedWelcomeHeader = "Welcome, Please Sign In!";
            String actualWelcomeHeader = loginPage.getWelcomeMessage();
            Assert.assertEquals(expectedWelcomeHeader, actualWelcomeHeader);
            log.info("The header title validation success");

            loginPage.enterEmail("abc@abc.com");
            loginPage.enterPassword("abc123");
            loginPage.clickOnLoginButton();
            String expectedHeader = "Welcome to our store";
            String actualHeader = loginPage.getWelcomeTextMessage();
            Assert.assertEquals(expectedHeader, actualHeader);
            log.info("Welcome text validation success");
        }

        @Test
        public void noEmail() {
            LoginPage loginPage = new LoginPage(getDriver());
            String expectedTitle = "nopCommerce demo store. Camera & photo";
            String actualTitle = loginPage.getPageTitleMessage();
            Assert.assertEquals(expectedTitle, actualTitle);
            log.info("The page title validation success");

            loginPage.clickOnLoginBtn();
            loginPage.enterEmail("abc@abc.com");
            loginPage.clickOnLoginButton();

            String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.";
            String actualMessage = loginPage.loginUnsuccessful();
            Assert.assertEquals(expectedMessage, actualMessage);
            log.info("unsuccessful login message validation success");
        }
        @Test

        public void noPassword(){
        LoginPage loginPage = new LoginPage(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        loginPage.clickOnLoginBtn();
        loginPage.enterPassword("abc123");
        loginPage.clickOnLoginButton();

        String expectedErrorMessage = "Please enter your email";
        String actualErrorMessage = loginPage.onlyPassword();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
        log.info("error message validation success");


            }


}
