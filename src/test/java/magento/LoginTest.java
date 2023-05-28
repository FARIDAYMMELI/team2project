package magento;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.magentopages.HomePage;
import team2.magentopages.SigninPageMagento;

import java.time.Duration;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;


public class LoginTest extends CommonAPI {
    Logger log = LogManager.getLogger(LoginTest.class.getName());

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
        String email ="thonmoy.b@gmail.com";
        String password = "t123";
        HomePage homePage = new HomePage(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
        homePage.clickOnSigninButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Customer Login");
        LOG.info("Sign in title page validation success");
        System.out.println("login in success");
        //String email = ConnectDB.getTableColumnData("select * from cred","email").get(0);
        signinPageMagento.typeEmailAddress(email);
        //String password = ConnectDB.getTableColumnData("select * from cred","password").get(0);
        signinPageMagento.typePassword(password);
        signinPageMagento.clickOnSigninButton2();
        String title1 = getCurrentURL();
        Assert.assertEquals(title1, "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        LOG.info("Signin success");
        System.out.println("close success");

    }

    @Test
    public void invalidEmailAddress() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
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
        SigninPageMagento signinPageMagento = new SigninPageMagento(getDriver());
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






