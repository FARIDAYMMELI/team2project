package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class AdminPage extends CommonAPI {
    Logger log = LogManager.getLogger(AdminPage.class.getName());
    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //these are for Admin section's +Add button
    @FindBy(xpath = "//span[text()=\"Admin\"]")
    WebElement adminButton;
    @FindBy(xpath = "//h6[text()=\"Admin\"]")
    WebElement adminHeader;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement plusAddButton;
    @FindBy(xpath = "//h6[text()=\"Add User\"]")
    WebElement addUserHeader;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement userRoleDropdown;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    WebElement ESSposition;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement statusDropdown;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNametxtfield;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usernameField;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement passwordField;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;


    //These are for Admin section's Search button
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement searchUsernameField;
    @FindBy(xpath = "((//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement searchUserRoleDropdown;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement searchEmployeeNameField;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement searchStatusDropdwon;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement searchEnabledPositon;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "//span[text()='No Records Found']")
    WebElement invalidRecordFound;


    //these are for adding job titles
    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[2]")
    WebElement jobDropdown;
    @FindBy(xpath = "//a[text()=\"Job Titles\"]")
    WebElement jobTitles;
    @FindBy(xpath = "//h6[text()=\"Job Titles\"]")
    WebElement jobTitleHeader;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement plusAddButtonJobTitles;
    @FindBy(xpath = "//h6[text()=\"Add Job Title\"]")
    WebElement addJobTitleHeader;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement jobTitleField;
    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    WebElement jobDescriptionField;
    @FindBy(xpath = "//textarea[@placeholder='Add note']")
    WebElement addNoteField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addJobSaveButton;


    //-----------------------------------------------------------------------------------------------


    //these are for Admin section's +Add button
    public void clickOnAdminButton(){
        clickOn(adminButton);
        log.info("Click on Admin button success");
    }
    public boolean checkPresenceOfAdminHeader(){
        boolean adminHeaderIsDisplayed = isVisible(adminHeader);
        log.info("Admin Header presence "+adminHeaderIsDisplayed);
        return  adminHeaderIsDisplayed;
    }
    public String getAdminHeader(){
        String text = getElementText(adminHeader);
        log.info("get admin header success");
        return text;
    }
    public void clickOnPlusAddButton(){
        clickOn(plusAddButton);
        log.info("Click on plus add button success");
    }
    public boolean checkPresenceOfAddUserHeader(){
        boolean addUserHeaderIsDisplayed = isVisible(addUserHeader);
        log.info("Add user header presence "+addUserHeaderIsDisplayed);
        return addUserHeaderIsDisplayed;
    }
    public String getAddUserHeader(){
        String text = getElementText(addUserHeader);
        log.info("get add user header success");
        return text;
    }
    public void clickOnUserRoleDropdown(){
        clickOn(userRoleDropdown);
        log.info("Click on user role dropdown success");
    }
    public void clickOnEssPosition(String option){
        selectOptionFromDropdown(ESSposition, option);
        log.info("ESS postion is selected");
    }
    public void clickOnStatusDropdown(){
        clickOn(statusDropdown);
        log.info("click on status dropdown success");
    }
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement Enabledposition;
    public void clickOnEnabledPosition(String option){
        clickOn(Enabledposition);
        log.info("Click on enabled position success");
    }
    public void enterEmployeeNameTextField(String username){
        type(employeeNametxtfield,username);
        waitFor(5);
        employeeNametxtfield.sendKeys(Keys.ARROW_DOWN);
        waitFor(5);
        employeeNametxtfield.sendKeys(Keys.ENTER);
        log.info("enter employee username success");
    }
    public void enterUsernameField(String username){
        type(usernameField,username);
        log.info("Enter username success");
    }
    public void enterPassword(String password){
        type(passwordField,password);
        log.info("enter password success");
    }
    public void enterConfirmPassword(String password){
        type(confirmPasswordField,password);
        log.info("enter confirm password success");
    }
    public void clickOnSaveButton(){
        clickOn(saveButton);
        log.info("Click on save button success");
    }


    //These are for Admin section's Search button
    public void enterUsername(String username){
        type(searchUsernameField,username);
        log.info("enter username success");
    }
    public void clickOnSearchUserRoleDropdown(){
        clickOn(searchUserRoleDropdown);
        log.info("click on user role dropdown success");
    }
    @FindBy(xpath = "(//div[@tabindex='0'])[1]")
    WebElement searchESSposition;
    public void clickOnSearchESSposition(){
        clickOn(searchESSposition);
        log.info("Click on ESS position success");
    }
    public void enterEmployeeName(String name){
        type(searchEmployeeNameField,name);
        log.info("Enter name success");
    }

    public void clickOnSearchEnabledPosition(){
        clickOn(searchEnabledPositon);
        log.info("Click on Enabled position success");
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
        log.info("Click on search button success");
    }
    public String invalidMessage(){
        String noRecordFoundText = getElementText(invalidRecordFound);
        waitFor(3);
        log.info("Invalid Record found text "+noRecordFoundText);
        return noRecordFoundText;
    }


    //these are for adding job titles
    public void clickOnJobDropdown(){
        clickOn(jobDropdown);
        log.info("Click on dropdown success");
    }
    public void clickOnJobTitles(){
        clickOn(jobTitles);
        log.info("Click on job titles success");
    }
    public boolean checkPresenceOfJobTitleHeader(){
        boolean jobTitleHeaderIsDisplayed = isVisible(jobTitleHeader);
        log.info("Job title header presence "+jobTitleHeaderIsDisplayed);
        return jobTitleHeaderIsDisplayed;
    }
    public String getJobTitleHeaderText(){
        String jobTitleHeaderText = getElementText(jobTitleHeader);
        log.info("Job title header "+jobTitleHeaderText);
        return jobTitleHeaderText;
    }
    public void clickOnAddButton(){
        clickOn(plusAddButtonJobTitles);
        log.info("Click on add button success");
    }
    public boolean checkPresenceOfAddJobTitleHeader(){
        boolean addJobTitleHeaderIsDisplayed = isVisible(addJobTitleHeader);
        log.info("Job title header presence "+addJobTitleHeaderIsDisplayed);
        return addJobTitleHeaderIsDisplayed;
    }
    public String getAddJobTitleHeaderText(){
        String jobTitleHeaderText = getElementText(addJobTitleHeader);
        log.info("Job title header "+jobTitleHeaderText);
        return jobTitleHeaderText;
    }
    public void enterJobTitle(String jobTitle){
        type(jobTitleField,jobTitle);
        log.info("job title enter success");
    }
    public void enterJobDescription(String jobDescription){
        type(jobDescriptionField,jobDescription);
        log.info("enter job description success");
    }
    public void enterAddNote(String addNote){
        type(addNoteField,addNote);
        log.info("enter add note success");
    }
    public void clickOnJobSaveButton(){
        clickOn(addJobSaveButton);
        log.info("click on save button success");
    }


}
