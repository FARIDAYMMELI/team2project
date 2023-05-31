package scaledupit;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.*;
import team2.utility.Utility;

import java.util.Properties;

public class UpdateAdresses extends CommonAPI {

    Logger log = LogManager.getLogger(scaledupit.UserRegistration.class.getName());
    Properties prop = Utility.loadProperties();
    Faker fakeData = new Faker();

    //	Test Case ID number 1 :  Verify that the user is able to register a new account
    @Test
    public void UpdateBillingAddress() throws InterruptedException {

        String validUsername = prop.getProperty("Scaledupit.username");
        String validPassword = prop.getProperty("Scaledupit.password");
        String FirstName = fakeData.internet().emailAddress();
        String LastName = fakeData.internet().emailAddress();
        String Country = fakeData.internet().emailAddress();
        String StreetAddress = fakeData.internet().emailAddress();
        String City = fakeData.internet().emailAddress();
        String State= fakeData.internet().emailAddress();




        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        AddressPage addressPage = new AddressPage(getDriver());
        BillingAddressPage billingAddressPage= new BillingAddressPage(getDriver());

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
        log.info("click on login button");
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user logged in success");
        //captureScreenshot();
        waitFor(3);
        myAccountPage.clickOnAddressButton();
         addressPage.clickOnBillingAddress();

        billingAddressPage.typeFirstName(FirstName);
        billingAddressPage.typeLastName(LastName);
        billingAddressPage.typeCountry(Country);
        billingAddressPage.typeStreetAddress(StreetAddress);
        billingAddressPage.typeCity(City);
//        billingAddressPage.typeState(State);
       billingAddressPage.clickOnSaveButton();



    }
}
