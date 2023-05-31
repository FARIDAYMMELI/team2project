package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class HomePage extends CommonAPI {

    Logger log = LogManager.getLogger(HomePage.class.getName());
    //locators
    @FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement homepageMainHeader;
    @FindBy(css = ".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")
    WebElement logoutDropdownArrow;
    @FindBy(xpath = "//a[text()=\"Logout\"]")
    WebElement logoutButton;
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminButton;

    //18 Test the Search Button in the Magnifying Icon
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminSection;


    //20 Test Change Password in the User's Dropdown
    @FindBy(xpath = "//a[text()='Change Password']")
    WebElement changePasswordOption;
    @FindBy(xpath = "//h6[text()='Update Password']")
    WebElement updatePasswordPageHeader;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement currentPasswordField;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement passwordField;
    @FindBy(xpath = "(//input[@type='password'])[3]")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;
    @FindBy(xpath = "//h6[text()='PIM']")
    WebElement pimValidation;




    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //resuable methods
    public String getHomePageHeaderText() {
        String text = getElementText(homepageMainHeader);
        log.info("user logged in success");
        return text;
    }

    public void clickDropdownArrow() {
        clickOn(logoutDropdownArrow);
        log.info("click on dropdown arrow success");
    }

    public void clickLogoutButton() {
        clickOn(logoutButton);
        log.info("click on logout link success");
    }

    public void clickAdminButton() {
        clickOn(adminButton);
        log.info("click on admin button succes");
    }


    //18 Test the Search Button in the Magnifying Icon
    public void enterInMagnifyingSearchBox(String text){
        type(searchBox,text);
        log.info("enter in magnifying search box success");
    }
    public void clickOnAdmin(){
        hoverOverAndClickOn(adminSection);
        log.info("Click on admin from search box success");
    }



    //20 Test Change Password in the User's Dropdown
    public void clickOnChangePasswordOption(){
        clickOn(changePasswordOption);
        log.info("Click on change password option success");
    }
    public boolean checkPresenceOfPageHeader(){
        boolean pageHeaderIsDisplayed = isVisible(updatePasswordPageHeader);
        log.info("password page header presence "+pageHeaderIsDisplayed);
        return pageHeaderIsDisplayed;
    }
    public String getPageHeaderText(){
        String pageHeaderText = getElementText(updatePasswordPageHeader);
        log.info("Page header text is "+pageHeaderText);
        return pageHeaderText;
    }
    public void enterCurrentPassword(String password){
        type(currentPasswordField,password);
        log.info("enter current password success");
    }
    public void enterNewPassword(String newPassword){
        type(passwordField,newPassword);
        log.info("enter new password success");
    }
    public void enterConfirmPassword(String confirmPassword){
        type(confirmPasswordField,confirmPassword);
        log.info("enter confirm password success");
    }
    public void clickOnSaveButton(){
        clickOn(saveButton);
        log.info("Click on save button success");
    }
    public String getPIMmessage(){
        String pimText = getElementText(pimValidation);
        log.info("PIM text "+pimText);
        return pimText;
    }






}
