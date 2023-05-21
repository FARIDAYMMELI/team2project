package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LoginRegisterPage extends CommonAPI {




    Logger log = LogManager.getLogger(LoginRegisterPage.class.getName());

    public LoginRegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects
    @FindBy(css = "#username")
    WebElement usernameField;
    @FindBy(css = "#username")
    WebElement invalidUsernameField;

    @FindBy(css = "#password")
    WebElement passwordField;
    @FindBy(css = "#password")
    WebElement invalidPasswordField;

    @FindBy(css = "#reg_email")
    WebElement emailField;

    @FindBy(css = "#reg_password")
    WebElement passwordregField;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement LoginButton;

    @FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    WebElement ErrorMessage;
    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement errorUsernameMissing;
    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement errorPasswordMissing;
    @FindBy(xpath = "//h2[normalize-space()='Login']")
    WebElement loginHead;

    @FindBy(xpath = "//button[@name='register']")
    WebElement RegisterButton;
    @FindBy(xpath = "//span[text()='Home']")
    WebElement homeButton;


    //reusable methods
    public void typeusername(String username){
        type(usernameField, username);
        log.info("type username success");
    }
    public void typeInvalidUsername(String username){
        type(invalidUsernameField, username);
        log.info("type invalid username success");
    }

    public void typepassword(String password){
        type(passwordField, password);
        log.info("type password success");
    }
//    public void typeInvalidPassword(String password){
//        type(invalidPasswordField, password);
//        LOG.info("type password success");
//    }

    public void clickOnLoginButton(){
        clickOn(LoginButton);
        log.info("click Login button success");
    }

    public  String getHeaderText(){
        String text = getElementText(loginHead);
        log.info("user logged in success");
        return text;
    }

    public void typeEmailAddressregister(String EmailAddress){
        type(emailField, EmailAddress);
        log.info("type EmailAddress success");
    }
//    public String getHeaderText(){
//        String text = getElementText("My account – Automation");
//        LOG.info("user logged in success");
//        return text;
//    }

    public void typepasswordRegister(String passwordRegister){
        type(passwordregField, passwordRegister);
        log.info("type password success");
    }
    public void clickOnRegisterButton(){
        clickOn(RegisterButton);
        log.info("click Login button success");
    }

    public String getErrorMessage(){
        log.info("error message success");
        return getElementText(ErrorMessage);


    }
    public String getErrorMessageUsernameMissing(){
        log.info("error message success");
        return getElementText(errorUsernameMissing);


    }
    public String getErrorMessagePasswordMissing(){
        log.info("error message success");
        return getElementText(errorPasswordMissing);


    }


    public void clickOnHomeButton(){
        clickOn(homeButton);
        log.info("click Home button success");
    }



}
