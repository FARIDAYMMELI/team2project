package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.LoginPage;
import team2.utility.Utility;

import java.util.Properties;

public class ForgotPasswordTest extends CommonAPI {

    Logger log = LogManager.getLogger(ForgotPasswordTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void retrievePassword(){
        LoginPage loginPage = new LoginPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.clickForgotYourPassword();

//        String expectedHeader = "Reset Password";
//        String  actualHeader = loginPage.getResetPasswordHeader();
//        Assert.assertEquals(expectedHeader,actualHeader);
//        log.info("Reset header validation success");
//        loginPage.enterUsername4ResetPassword("Admin");
//        String expectedMessage = "Reset Password link sent successfully";
//        String actualMessage = loginPage.getSuccessMessage();
//        Assert.assertEquals(expectedHeader,actualHeader);
//        log.info("Success message validation success");


    }


}
