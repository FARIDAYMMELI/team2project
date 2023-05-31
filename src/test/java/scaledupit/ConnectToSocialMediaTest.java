package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.LoginRegisterPage;
import team2.scaledupitpages.MainPage;
import team2.utility.ConnectDB;

import java.util.ArrayList;

public class ConnectToSocialMediaTest  extends CommonAPI {
    Logger log= LogManager.getLogger(ConnectToSocialMediaTest.class.getName());


    ConnectDB connectDB = new ConnectDB();

    String validUsername = ConnectDB.getTableColumnData("select * from team", "usernames").get(0);

    String validPassword = ConnectDB.getTableColumnData("select * from team", "passwords").get(0);
    @Test
    public void ConnectFaceBook() {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
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

        loginRegisterPage.typeusername(validUsername);
        loginRegisterPage.typepassword(validPassword);

        mainPage.clickOnFaceBookButton();
    }
    @Test
    public void ConnectInstagram () {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
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

        loginRegisterPage.typeusername(validUsername);
        loginRegisterPage.typepassword(validPassword);
        mainPage.clickOnInstagramButton();
    }
    @Test
    public void ConnectSnapShot() {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
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

        loginRegisterPage.typeusername(validUsername);
        loginRegisterPage.typepassword(validPassword);

        mainPage.clickOnSnapShotButton();
//        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(newTb.get(1));
//        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key","snapCHAT");
//        String actualTitle = getCurrentTitle();
//        Assert.assertEquals(expectedTitle, actualTitle);
//        System.out.println("The Twitter title is: "+actualTitle);
//        LOG.info("Twitter page validation success");
;
    }
}
