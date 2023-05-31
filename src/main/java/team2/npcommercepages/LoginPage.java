package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LoginPage extends CommonAPI {
    Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this); 
    }


//    public boolean checkPresenceOfPageTitle(){
//        boolean pageHeaderIsDisplayed = isVisible(pageTitle);
//        log.info("Page title presence "+pageHeaderIsDisplayed);
//        return pageHeaderIsDisplayed;
//    }

//    @FindBy(xpath = "//title[text()=\"nopCommerce demo store\"]")
//    WebElement pageTitle;
//    public String getPageTitleMessage(){
//        String pageTitleText = getElementText(pageTitle);
//        log.info("Page title text "+pageTitle);
//        return pageTitleText;
//    }
    @FindBy(xpath = "//a[@class=\"ico-login\"]")
    WebElement loginBtn;
    public void clickOnLoginBtn(){
        clickOn(loginBtn);
        log.info("click on login button success");
    }
//    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
//    WebElement welcomeHeader;
//    public String getWelcomeMessage(){
//        String welcomeText = getElementText(welcomeHeader);
//        log.info("welcome text is ");
//        return welcomeText;
//    }

    @FindBy(css = "#Email")
    WebElement userEmailField;
    public void enterEmail(String email){
        type(userEmailField, email);
        log.info("enter email success");
    }

    @FindBy(css = "#Password")
    WebElement passwordField;
    public void enterPassword(String password){
        type(passwordField, password);
        log.info("user password success");
    }

    @FindBy(css = ".button-1.login-button")
    WebElement loginButton;
    public void clickOnLoginButton(){
        clickOn(loginButton);
        log.info("User logged in successfully");
    }

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeMessage;
    public String getWelcomeTextMessage(){
        String welcomeText= getElementText(welcomeMessage);
        log.info("Welcome message present");
        return welcomeText;
    }

    @FindBy(xpath = "//h1[text()=\"Welcome, Please Sign In!\"]")
    WebElement welcomePageTitle;
    public String welcomePage(){
        String welcomeSignInPage = getElementText(welcomePageTitle);
        log.info("Welcome please sign in validation");
        return welcomeSignInPage;
    }

    @FindBy(xpath = "//li[text()=\"The credentials provided are incorrect\"]")
    WebElement unsuccessfulLogin;
    public String loginUnsuccessful(){
        String loginWasUnsuccessful = getElementText(unsuccessfulLogin);
        log.info("unsuccessful login message "+ loginWasUnsuccessful);
        return loginWasUnsuccessful;
    }
    @FindBy(css = "#Email-error")
    WebElement errorMessage;
    public String onlyPassword(){
        String loginUnsuccessful = getElementText(errorMessage);
        log.info("when user types in only password "+ loginUnsuccessful);
        return loginUnsuccessful;
    }

}
