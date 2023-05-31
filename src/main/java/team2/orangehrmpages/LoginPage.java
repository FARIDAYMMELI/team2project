package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LoginPage extends CommonAPI {
    Logger log = LogManager.getLogger(LoginPage.class.getName());
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[name='username']")
    WebElement usernameField;
    @FindBy(css = "input[type='password']")
    WebElement passwordField;
    @FindBy(css = ".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    WebElement loginButton;
    @FindBy(xpath = "//p[text()=\"Invalid credentials\"]")
    WebElement errorMessage;
    @FindBy(xpath = "//span[text()=\"Required\"]")
    WebElement errorRequiredMessage;

    @FindBy(xpath = "//title[text()=\"OrangeHRM\"]")
    WebElement loginPageHeader;

    @FindBy(css = "input[name='username']")
    WebElement resetUsername;
    @FindBy(css = ".oxd-text.oxd-text--h6.orangehrm-forgot-password-title")
    WebElement successMessage;


//    public void goLogin(String username, String password){
//        type(usernameField,username);
//        log.info("enter username success");
//        type(passwordField,password);
//        log.info("enter password success");
//        clickOn(loginButton);
//    }


    //resuable methods
    public void enterUsername(String username){
        type(usernameField,username);
        log.info("enter username success");
    }
    public void enterPassword(String password){
        type(passwordField,password);
        log.info("enter password successpu");
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
        log.info("click on login button success");
    }
    public String getErrorMessage(){
        String text = getElementText(errorMessage);
        log.info("get error message text success");
        return text;
    }
    public String getErrorRequiredMessage(){
        String text = getElementText(errorRequiredMessage);
        log.info("Error Required message success");
        return text;
    }


    public boolean checkPresenceOfLoginPageHeader(){
        boolean loginPageHeaderIsDisplayed = isVisible(loginPageHeader);
        log.info("login page header presence "+loginPageHeaderIsDisplayed);
        return loginPageHeaderIsDisplayed;
    }

    public String getHomePageHeaderText(){
        String loginPageHeaderText = getElementText(loginPageHeader);
        log.info("login page header text is "+loginPageHeaderText);
        return loginPageHeaderText;
    }

    @FindBy(css = ".oxd-text.oxd-text--p.orangehrm-login-forgot-header")
    WebElement forgotPassword;
    public void clickForgotYourPassword(){
        clickOn(forgotPassword);
        log.info("Click on Forgot your password? success");
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement resetPasswordPageHeader;
    public boolean checkPresenceOfResetPasswordHeader(){
        boolean resetPasswordHeaderIsDisplayed = isVisible(resetPasswordPageHeader);
        log.info("Reset password header presence "+ resetPasswordHeaderIsDisplayed);
        return resetPasswordHeaderIsDisplayed;
    }
    public String getResetPasswordHeader(){
        String resetPasswordText = getElementText(resetPasswordPageHeader);
        log.info("Reset password header text "+getResetPasswordHeader());
        return resetPasswordText;
    }
    public void enterUsername4ResetPassword(String usernameReset) {
        type(resetUsername, usernameReset);
        log.info("Enter username success");
    }
    public String getSuccessMessage(){
        String text = getElementText(successMessage);
        log.info("get success message success");
        return text;
    }



}
