package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hpsf.Section;
import org.apache.poi.hssf.record.pivottable.StreamIDRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class TimePage extends CommonAPI {
    Logger log = LogManager.getLogger(TimePage.class.getName());
    //13 Test Adding Project in the Time Section
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement timeSection;
    @FindBy(xpath = "//h6[text()=\"Time\"]")
    WebElement timeSectionHeader;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[4]")
    WebElement projectInfoDropdown;
    @FindBy(xpath = "//a[text()=\"Projects\"]")
    WebElement projectDropdownPosition;
    @FindBy(xpath = "//h5[text()=\"Projects\"]")
    WebElement projectHeader;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    WebElement plusAddButton;
    @FindBy(xpath = "//h6[text()=\"Add Project\"]")
    WebElement addProjectHeader;


//    @FindBy(xpath = "//input[@fdprocessedid='44mzf']")
//    WebElement nameField;
//    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
//    WebElement descriptionField;
//    @FindBy(xpath = "(//button[@type='button'])[3]")
//    WebElement plusAddCustomerButton;
//    @FindBy(xpath = "//p[text()=\"Add Customer\"]")
//    WebElement addCustomerHeader;
//    @FindBy(xpath = "//input[@fdprocessedid='r39a']")
//    WebElement nametxtfield;
//    @FindBy(xpath = "(//textarea[@placeholder='Type description here'])[2]")
//    WebElement descriptiontxtField;
//    @FindBy(xpath = "(//button[@type='submit'])[2]")
//    WebElement saveButtonOnAddCustomer;
//    @FindBy(xpath = "//input[@fdprocessedid='e1adyg']")
//    WebElement customerNameAfterAddingCustomer;
//    @FindBy(xpath = "//input[@fdprocessedid='sjhbl']")
//    WebElement projectAdminField;
//    @FindBy(xpath = "//button[@type='submit']")
//    WebElement saveButtonInAddProject;

    //14 Test Project Search in the Time Section
    @FindBy(xpath = "//input[@fdprocessedid='h3suf']")
    WebElement customerNameForSearchButton;
    @FindBy(xpath = "//input[@fdprocessedid='yk58sk']")
    WebElement projectField;
    @FindBy(xpath = "//input[@fdprocessedid='1if22']")
    WebElement projectAdminFieldForSearchButton;
    @FindBy(xpath = "//button[@fdprocessedid='x6htg9']")
    WebElement searchButton;
    @FindBy(xpath = "//span[text()='(1) Record Found']")
    WebElement recordFound;


    // 15 Test Employee Timesheets in the Time Section
    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[1]")
    WebElement timesheetDropdown;
    @FindBy(xpath = "//a[text()=\"Employee Timesheets\"]")
    WebElement employeeTimesheets;
    @FindBy(xpath = "//h6[text()=\"Select Employee\"]")
    WebElement selectEmployeeHeader;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameHints;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement viewButton;
    @FindBy(xpath = "//p[text()='No Timesheets Found']")
    WebElement noTimeSheet;

//    @FindBy(xpath = "//p[text()=\" * Required\"]")
//    WebElement requiredMessage;

    //13 Test Adding Project in the Time Section
    public TimePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // 13 Test Adding Project in the Time Section
    public void clickTimeSection() {
        clickOn(timeSection);
        log.info("Click on time success");
    }

    public boolean checkPresenceOfTimeHeader() {
        boolean timeHeaderIsDisplayed = isVisible(timeSectionHeader);
        log.info("Time section header presence " + timeHeaderIsDisplayed);
        return timeHeaderIsDisplayed;
    }

    public String getTimeHeader() {
        String timeHeadertext = getElementText(timeSectionHeader);
        log.info("time page header " + timeHeadertext);
        return timeHeadertext;
    }

    public void clickOnProjectInfoDropdown() {
        clickOn(projectInfoDropdown);
        log.info("Click on project dropdown success");
    }

    public void selectProjectFromDropdown(String name) {
        selectOptionFromDropdown(projectInfoDropdown, name);
        log.info("Select project from dropdown success");
    }

    public boolean checkPresenceProjectHeader() {
        boolean projectHeaderIsDisplayed = isVisible(projectHeader);
        log.info("project header presence " + projectHeaderIsDisplayed);
        return projectHeaderIsDisplayed;
    }

    public String getProjectHeader() {
        String projectHeaderText = getElementText(projectHeader);
        log.info("Project header text " + projectHeaderText);
        return projectHeaderText;
    }

    public void clickOnPlusAddbutton() {
        clickOn(plusAddButton);
        log.info("click on add button success");
    }

    public boolean checkPresenceAddProjectHeader() {
        boolean addProjectHeaderIsDisplayed = isVisible(addProjectHeader);
        log.info("add project header presence " + addProjectHeaderIsDisplayed);
        return addProjectHeaderIsDisplayed;
    }

    public String getAddProjectHeader() {
        String addProjectheaderText = getElementText(addProjectHeader);
        log.info("add project header text " + addProjectheaderText);
        return addProjectheaderText;
    }

    //14 Test Project Search in the Time Section
    public void selectCustomerName(String name){
        selectOptionFromDropdown(customerNameForSearchButton,name);
        log.info("enter customer name success");
    }
    public void selectProjectName(String project){
        selectOptionFromDropdown(projectField,project);
        log.info("enter project name success");
    }
    public void selectProjectAdmin(String admin){
        selectOptionFromDropdown(projectAdminFieldForSearchButton,admin);
        log.info("enter project admin success");
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
        log.info("Click on search Button success");
    }

    public String getRecordFoundMessage(){
        String recordFoundText = getElementText(recordFound);
        log.info("1 Record found text "+recordFoundText);
        return recordFoundText;
    }


    // 15 Test Employee Timesheets in the Time Section
    public void clickOnTimesheetDropdown(){
        clickOn(timesheetDropdown);
        log.info("Click on timesheet from dropdwon success");
    }
    public void selectEmployeeTimesheet(String name){
        selectOptionFromDropdown(employeeTimesheets,name);
        log.info("select Employee timesheet from dropdown success");
    }
    public boolean checkPresenceSelectEmployeeHeader(){
        boolean selectEmployeeHeaderIsDisplayed = isVisible(selectEmployeeHeader);
        log.info("select employee header presence "+ selectEmployeeHeaderIsDisplayed);
        return selectEmployeeHeaderIsDisplayed;
    }
    public String getSelectEmployeeMessage(){
        String selectEmployeeHeaderText = getElementText(selectEmployeeHeader);
        log.info("select employee header "+selectEmployeeHeaderText);
        return selectEmployeeHeaderText;
    }
    public void enterEmployeeName(String name){
        type(employeeNameHints,name);
        log.info("Enter employee name success");
    }
    public void clickOnViewButton(){
        clickOn(viewButton);
        log.info("click on view button success");
    }
    public String getNoTimeSheetMessage(){
        String noTimeSheetText = getElementText(noTimeSheet);
        log.info("no time sheet text "+noTimeSheetText);
        return noTimeSheetText;
    }






}
