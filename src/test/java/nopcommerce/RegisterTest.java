package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.LoginPageTwo;
import team2.npcommercepages.RegisterPage1;

public class RegisterTest extends CommonAPI {

    Logger log = LogManager.getLogger(RegisterTest.class.getName());

    @Test
    public void newUser(){
        RegisterPage1 registerPage1 = new RegisterPage1(getDriver());
        registerPage1.clickOnRegister();
        registerPage1.clickOnGenderFemale();
        registerPage1.enterFirstName("Tamanna");
        registerPage1.enterLastName("Begum");
        registerPage1.userDateOfBirthMonth();
        registerPage1.usersDateOfBirth();
        registerPage1.userDateOfYear();
        registerPage1.enterEmail("abc@abcdefgh.com");
        registerPage1.nameOfCompany("PNT");
        registerPage1.createPassword("abc123");
        registerPage1.confirmsPassword("abc123");
        registerPage1.clickOnRegisterButton();


        // registration validation
        String expectedText="Your registration completed";
        String actualText = registerPage1.registrationValidationText();
        Assert.assertEquals(expectedText,actualText);
        log.info("Registration validation Success");


    }

    @Test(priority = 0)
    public void reRegister(){
        RegisterPage1 registerPage1 = new RegisterPage1(getDriver());
        registerPage1.clickOnRegister();
        registerPage1.clickOnGenderFemale();
        registerPage1.enterFirstName("aa");
        registerPage1.enterLastName("rr");
        registerPage1.usersDateOfBirth();
        registerPage1.userDateOfBirthMonth();
        registerPage1.userDateOfYear();
        registerPage1.enterEmail("aec@abr.com");
        registerPage1.nameOfCompany("PrrT");
        registerPage1.createPassword("att123");
        registerPage1.confirmsPassword("att123");
        registerPage1.clickOnRegisterButton();

        // re registration validation
        String expectedResult = "The specified email already exists";
        String actualText = registerPage1.reRegistrationValidationText();
        Assert.assertEquals(expectedResult,actualText);
        log.info("Re-Registration validation Success");

    }
    @Test
    public void passwordRecovery(){
        RegisterPage1 registerPage1 = new RegisterPage1(getDriver());
        LoginPageTwo loginPageTwo = new LoginPageTwo(getDriver());


        loginPageTwo.clickOnLoginLink();

        loginPageTwo.clickOnForgotPassword();
        waitFor(1);
        loginPageTwo.clickOnRecoveryEmailField();
        loginPageTwo.typeEmailOnRecoveryEmailField("abc@abc.com");
        loginPageTwo.clickOnRecoveryButton();

        String expectedText="Email with instructions has been sent to you.";
        String actualText = loginPageTwo.recoveryValidationText();
        Assert.assertEquals(expectedText,actualText);
        log.info("Password recovery validation Success");
    }
    }






