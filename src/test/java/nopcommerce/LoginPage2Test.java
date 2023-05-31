package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.LoginPageTwo;
import team2.utility.ExcelReader;

import java.io.File;

public class LoginPage2Test extends CommonAPI {

    Logger log = LogManager.getLogger(LoginPage2Test.class.getName());
    String currentDir = System.getProperty("user.dir");
    String path = currentDir+ File.separator+"data"+File.separator+"nopcommerce"+File.separator+"nopcommerce.xlsx";
    ExcelReader excelReader = new ExcelReader(path);
    String validUsername = excelReader.getDataFromCell("data", 1,1);
    String validPassword = excelReader.getDataFromCell("data", 2,1);
    @Test
    public void loginLink(){
        LoginPageTwo loginPageTwo = new LoginPageTwo(getDriver());
        loginPageTwo.clickOnLoginLink();
        loginPageTwo.typeUsername(validUsername);
        loginPageTwo.typePassword(validPassword);
        loginPageTwo.clickOnLoginButton();



        String expectedText="Welcome to our store";
        String actualText = loginPageTwo.loginValidationText();
        Assert.assertEquals(expectedText,actualText);
        log.info("User log out validation");
    }
    @Test
    public void logOutValidation(){
        LoginPageTwo loginPageTwo = new LoginPageTwo(getDriver());
        loginPageTwo.clickOnLoginLink();
        loginPageTwo.typeUsername("abc@abc.com");

        loginPageTwo.typePassword("abc123");

        loginPageTwo.clickOnLoginButton();


        String expectedText="Log in";
        String actualText = loginPageTwo.logOutValidationText();
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void withoutPassword() {
        LoginPageTwo loginPageTwo = new LoginPageTwo(getDriver());
        loginPageTwo.clickOnLoginLink();
        loginPageTwo.typeUsername("abc@abc.com");
        loginPageTwo.clickOnLoginButton();


    }

    @Test
    public void withoutEmail(){
        LoginPageTwo loginPageTwo = new LoginPageTwo(getDriver());
        loginPageTwo.clickOnLoginLink();
        loginPageTwo.typePassword("abc123");
        loginPageTwo.clickOnLoginButton();

    }


        }





