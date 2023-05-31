package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LeavePage extends CommonAPI {
    Logger log = LogManager.getLogger(LeavePage.class.getName());
    public LeavePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //16 Test Add Leave Entitlements in the Leave Section
    @FindBy(xpath = "getPageHeaderText")
    WebElement leaveSection;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement leaveHeader;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[1]")
    WebElement entitlementDropdown;
    @FindBy(xpath = "//a[text()=\"Add Entitlements\"]")
    WebElement addEntitlementFromDropdown;
    @FindBy(xpath = "//p[text()=\"Add Leave Entitlement\"]")
    WebElement addLeaveEntitlementHeader;
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    WebElement individualEmployeeRadioButton;
    @FindBy(xpath = "//input[@fdprocessedid='egw9wp']")
    WebElement employeeName;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement leaveTypeDropdown;
    @FindBy(xpath = "//div[text()=\"US - Vacation\"]")
    WebElement usVactionFromDropdown;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement leavePeriodDropdown;
    @FindBy(xpath = "//div[text()='2023-01-01 - 2023-12-31']")
    WebElement leavePeriodFromDropDown;
    @FindBy(xpath = "//input[@fdprocessedid='fhrsp']")
    WebElement entitlementField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButtton;
    @FindBy(xpath = "//button[text()=' Confirm ']")
    WebElement confirmButton;
    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement add4Validate;

    //------------------------------------------------------------------------------------------

    //16 Test Add Leave Entitlements in the Leave Section
    public void clickOnLeaveSection(){
        clickOn(leaveSection);
        log.info("Click on leave section success");
    }
    public boolean checkPresenceOfPageHeader(){
        boolean pageHeaderIsDisplayed = isVisible(leaveHeader);
        log.info("page header presence "+pageHeaderIsDisplayed);
        return pageHeaderIsDisplayed;
    }
    public String getPageHeaderText(){
        String pageHeaderText =getElementText(leaveHeader);
        waitFor(3);
        log.info("page header text is "+pageHeaderText);
        return pageHeaderText;
    }
    public void clickOnEntitlement(){
        clickOn(entitlementDropdown);
        log.info("Click on entitlement success");
    }
    public void clickOnAddEntitlement(){
        clickOn(addEntitlementFromDropdown);
        log.info("Click on Add Entitlement success");
    }
    public boolean checkPresenceOfAddLeaveEntitlementPageHeader(){
        boolean addEntitlementPageHeaderIsDisplayed = isVisible(addLeaveEntitlementHeader);
        log.info("add leave entitlement page header presence "+addEntitlementPageHeaderIsDisplayed);
        return addEntitlementPageHeaderIsDisplayed;
    }
    public String getAddLeaveEntitlementPageHeaderText(){
        String addLeaveEntitlementtext = getElementText(addLeaveEntitlementHeader);
        log.info("add leave enetitlement text "+addLeaveEntitlementtext);
        return addLeaveEntitlementtext;
    }
    public void clickOnIndividualRadioButton(){
        clickOn(individualEmployeeRadioButton);
        log.info("Click on individual radio button success");
    }
    public void enterEmployeeName(String name){
        type(employeeName,name);
        log.info("enter employee name success");
    }
    public void clickLeaveTypeDropdown(){
        clickOn(leaveTypeDropdown);
        log.info("click on leave type dropdown success");
    }
    public void selectUSVacation(String vacationType){
        selectOptionFromDropdown(usVactionFromDropdown, vacationType);
        log.info("select US Vacation success");
    }
    public void clickOnLeavePeriodDropdown(){
        clickOn(leavePeriodDropdown);
        log.info("Click on dropdown success");
    }
    public void selectLeavePeriod(String leavePeriod){
        selectOptionFromDropdown(leavePeriodDropdown,leavePeriod);
        log.info("select leave period success");
    }
    public void enterEntitlement(String entitle){
        type(entitlementField,entitle);
        log.info("enter in the entitlement success");
    }
    public void clickOnSaveButton(){
        clickOn(saveButtton);
        log.info("Click on save button success");
    }
    public void clickOnConfirmButton(){
        clickOn(confirmButton);
        log.info("Click on confirm button success");
    }
    public String getaddValidationMessage(){
        String addValidationText = getElementText(add4Validate);
        log.info("add validation text "+addValidationText);
        return addValidationText;
    }


}
