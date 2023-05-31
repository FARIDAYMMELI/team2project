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


    //13 Test Adding Project in the Time Section
    public TimePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // 13 Test Adding Project in the Time Section
    @FindBy(xpath = "//span[text()='Time']")
    WebElement timeSection;
    public void clickTimeSection() {
        clickOn(timeSection);
        log.info("Click on time success");
    }

    @FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement timeSectionHeader;
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
    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[4]")
    WebElement projectInfoDropdown;
    public void clickOnProjectInfoDropdown() {
        clickOn(projectInfoDropdown);
        log.info("Click on project dropdown success");
    }
    @FindBy(xpath = "//a[text()='Projects']")
    WebElement projectDropdown;

    public void clickProjectFromDropdown() {
        clickOn(projectDropdown);
        log.info("Select project from dropdown success");
    }

    @FindBy(xpath = "//a[text()=\"Projects\"]")
    WebElement projectDropdownPosition;
    @FindBy(xpath = "//h5[text()=\"Projects\"]")
    WebElement projectHeader;
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

    @FindBy(xpath = "(//button[@type='button'])[4]")
    WebElement plusAddButton;
    public void clickOnPlusAddbutton() {
        clickOn(plusAddButton);
        log.info("click on add button success");
    }

    @FindBy(xpath = "//h6[text()=\"Add Project\"]")
    WebElement addProjectHeader;
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
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement customerNameForSearchButton;
    public void enterCustomerName(String name){
        type(customerNameForSearchButton,name);
        log.info("enter customer name success");
    }
    public void clickOnCustormerName(){
        clickOn(customerNameForSearchButton);
        log.info("choose name success");
    }

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    WebElement projectField;
    public void enterProjectName(String project){
        type(projectField,project);
        log.info("enter project name success");
    }
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[3]")
    WebElement projectAdminFieldForSearchButton;
    public void enterProjectAdmin(String admin){
        type(projectAdminFieldForSearchButton,admin);
        log.info("enter project admin success");
    }
    @FindBy(xpath = "//button[@type='reset']")
    WebElement resetButton;
    public void clickOnResetButton(){
        clickOn(resetButton);
        log.info("Click on search Button success");
    }

    @FindBy(xpath = "//button[@type='reset']")
    WebElement recordFound;
    public String getRecordFoundMessage(){
        String recordFoundText = getElementText(recordFound);
        log.info("search text "+recordFoundText);
        return recordFoundText;
    }


    // 15 Test Employee Timesheets in the Time Section

    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[1]")
    WebElement timesheetDropdown;
    public void clickOnTimesheetDropdown(){
        clickOn(timesheetDropdown);
        log.info("Click on timesheet from dropdwon success");
    }
    @FindBy(xpath = "//a[text()=\"Employee Timesheets\"]")
    WebElement employeeTimesheets;
    public void selectEmployeeTimesheet(String name){
        selectOptionFromDropdown(employeeTimesheets,name);
        log.info("select Employee timesheet from dropdown success");
    }
    @FindBy(xpath = "//h6[text()=\"Select Employee\"]")
    WebElement selectEmployeeHeader;
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
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameHints;
    public void enterEmployeeName(String name){
        type(employeeNameHints,name);
        log.info("Enter employee name success");
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement viewButton;
    public String getViewButtonText(){
       String viewButtionText = getElementText(viewButton);
        log.info("click on view button success");
        return viewButtionText;
    }
    @FindBy(xpath = "//p[text()='Timesheet Period']")
    WebElement timeSheetPeriod;
    public String getTimeSheetMessage(){
        String timeSheetPeriodText = getElementText(timeSheetPeriod);
        log.info("Time sheet Period text "+timeSheetPeriodText);
        return timeSheetPeriodText;
    }






}
