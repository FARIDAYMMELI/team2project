package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.AccountDetailPage;
import team2.scaledupitpages.LoginRegisterPage;
import team2.scaledupitpages.MainPage;
import team2.scaledupitpages.MyAccountPage;
import team2.utility.ExcelReader;

import java.io.File;
import java.util.List;

public class UpdateAccountDetailTest extends CommonAPI {
    Logger log = LogManager.getLogger(LogoutTest.class.getName());


    @Test (dataProvider = "account detail update",dataProviderClass = ExcelReader.class )

    public void UpdateNameAndLastName(String validUsername,String validPassword) {

        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        AccountDetailPage accountDetailPage = new AccountDetailPage(getDriver());

        // navigate to scaledupit website

        String actualTitle = getCurrentTitle();
        String expectedTitle = "Automation – Automate eCommerce";
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

//        String expectedHomePageHeaderAccountDetail = "Account details";
//        String actualHomePageHeaderAccountDetail = accountDetailPage.getHeaderText();
//        Assert.assertEquals(expectedHomePageHeaderAccountDetail, actualHomePageHeaderAccountDetail);
//        log.info("user account detail page in success");
//        waitFor(3);
        myAccountPage.clickOnAccountDetailButton();
        accountDetailPage.typeItemFirstName("FirstName");
        accountDetailPage.typeItemLastName("LastName");

    }
}