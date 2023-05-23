package magento;

import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import team2.magentopages.HomePage;
import team2.magentopages.SigninPage;
import team2.magentopages.VideoDownloadPage;

public class DownloadsTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    public void checkDownloadablesProducts() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        VideoDownloadPage videoDownload = new VideoDownloadPage(getDriver());
        homePage.clickOnSigninButton();

        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login");
        LOG.info("Sign in title page validation success");
        //String email = ConnectDB.getTableColumnData("select * from cred", "email").get(0);
        signinPageMagento.typeEmailAddress("thonmoy.b@icloud.com");
        //String password = ConnectDB.getTableColumnData("select * from cred", "password").get(0);
        signinPageMagento.typePassword("password&1234");
        signinPageMagento.clickOnSigninButton2();
        String title1 = getCurrentTitle();
        Assert.assertEquals(title1, "Home Page");
        homePage.getHeaderText();
        LOG.info("Signin success");
        homePage.clickOnTraining();
        homePage.clickOnVideoDownload();
        String title3 = getCurrentTitle();
        Assert.assertEquals(title3, "Video Download - Training");
        LOG.info("Video Download  title page validation success");
        String errorMessage = videoDownload.geterrorMessage4();
        Assert.assertEquals(errorMessage, "We can't find products matching the selection.");

    }

}
