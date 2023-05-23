package magento;
import team2.base.CommonAPI;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import team2.magentopages.CreatenewAccountPageMagento;
import team2.magentopages.HomePage;

public class NewAccountTest extends CommonAPI {

        Logger LOG = LogManager.getLogger(NewAccountTest.class.getName());
        Faker fakeData = new Faker();
        String emailAddress=fakeData.internet().emailAddress();
        String name = fakeData.name().firstName();
        String lastName = fakeData.name().lastName();


        @Test
        public void RegisterWithAnExistingCredentials() throws InterruptedException {

                HomePage homePage = new HomePage(getDriver());
                CreatenewAccountPageMagento createnewAccountPageMagento = new CreatenewAccountPageMagento(getDriver());
                homePage.clickOnCreateanAccountButton1();
                String expectedHeader = "Create New Customer Account";
                String actualHeader = createnewAccountPageMagento.newAccountHeaderText();
                Assert.assertEquals(actualHeader,expectedHeader);
                LOG.info("create an account title page validation success");
                //String FirstName  = ConnectDB.getTableColumnData("select * from cred","FirstName").get(0);
                createnewAccountPageMagento.typeFirstName("thonmoy");
                //String LastName  = ConnectDB.getTableColumnData("select * from cred","lastName").get(0);
                createnewAccountPageMagento.typeLastName("bha");
                //String email  = ConnectDB.getTableColumnData("select * from cred","email").get(0);
                createnewAccountPageMagento.typeEmailAddress("thonmoy.b@gmail.com");
                //String password  = ConnectDB.getTableColumnData("select * from cred","password").get(0);
                createnewAccountPageMagento.typePassword("t123");
                createnewAccountPageMagento.typeConfirmPassword("t123");
                createnewAccountPageMagento.clickOnCreateanAccountButton2();
                //String error = createnewAccountPageMagento.getErrorMessage3();
                String error = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
                Assert.assertEquals(error, "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
                LOG.info("Failing Creation of an account success");
        }




















}
