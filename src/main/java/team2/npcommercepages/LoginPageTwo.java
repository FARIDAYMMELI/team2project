package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LoginPageTwo extends CommonAPI {

    Logger log = LogManager.getLogger(LoginPageTwo.class.getName());

    public LoginPageTwo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    public void clickOnLoginLink() {
        clickOn(loginLink);
        log.info("user clicks on log in button");
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement loginUsernameField;

    public void typeUsername(String username) {
        type(loginUsernameField, username);
        waitFor(3);
        log.info(" Type username successfully");
    }

    @FindBy(xpath = "//input[@id='Password']")
    WebElement loginPasswordField;

    public void typePassword(String password) {
        type(loginPasswordField, password);
        waitFor(3);
        log.info(" Type password successfully");
    }

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement LoginButton;

    public void clickOnLoginButton() {
        clickOn(LoginButton);
        log.info(" Click On LoginButton successfully");
    }

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement loginValidation;

    public String loginValidationText() {
        String text = getElementText(loginValidation);
        waitFor(3);
        log.info("  login Validation successfully");
        return text;
    }

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement LogOutButton;

    public void clickOnLogOutButton() {
        clickOn(LogOutButton);
        log.info(" Click On LogOutButton successfully");
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement LogoutValidation;
    public String logOutValidationText() {
        String text = getElementText(LogoutValidation);
        log.info("  log out Validation successfully");
        return text;
    }

    @FindBy(xpath = "//li[normalize-space()='No customer account found']")
    WebElement invalidLoginMessage;

    public String invalid(){
        elementIsDisplayed(invalidLoginMessage);
        log.info("user gets error message");
        return invalid();
    }
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    //forgot password
    @FindBy(xpath = "//span[@class='forgot-password']")
    WebElement forgotPassword;

    //recovery EmailField
    @FindBy(xpath = "//input[@id='Email']")
    WebElement recoveryEmailField;

    // click on recovery button
    @FindBy(xpath = "//button[@name='send-email']")
    WebElement recoveryButton;

    // Recovery password Validation
    @FindBy(xpath = "//p[@class='content']")
    WebElement recoveryValidation;


    // click on my account
    @FindBy(xpath = "//a[normalize-space()='My account']")
    WebElement myAccountLink;

    //Click 0n Apply for vendor account
    @FindBy(xpath = "//a[normalize-space()='Apply for vendor account']")
    WebElement applyForVendorAccount;

    public void clickOnRegisterLink() {
        clickOn(registerLink);
        log.info("The Register page opened successfully.");
    }


    public void typeItemAndClickSearch(String itemName) {
    }

    //forgotpassword
    public void clickOnForgotPassword() {
        clickOn(forgotPassword);
        log.info("Click forgot Password successfully.");
    }

    public void clickOnRecoveryEmailField() {
        clickOn(recoveryEmailField);
        log.info("Click On Recovery Email Field successfully.");

    }

    // Recovery email field
    public void typeEmailOnRecoveryEmailField(String email) {
        type(recoveryEmailField, email);
        log.info(" Type email successfully");
    }

    //recoveryButton
    public void clickOnRecoveryButton() {
        clickOn(recoveryButton);
        log.info("Click On Recovery Button successfully.");
    }

    // Recovery password Validation
    public String recoveryValidationText() {
        String text = getElementText(recoveryValidation);
        log.info("  Recovery Validation succeeded");
        return text;
    }

    // Click on My account link myAccountLink
    public void clickOnMyAccountLink() {
        clickOn(myAccountLink);
        log.info("Click On my Account Link successfully.");
    }

    //Click 0n Apply for vendor account
    public void clickOnApplyForVendorAccount() {
        clickOn(applyForVendorAccount);
        log.info("Click on apply for Vendor Account Link successfully.");
    }

}

