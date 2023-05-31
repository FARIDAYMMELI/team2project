package magento;
import team2.base.CommonAPI;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.magentopages.HomePage;
import team2.utility.ConnectDB;


import team2.magentopages.CreateAccountPage;
import team2.utility.ConnectDB;

    public class CreateAccountTest extends CommonAPI {

          Logger LOG = LogManager.getLogger(CreateAccountTest.class.getName());
            Faker fakeData = new Faker();
            String fakeemailAddress=fakeData.internet().emailAddress();
            String fakename = fakeData.name().firstName();
            String fakelastName = fakeData.name().lastName();


          ConnectDB connectdb1 = new ConnectDB();

          String name= connectdb1.getTableColumnData("select * from user","firstname").get(0);
          String lastName= connectdb1.getTableColumnData("select * from user","lastname").get(0);
          String emailAddress= connectdb1.getTableColumnData("select * from user","email").get(0);

        @Test
        public void RegisterNewAccount() throws InterruptedException {
                HomePage homePage = new HomePage(getDriver());
                homePage.clickOnCreateanAccountButton1();
                String title = getCurrentTitle();
                Assert.assertEquals(title, "Create New Customer Account");
                LOG.info("create an account title page validation success");
                CreateAccountPage createnewAccountPageMagento = new CreateAccountPage(getDriver());
                createnewAccountPageMagento.typeFirstName(fakename);
                createnewAccountPageMagento.typeLastName(fakelastName);
                createnewAccountPageMagento.typeEmailAddress(fakeemailAddress);
                createnewAccountPageMagento.typePassword("password&1234");
                createnewAccountPageMagento.typeConfirmPassword("password&1234");
                createnewAccountPageMagento.clickOnCreateanAccountButton2();
                String confirmation = createnewAccountPageMagento.getConfirmation();
                Assert.assertEquals(confirmation, "Thank you for registering with Main Website Store.");
                LOG.info(" Creation of a new account success");
        }

        @Test(enabled = false)
        public void RegisterWithAnExistingCredentials() throws InterruptedException {

                HomePage homePage = new HomePage(getDriver());
                CreateAccountPage createnewAccountPageMagento = new CreateAccountPage(getDriver());
                homePage.clickOnCreateanAccountButton1();
                String expectedHeader = "Create New Customer Account";
                String actualHeader = createnewAccountPageMagento.newAccountHeaderText();
                Assert.assertEquals(actualHeader,expectedHeader);
                LOG.info("create an account title page validation success");
                createnewAccountPageMagento.typeFirstName(name);
                createnewAccountPageMagento.typeLastName(lastName);
                createnewAccountPageMagento.typeEmailAddress(emailAddress);
                //String password  = ConnectDB.getTableColumnData("select * from cred","password").get(0);
                createnewAccountPageMagento.typePassword("password&1234");
                createnewAccountPageMagento.typeConfirmPassword("password&1234");
                createnewAccountPageMagento.clickOnCreateanAccountButton2();
                String error = createnewAccountPageMagento.getErrorMessage3();
                //String error = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
                Assert.assertEquals(error, "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
                LOG.info("Failing Creation of an account success");
        }


        @Test
        public void InvalidCredentials() {
                HomePage homePage = new HomePage(getDriver());
                homePage.clickOnCreateanAccountButton1();
                String title = getCurrentTitle();
                Assert.assertEquals(title, "Create New Customer Account");
                LOG.info("create an account title page validation success");
                CreateAccountPage createnewAccountPageMagento = new CreateAccountPage(getDriver());
                //String FirstName = ConnectDB.getTableColumnData("select * from cred", "FirstName").get(0);
                createnewAccountPageMagento.typeFirstName(name);
                //String LastName  = ConnectDB.getTableColumnData("select * from cred","lastName").get(0);
                createnewAccountPageMagento.typeLastName(lastName);
                //String invalidEmailAdress  = ConnectDB.getTableColumnData("select * from cred","invalidEmailAdress").get(0);
                createnewAccountPageMagento.typeEmailAddress("thonmoy.b@icloud");
                //String password  = ConnectDB.getTableColumnData("select * from cred","password").get(0);
                createnewAccountPageMagento.typePassword("password&1234");
                createnewAccountPageMagento.typeConfirmPassword("password&1234");
                createnewAccountPageMagento.clickOnCreateanAccountButton2();
                String error = createnewAccountPageMagento.getErrorMessage2();
                Assert.assertEquals(error, "Please enter a valid email address (Ex: johndoe@domain.com).");
                LOG.info("Failing Creation of an account success");
        }





















}
