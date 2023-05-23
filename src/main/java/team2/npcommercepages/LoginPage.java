package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LoginPage extends CommonAPI {
    Logger log = LogManager.getLogger(team2.scaledupitpages.LoginPage.class.getName());

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this); 
    }

    @FindBy(xpath = "//title[text()='nopCommerce demo store. Camera & photo']")
    WebElement pageTitle;
    @FindBy(xpath = "//a[@class=\"ico-login\"]")
    WebElement loginBtn;
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeHeader;
    @FindBy(css = "#Email")
    WebElement userEmailField;

    @FindBy(css = "#Password")
    WebElement passwordField;

    @FindBy(css = ".button-1.login-button")
    WebElement loginButton;

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeMessage;

    @FindBy(xpath = "//h1[text()=\"Welcome, Please Sign In!\"]")
    WebElement welcomePageTitle;

    @FindBy(xpath = "//li[text()=\"The credentials provided are incorrect\"]")
    WebElement unsuccessfulLogin;

    @FindBy(css = "#Email-error")
    WebElement errorMessage;
    public boolean checkPresenceOfPageTitle(){
        boolean pageHeaderIsDisplayed = isVisible(pageTitle);
        log.info("Page title presence "+pageHeaderIsDisplayed);
        return pageHeaderIsDisplayed;
    }
    public String getPageTitleMessage(){
        String pageTitleText = getElementText(pageTitle);
        log.info("Page title text "+pageTitleText);
        return pageTitleText;
    }
    public void clickOnLoginBtn(){
        clickOn(loginBtn);
        log.info("click on login button success");
    }
    public String getWelcomeMessage(){
        String welcomeText = getElementText(welcomeHeader);
        log.info("welcome text is "+welcomeText);
        return welcomeText;
    }
    public void enterEmail(String email){
        type(userEmailField, email);
        log.info("enter email success");
    }
    public void enterPassword(String password){
        type(passwordField, password);
        log.info("user password success");
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
        log.info("User logged in successfully");
    }
    public String getWelcomeTextMessage(){
        String welcomeText= getElementText(welcomeMessage);
        log.info("Welcome message present");
        return welcomeText;
    }
    public String welcomePage(){
        String welcomeSignInPage = getElementText(welcomePageTitle);
        log.info("Welcome please sign in validation");
        return welcomeSignInPage;
    }
    public String loginUnsuccessful(){
        String loginWasUnsuccessful = getElementText(unsuccessfulLogin);
        log.info("unsuccessful login message "+ loginWasUnsuccessful);
        return loginWasUnsuccessful;
    }
    public String onlyPassword(){
        String loginUnsuccessful = getElementText(errorMessage);
        log.info("when user types in only password "+ loginUnsuccessful);
        return loginUnsuccessful;
    }

}
