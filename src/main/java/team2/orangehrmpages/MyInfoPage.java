package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class MyInfoPage extends CommonAPI {
    Logger log = LogManager.getLogger(MyInfoPage .class.getName());
    public MyInfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //these are for My Info section
    @FindBy(xpath = "//span[text()=\"My Info\"]")
    WebElement myInfoSection;
    @FindBy(xpath = "//h6[text()='PIM']")
    WebElement pimHeader;
    @FindBy(xpath = "//h6[text()=\"Personal Details\"]")
    WebElement personalDetailsHeader;
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstnameField;
    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middlenameField;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastnameField;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    WebElement employeeIDField;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
    WebElement SSNnumberField;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement nationalityDropdown;
    @FindBy(xpath = "//div[text()=\"American\"]")
    WebElement americanDropdownPosition;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement maritalStatusDropdown;
    @FindBy(xpath = "//div[text()=\"Single\"]")
    WebElement maritalStatusSinglePosition;
    @FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
    WebElement dateOfBirthField;
    @FindBy(xpath = "//input[@value='1']")
    WebElement maleRadioButton;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement saveButton;


    //these are for My Info section
    public void clickOnMyInfo(){
        clickOn(myInfoSection);
        log.info("Click on My Info success");
    }

    public boolean checkPresenceOfPIM(){
        boolean PIMisDisplayed = isVisible(pimHeader);
        log.info("PIM header presence "+PIMisDisplayed);
        return PIMisDisplayed;
    }
    public String getPIMmessage(){
        String PIMtext = getElementText(pimHeader);
        waitFor(3);
        log.info("PIM text "+PIMtext);
        return PIMtext;
    }
    public boolean checkPresenceOfPersonalDetailsHeader(){
        boolean personalDeatailsHeaderIsDisplayed = isVisible(personalDetailsHeader);
        log.info("Personal details header presence "+personalDeatailsHeaderIsDisplayed);
        return personalDeatailsHeaderIsDisplayed;
    }
    public String getPersonalDetailsText(){
        String personalDetailsText = getElementText(personalDetailsHeader);
        waitFor(3);
        log.info("Personal details header "+personalDetailsText);
        return personalDetailsText;
    }
    public void enterFirstName(String firstName){
        type(firstnameField,firstName);
        log.info("enter first name success");
    }
    public void enterMiddleName(String middleName){
        type(middlenameField,middleName);
        log.info("Enter middle name success");
    }
    public void enterLastName(String lastName){
        type(lastnameField,lastName);
        log.info("enter last name success");
    }
    public void enterEmployeeID(String ID){
        type(employeeIDField,ID);
        log.info("enter employee ID success");
    }
    public void enterSSN(String ssn){
        type(SSNnumberField,ssn);
        log.info("Enter SSN success");
    }
    public void clickOnNationalityDropdown(){
        clickOn(nationalityDropdown);
        log.info("Click on Nationality dropdown success");
    }
    public void selectAmerican(String nationality){
        selectOptionFromDropdown(americanDropdownPosition, nationality);
        log.info("select american success");
    }
    public void clickOnMaritalStatusDropdown(){
        clickOn(maritalStatusDropdown);
        log.info("Click on marital status dropdown success");
    }
    public void selectSingle(String status){
        selectOptionFromDropdown(maritalStatusSinglePosition,status);
        log.info("select single from dropdown success");
    }
    public void enterDateOfBirth(String dateOfBirth){
        type(dateOfBirthField,dateOfBirth);
        log.info("enter date of birth success");
    }
    public void clickOnMaleRadioButton(){
        clickOn(maleRadioButton);
        log.info("Click on male radio button success");
    }
    public void clickOnSaveButton(){
        clickOn(saveButton);
        log.info("Click on save button success");
    }
















}
