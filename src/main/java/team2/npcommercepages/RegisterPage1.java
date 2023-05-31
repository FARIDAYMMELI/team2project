package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class RegisterPage1 extends CommonAPI {

    Logger log = LogManager.getLogger(RegisterPage1.class.getName());

    public RegisterPage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".ico-register")
    WebElement userRegister;

//    @FindBy(xpath = "//h1[text()='Register']")
//    WebElement registerPageTitle;

    @FindBy(css = "#gender-female")
    WebElement userGender;

    @FindBy(css = "#FirstName")
    WebElement usersFirstName;

    @FindBy(css = "#LastName")
    WebElement userLastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement userDateOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement usersDateOfBirthMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement usersDateOFBirthYear;

    @FindBy(css = "#Email")
    WebElement usersEmail;

    @FindBy(css = "#Company")
    WebElement companyName;

    @FindBy(css = "#Newsletter")
    WebElement newsLetterCheckBox;

    @FindBy(css = "#Password")
    WebElement newPassword;

    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(css = "#register-button")
    WebElement register;

    @FindBy(css = ".result")
    WebElement registrationComplete;


    public void clickOnRegister(){
        clickOn(userRegister);
        log.info("click on Register button success");
    }
//    public boolean checkPresenceOfTitleOfThePage(){
//        boolean pageTitleIsDisplayed = isVisible(registerPageTitle);
//        log.info("Page title is displayed" +registerPageTitle);
//        return pageTitleIsDisplayed;
//    }
//    public String getTitleOfThePage(){
//        String titleOfPageText = getElementText(registerPageTitle);
//        log.info("Page title text "+titleOfPageText);
//        return titleOfPageText;
//    }

    public void clickOnGenderFemale(){
        clickOn(userGender);
        log.info("click on gender female success");
    }
    public void enterFirstName(String firstName){
        type(usersFirstName, firstName);
        log.info("user firstname success");

    }
    public void enterLastName(String lastName){
        type(userLastName, lastName);
        log.info("user lastname success");
    }
    public void usersDateOfBirth(){
        clickOn(userDateOfBirth);
        log.info("user date of birth success");

    }
    public void userDateOfBirthMonth(){
        clickOn(usersDateOfBirthMonth);
        log.info("Users date of month success");
    }
    public void userDateOfYear(){
        clickOn(usersDateOFBirthYear);
        log.info("users date of year success");
    }
    public void enterEmail(String email){
        type(usersEmail, email);
        log.info("User email success");

    }
    public void nameOfCompany(String company){
        type(companyName, company);
        log.info("user inputs company name");
    }
    public void newLetterCheckbox(){
        clickOn(newsLetterCheckBox);
        log.info("check box is checked");
     }
    public void createPassword(String password){
        type(newPassword, password);
        log.info("User types in new password");
    }
    public void confirmsPassword(String passwordAdded){
        type(confirmPassword, passwordAdded);
        log.info("user confirms new password");
    }
    public void registerButton(){
        clickOn(register);
        log.info("user clicks on register button");
    }
    public String registrationSuccessText(){
        String text = getElementText(registrationComplete);
        log.info("get registration is complete text");
        return text;
    }
    @FindBy(css = "#register-button")
    WebElement registerButton;


    //registration Validation
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationValidation;

    //RE-registration Validation
    @FindBy(xpath = "//li[normalize-space()='The specified email already exists']")
    WebElement reRegistrationValidation;

    //Click on Register Button

    @FindBy(xpath = " //button[normalize-space()='Register']")
    WebElement registrationButton;

    //click on register button
    public void clickOnRegisterButton() {
        clickOn(registerButton);
        log.info("  Click On Register Button successfully");
    }


    //registration Validation
    public String registrationValidationText() {
        String text = getElementText(registrationValidation);
        log.info("  Registration Validation succeeded");
        return text;
    }

    public String reRegistrationValidationText() {
        String text = getElementText(reRegistrationValidation);
        log.info("  Registration Validation succeeded");
        return text;

    }
    //Click on Register Button
    public void clickOnRegisterButtonOnTheLeft() {
        clickOn(registrationButton);
        log.info("  Click On Register Button successfully");
    }

}



