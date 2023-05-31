package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class AccountDetailPage extends CommonAPI {


    Logger log = LogManager.getLogger(AccountDetailPage.class.getName());
    public AccountDetailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h1[normalize-space()='Account details']")
    WebElement mainHeaderAccountDetail;
    @FindBy(xpath = "//button[normalize-space()='Save changes']")
    WebElement clickOnSaveChanges;
    @FindBy(xpath = "//input[@id='account_first_name']")
    WebElement FirstNameField;
    @FindBy(xpath = "//input[@id='account_last_name']")
    WebElement LastNameField;


    public String getHeaderText() {
        String text = getElementText(mainHeaderAccountDetail);
        log.info("user in Account detail page success");
        return text;}

    public void clickOnSaveChanges() {
        clickOn(clickOnSaveChanges);
        log.info("click save changes button success");}
    public void typeItemFirstName(String FirstName) {
        type(FirstNameField, FirstName);
        log.info("first name  type success");}
    public void typeItemLastName(String LastName) {
        type(LastNameField, LastName);
        log.info("last  name  type success");}

}
