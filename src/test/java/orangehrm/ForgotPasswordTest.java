package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.LoginPage;

public class ForgotPasswordTest extends CommonAPI {

    Logger log = LogManager.getLogger(ForgotPasswordTest.class.getName());

    @Test
    public void retrievePassword(){
        LoginPage loginPage = new LoginPage(getDriver());
        String expectedTitle = "Login";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        waitFor(3);

        loginPage.clickForgotYourPassword();
        String expectedHeader = "Reset Password";
        String  actualHeader = loginPage.getResetPasswordHeader();
        Assert.assertEquals(expectedHeader,actualHeader);

        loginPage.enterUsername4ResetPassword("Admin");
        loginPage.clickOnResetPasswordButton();

        String expectedMessage = "Reset Password link sent successfully";
        String actualMessage = loginPage.getSuccessMessage();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("Success message validation success");


    }


}
