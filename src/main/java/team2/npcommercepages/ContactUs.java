package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class ContactUs extends CommonAPI {

    Logger log = LogManager.getLogger(ContactUs.class.getName());

    public ContactUs(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()=\"Contact us\"]")
    WebElement userContact;

    @FindBy(css = ".fullname")
    WebElement userFullName;

    @FindBy(css = ".email")
    WebElement userEmail;

    @FindBy(css = ".enquiry")
    WebElement usersEnquiry;

    @FindBy(css = ".button-1.contact-us-button")
    WebElement userSendsEmail;

    @FindBy(css = ".result")
    WebElement emailSentText;




    public void clickOnContactUs(){
        clickOn(userContact);
        log.info("user contact success");

    }

    public void usersFullName(String fullName){
        type(userFullName, fullName);
        log.info("Full name success");

    }
    public void usersEmail(String email){
        type(userEmail, email);
        log.info("user email success");
    }

    public void enquiry(String enquire){
        type(usersEnquiry, enquire);
        log.info("user enquiry success");

    }

    public void clickOnSubmit(){
        clickOn(userSendsEmail);
        log.info("user submit email success");
    }
    public String getSubmittedEmailMessageText(){
        String emailSubmitText = getElementText(emailSentText);
        log.info("Enquiry text "+ emailSubmitText);
        return emailSubmitText;

    }

}


