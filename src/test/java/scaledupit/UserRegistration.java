package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.LoginRegisterPage;
import team2.scaledupitpages.MainPage;
import team2.scaledupitpages.MyAccountPage;

public class UserRegistration  extends CommonAPI {




    Logger log = LogManager.getLogger(scaledupit.UserRegistration.class.getName());
    //	Test Case ID number 1 :  Verify that the user is able to register a new account
    @Test
    public void RegistrationValidation() throws InterruptedException {
        String EmailAddress = "tamannabegum70294@gmail.com";
        String passwordRegister = "Password15@";

        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());

        // navigate to scaledupit website
//        String expectedTitle = "Automation – Automate eCommerce";
//        String actualTitle = getCurrentTitle();
//        Assert.assertEquals(expectedTitle, actualTitle);
//        log.info("Home page  title page validation success");
//        waitFor(3);
        // click on LOGING/REGISTER Button
        mainPage.clickLoginRegisterButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //enter  username, password, and click on login button
        loginRegisterPage.typeEmailAddressregister(EmailAddress);
        log.info("enter email success");
        loginRegisterPage.typepasswordRegister(passwordRegister);
        log.info("enter password success");

        loginRegisterPage.clickOnRegisterButton();
        log.info("click on register button");
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = MyAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user logged in success");
        waitFor(3);


    }

 /*
        //	 Navigate to the scaledupit.com  website
        String expected = "Automation – Automate eCommerce";
        String actual = getCurrentTitle();
        Assert.assertEquals(expected, actual);
        //clickOn(myRegistration);
        clickOn("#menu-item-324 > a");
         log.info("click on to login/register button success");
        log.info("my Registration  page");
        Thread.sleep(1000);

        //fill registration form

        type("#reg_email", "tamannabegum70294@gmail.com");
        log.info("enter email name success");
        type("#reg_password", "Password14@");
        log.info("enter password success");

        // click on register button
        clickOn("button[value='Register']");
        log.info("click on registration button Success");
        //check user is registered

              String expectedHomePageHeader = "Account details";
              String actualHomePageHeader = getElementText("//a[text()=\"Account details\"]" );
              Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
              log.info("user registration  in success "); */



    @Test
    public void RegistrationInValid() throws InterruptedException {
     String EmailAdress = "farida@gmail.com" ;
        String passwordRegister = "Password15@";


        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        // navigate to scaledupit website
        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("Home page  title page validation success");
        waitFor(3);
        // click on LOGING/REGISTER Button
        mainPage.clickLoginRegisterButton();
        String expectedurl = "https://automation.scaledupit.com/my-account/";
        String actualurl = getCurrentURL();
        Assert.assertEquals(actualurl, expectedurl);
        log.info("login title page validation success");

        //enter  username, password, and click on login button
        loginRegisterPage.typeEmailAddressregister(EmailAdress);
        log.info("enter email success");
        loginRegisterPage.typepasswordRegister(passwordRegister);
        log.info("enter password success");

        loginRegisterPage.clickOnRegisterButton();
        log.info("click on register button");
        //check user is  not logged and user is still in login/register page
        String expectedHomePageHeader = "Login";
        String actualHomePageHeader = loginRegisterPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user could not log in, still in log in page registration");
        waitFor(3);


        }
}




       /*
        //	 Navigate to the scaledupit.com  website

        String expectedTitle = "Automation – Automate eCommerce";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("the link is the correct one");
           clickOn("#menu-item-324 > a");
           log.info("click on to login/register button success");

          Thread.sleep(1000);

          log.info("my Registration  page is open ");


        //fill registration form

        type("#reg_email", "farida@hotmail.com");
        log.info("enter email name success");
        type("#reg_password", "Password14@");
        log.info("enter password success");

        // click on register button

        clickOn("button[value='Register']");
        log.info("click on  registration button  fail, the register succeed with wrong email , a bug detected");


        //check user is  not registered

               String expectedHomePageHeader = "LOGIN/REGISTER";
               String actualHomePageHeader = getElementText("#menu-item-324 > a");
               Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
               log.info("user registration  in not  succeed"); */




