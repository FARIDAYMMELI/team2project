package scaledupit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.scaledupitpages.MainPage;
import team2.scaledupitpages.LoginRegisterPage;
import team2.scaledupitpages.MyAccountPage;

public class LogoutTest  extends CommonAPI {

    Logger log = LogManager.getLogger(LogoutTest.class.getName());


    String validUsername = "faridaymmeli@gmail.com";
    String validPassword = "Password14@";

    @Test
    public void logout() {

        LoginRegisterPage loginRegisterPage = new LoginRegisterPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

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
        log.info("enter email success");
        loginRegisterPage.typepassword(validPassword);
        log.info("enter password success");

        loginRegisterPage.clickOnLoginButton();
        log.info("click on login button");
        //check user is logged in
        String expectedHomePageHeader = "My account";
        String actualHomePageHeader = myAccountPage.getHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("user logged in success");
        waitFor(3);


        // click on log out

        myAccountPage.clickOnLogOut();
        log.info(" clicked on log out button");

        // verify that logout process is working and are in main page again

        String expectedText = "LOGIN/REGISTER";
        String actualText = mainPage.getAText();
        Assert.assertEquals(expectedText, actualText);
    }
}
//            /*navigate to scaledupit website
//            String expectedTitle = "Automation – Automate eCommerce";
//            String actualTitle = getCurrentTitle();
//            Assert.assertEquals(expectedTitle, actualTitle);*/
//
//
//            HomePage homePage = new HomePage(getDriver());
//            LoginPage loginPage = new LoginPage(getDriver());
//
//
//            String title = getCurrentTitle();
//            Assert.assertEquals(title, "My account – Automation");
//            log.info("login title page validation success");
//
//
//            /* click on MyAccount Button
//
//        clickOn("#menu-item-324 > a");
//        log.info("click on login/ register button"); */
//
//            homePage.clickOnMyAccountButton();
//         String expectedurl = "https://automation.scaledupit.com/my-account/";
//         String actualurl = getCurrentURL();
//         Assert.assertEquals(actualurl,expectedurl);
//
//
//             /*enter  email, password, and click on login button
//        type("#username","faridaymmeli@gmail.com");
//        log.info("enter email success");
//        type("#password","Password14@");
//        log.info("enter password success");
//        clickOn("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button");
//        log.info("click on login button Success");
//        Thread.sleep(1000);*/
//            String username = ConnectDB.getTableColumnData("select * from cred", "username").get(0);
//            loginPage.typeusername(username);
//            String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
//            loginPage.typepassword(password);
//            loginPage.clickOnLoginButton();
//            LOG.info("login page success");
//
//            /*check user is landed to the login page
//
//        String expectedLoginPageHeaderText = "Account details";
//        String actualLoginPageHeaderText = getElementText("//a[text()=\"Account details\"]");
//        Assert.assertEquals(expectedLoginPageHeaderText, actualLoginPageHeaderText);
//        log.info("login page header text validation success"); */
//
//
//
//
//
//
//         /*check user is have logout button
//        String expectedHomePageHeader = "Logout";
//        String actualHomePageHeader = getElementText("//a[text()='Logout']");
//        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
//        log.info("user logged in success");*/
//
//
//            clickOn("//a[text()='Logout']");
//            log.info("click on logout  Success");
//
//
//
//
//
//
//


