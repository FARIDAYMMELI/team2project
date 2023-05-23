package team2.magentopages;

import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CreateAccountPage.class.getName());
    public CreateAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy(xpath = "//input[@id='email_address']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmpasswordField;

    @FindBy(id="firstname")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameField;
    @FindBy(xpath = "(//div[@class='primary']//preceding-sibling::button)[1]")
    WebElement createAccountButton2;
    @FindBy(id = "email_address-error")
    WebElement errorMessage2;
    @FindBy(xpath = "//div[@class='message-error error message']")
    WebElement errorMessage3;
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement confirmation;
    @FindBy(xpath = "//span[contains(text(),'Create New Customer Account')]")
    WebElement newAccountHeader;




    //reusable methods
    public void typeFirstName(String firstName){
        type(firstNameField,firstName);
        LOG.info("type first name success");
    }
    public String newAccountHeaderText() {
        String text = getElementText(newAccountHeader);
        LOG.info("user logged in success");
        return text;
    }
    public void typeLastName(String lastName){
        type(lastNameField,lastName);
        LOG.info("type last name success");
    }
    public void typeEmailAddress(String emailAddress){
        type(emailField,emailAddress);
        LOG.info("type email address success");
    }
    public void typePassword(String password){
        type(passwordField,password);
        LOG.info("type password success");
    }

    public void typeConfirmPassword(String password){
        type(confirmpasswordField,password);
        LOG.info("confirm password success");
    }
    public void clickOnCreateanAccountButton2(){
        clickOn(createAccountButton2);
        LOG.info("click create account button success");
    }
    public String getErrorMessage2(){

        return getElementText(errorMessage2);

    }
    public String getErrorMessage3(){

        return getElementText(errorMessage3);

    }
    public String getConfirmation(){

        return getElementText(confirmation);

    }

}
