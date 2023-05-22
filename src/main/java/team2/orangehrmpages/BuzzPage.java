package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class BuzzPage extends CommonAPI {
    Logger log = LogManager.getLogger(BuzzPage.class.getName());
    public BuzzPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = ".oxd-main-menu-item.active")
    WebElement buzzButton;
    @FindBy(xpath = "//h6[text()='Buzz']")
    WebElement buzzPageHeader;
    @FindBy(xpath = "//textarea[@placeholder=\"What's on your mind?\"]")
    WebElement whatsOnYourMindBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement postButton;
    @FindBy(xpath = "//p[text()='Buzz Newsfeed']")
    WebElement pageMessage;

    //-----------------------------------------------------------------------------

    public void clickOnBuzzSection() {
        clickOn(buzzButton);
        log.info("Click on buzz success");
    }

    public boolean checkPresenceOfBuzzPageHeader() {
        boolean buzzPageHeaderIsDisplayed = isVisible(buzzPageHeader);
        log.info("buzz page header presence " + buzzPageHeaderIsDisplayed);
        return buzzPageHeaderIsDisplayed;
    }

    public String getBuzzPageHeaderText() {
        String buzzPageHeaderText = getElementText(buzzPageHeader);
        log.info("buzz page header text is " + buzzPageHeaderText);
        return buzzPageHeaderText;
    }

    public void enterWhatsOnYourMind(String text) {
        type(whatsOnYourMindBox, text);
        log.info("enter in whats on your mind box success");
    }

    public void clickOnPostButton() {
        clickOn(postButton);
        log.info("Click on post button success");
    }
    public boolean checkPresenceOfPageMessage(){
        boolean pageMessageIsDisplayed = isVisible(pageMessage);
        log.info("Page message presence "+pageMessageIsDisplayed);
        return pageMessageIsDisplayed;
    }
    public String getPageMessage(){
        String pageMessageText = getElementText(pageMessage);
        log.info("Page message text "+pageMessageText);
        return pageMessageText;
    }




}