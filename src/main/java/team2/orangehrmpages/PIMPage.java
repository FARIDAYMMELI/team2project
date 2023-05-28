package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class PIMPage extends CommonAPI{
    Logger log = LogManager.getLogger(PIMPage.class.getName());
    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //tc-29 Test the PIM button in the PIM section
    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
    WebElement PIMSection;
    public void clickOnPIMSeciton(){
        clickOn(PIMSection);
        log.info("Click on PIM section success");
    }
    @FindBy(xpath = "//h6[text()='PIM']")
    WebElement PIMHeader;
    public String getPIMHeader(){
        String PIMHeaderText = getElementText(PIMSection);
        log.info("PIM header text "+PIMHeaderText);
        return PIMHeaderText;
    }


    //tc-30 Test the Add button in the PIM section
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    public void clickOnAddButton(){
        clickOn(addButton);
        log.info("Click on Add button success");
    }
    @FindBy(xpath = "//h6[text()='Add Employee']")
    WebElement addEmployeeHeader;
    public String getAddEmployeeHeader(){
        String addEmployeeHeaderText = getElementText(addEmployeeHeader);
        log.info("Add employee header text "+addEmployeeHeaderText);
        return addEmployeeHeaderText;
    }
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;
    public void enterFirstName(String name){
        type(firstName,name);
        log.info("Enter first name success");
    }
    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middleName;
    public void enterMiddleName(String name){
        type(middleName,name);
        log.info("Enter middle name success");
    }
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;
    public void enterLastName(String name){
        type(lastName,name);
        log.info("enter last name success");
    }
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement employeeID;
    public void enterEmployeeID(String ID){
        type(employeeID,ID);
        log.info("Enter employee id success");
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;
    public void clickOnSaveButton(){
        clickOn(saveButton);
        log.info("Click on save button success");
    }
    @FindBy(xpath = "//h6[text()='Personal Details']")
    WebElement personalDetailsHeader;
    public String getPersonalDetailsHeader(){
        String personalDetailText= getElementText(personalDetailsHeader);
        log.info("Personal detail header text "+personalDetailText);
        return personalDetailText;
    }



}
