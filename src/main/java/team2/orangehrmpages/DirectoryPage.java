package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class DirectoryPage extends CommonAPI {
    Logger log = LogManager.getLogger(DirectoryPage.class.getName());
    public DirectoryPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //tc-21 After logged in Test the Directory button section
    @FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[8]")
    WebElement directoryButton;
    public void clickOnDirectoryButton(){
        clickOn(directoryButton);
        log.info("Click on Directory button success");
    }

    @FindBy(xpath = "//h6[text()='Directory']")
    WebElement directoryPageHeader;
    public boolean checkPresencePageHeader(){
        boolean pageHeaderIsDisplayed = isVisible(directoryPageHeader);
        log.info("Director Page header presence "+pageHeaderIsDisplayed);
        return pageHeaderIsDisplayed;
    }
    public String getPageHeaderText(){
        String pageHeaderText = getElementText(directoryPageHeader);
        log.info("Page header text "+pageHeaderText);
        return pageHeaderText;
    }


    //tc-22 Testing the Searching button in the Directory button
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;
    public void enterEmployeeName(String name){
        type(employeeNameField, name);
        log.info("Enter employee name success");
    }

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement jobTitleDropdown;
    public void clickOnJobTitleDropdown(){
        clickOn(jobTitleDropdown);
        log.info("Click on Job Title dropdown success");
    }

    @FindBy(xpath = "//div[text()='QA Lead']")
    WebElement qaLeadFromDropdown;
    public void selectQALeadFromDropdown(String qa){
        selectOptionFromDropdown(qaLeadFromDropdown,qa);
        log.info("Click on QA Lead from dropdown success");
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement locationDropdown;
    public void clickOnLocationDropdwon(){
        clickOn(locationDropdown);
        log.info("Click on Location dropdown success");
    }
    @FindBy(xpath = "//div[text()='New York Sales Office']")
    WebElement NewYorkSalesOfficeFromDropdown;
    public void clickOnNewYorkSalesOffice(){
        clickOn(NewYorkSalesOfficeFromDropdown);
        log.info("Click on New York Sales Office from dropdown success");
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    public void clickOnSearchButton(){
        clickOn(searchButton);
        log.info("Click on Search button success");
    }

    //tc-23 Testing the Reset button in the Directory button
    @FindBy(xpath = "//button[@type='reset']")
    WebElement resetButton;
    public void clickOnResetButton(){
        clickOn(resetButton);
        log.info("Click on Reset button success");
    }

    @FindBy(xpath = "//h5[text()='Directory']")
    WebElement directorySubHeader;
    public boolean checkPresenceOfDirectorySubHeader(){
        boolean directorySubHeaderIsDisplayed = isVisible(directorySubHeader);
        log.info("Directory sub header presence "+directorySubHeaderIsDisplayed);
        return directorySubHeaderIsDisplayed;
    }
    public String getDirectorySubHeaderText(){
        String directorySubHeaderText = getElementText(directorySubHeader);
        log.info("Directory sub header text "+directorySubHeaderText);
        return directorySubHeaderText;
    }









}
