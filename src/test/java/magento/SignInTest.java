package magento;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.magentopages.HomePage;
import team2.magentopages.SigninPage;
import team2.utility.ExcelReader;

import java.io.File;
import java.time.Duration;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;


public class SignInTest extends CommonAPI {
    Logger log = LogManager.getLogger(SignInTest.class.getName());
    String currentDir = System.getProperty("user.dir");
    String path = currentDir+ File.separator+"data"+File.separator+"magento"+File.separator+"magento.xlsx";
    ExcelReader excelReader=new ExcelReader(path);
    String validUsername=excelReader.getDataFromCell("magento",1,1);
    String validPassword= excelReader.getDataFromCell("magento",2,1);
    @Test
    public void validTitle() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");
        String expectedTitle = "Home Page";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("Title success");
        driver.quit();
        System.out.println("close success");

    }
    @Test
    public void invalidTitle() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");
        String expectedTitle = "Home";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title success");
        driver.quit();
        System.out.println("close success");

    }

    @Test
    public void validCred() throws InterruptedException{
        //String email ="thonmoy.b@gmail.com";
        //String password = "t123";
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login");
        LOG.info("Sign in title page validation success");
        System.out.println("login in success");
        //String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(validUsername);
        //String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(validPassword);
        signinPageMagento.clickOnSigninButton2();
        String title1 = getCurrentURL();
        Assert.assertEquals(title1, "https://magento.softwaretestingboard.com/");
        LOG.info("Signin success");
        System.out.println("close success");

    }

    @Test
    public void invalidEmailAddress() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login");
        LOG.info("login title page validation success");
        //String invalidEmailAdress = ConnectDB.getTableColumnData("select * from cred","invalidEmailAdress").get(0);
        signinPageMagento.typeInvalidEmailAddress("thonmoy.b@gmail.");
        signinPageMagento.typePassword("password");
        signinPageMagento.clickOnSigninButton2();
        String error = signinPageMagento.getErrorMessage();
        Assert.assertEquals(error, "Please enter a valid email address (Ex: johndoe@domain.com).");
        LOG.info("error message validation success");
    }
    @Test
    public void invalidPassword() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPage signinPageMagento = new SigninPage(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login");
        LOG.info("login title page validation success");
        //String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        String email = "thonmoy.b@gmail.com";
        signinPageMagento.typeEmailAddress(email);
        //String invalidPassword = ConnectDB.getTableColumnData("select * from cred","invalidPassword").get(0);
        signinPageMagento.typeInvalidPassword("invalidPassword");
        signinPageMagento.clickOnSigninButton2();
        String error = signinPageMagento.getErrorMessage1();
        LOG.info("error message validation success");
    }


        /*driver.findElement(By.id("user-name")).sendKeys("standard_user");
        System.out.println("username success");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        System.out.println("password success");
        driver.findElement(By.id("login-button")).click();
        System.out.println("login button success");

        String expectedHomePageHeader = "Products";
        String actualHomePageHeader = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        System.out.println("user logged in success");

        driver.close();
        System.out.println("close success");
    }

    @Test
    public void invalidUser(){
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        String expectedTitle = "Swag Labs";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


        driver.findElement(By.id("user-name")).sendKeys("invalidUser");
        System.out.println("username success");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        System.out.println("password success");
        driver.findElement(By.id("login-button")).click();
        System.out.println("login button success");

        String expectedHomePageHeader = "Products";
        String actualHomePageHeader = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        System.out.println("user logged in success");

        driver.close();
        System.out.println("close success");

    }
*/

}






