package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class AddressPage extends CommonAPI {

    Logger log = LogManager.getLogger(AddressPage.class.getName());
    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Addresses']")
    WebElement mainHeaderAddressPage;
    @FindBy(xpath = "//a[@href='https://automation.scaledupit.com/my-account/edit-address/billing/']")
    WebElement billingAddressButton;
    @FindBy(xpath = "//a[@href='https://automation.scaledupit.com/my-account/edit-address/shipping/']")
    WebElement shippingAddressButton;



    public String getHeaderText() {
        String text = getElementText(mainHeaderAddressPage);
        log.info("user address page in success");
        return text;}
    public void clickOnBillingAddress() {
        clickOn(billingAddressButton);
        log.info("click billing Address success");}

    public void clickOnShippingAddress() {
        clickOn(shippingAddressButton);
        log.info("click shipping Address success");}
}
