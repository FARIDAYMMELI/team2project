package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import team2.base.CommonAPI;

public class BillingAddressPage  extends CommonAPI {

    Logger log = LogManager.getLogger(BillingAddressPage.class.getName());
    public BillingAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h3[normalize-space()='Billing address']")
    WebElement mainHeaderBillingAddressPage;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement FirstNameField;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement LastNameField;
    @FindBy(xpath = "//body/div[@id='page']/div[@class='content-wrapper clearfix']/div[@id='content']/div[@id='primary']/div[@class='theiaStickySidebar']/main[@id='main']/article[@id='post-9']/div[@class='entry-content clearfix']/div[@class='woocommerce']/div[@class='woocommerce-MyAccount-content']/form[@method='post']/div[@class='woocommerce-address-fields']/div[@class='woocommerce-address-fields__field-wrapper']/p[@id='billing_country_field']/span[@class='woocommerce-input-wrapper']/span[@class='select2 select2-container select2-container--default']/span[@class='selection']/span[1]")
    WebElement CountryField;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement StreetAddressField;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement CityField;
//    @FindBy(xpath = "//span[@id='select2-billing_state-container']//span[1]")
//    WebElement StateField;
    @FindBy(xpath = "//button[normalize-space()='Save address']")
    WebElement saveButton;



    public String getHeaderText() {
        String text = getElementText(mainHeaderBillingAddressPage);
        log.info("user  billing address page in success");
        return text;}

    public void typeFirstName(String FirstName) {
        type(FirstNameField, FirstName);
        log.info(" firstName type success");}
    public void typeLastName(String LastName) {
        type(LastNameField, LastName);
        log.info(" last name type success");}
    public void typeCountry(String Country) {
        type(CountryField, Country);
        log.info(" country  type success");}
    public void typeStreetAddress(String StreetAddress) {
        type(StreetAddressField, StreetAddress);
        log.info(" street address type success");}
    public void typeCity(String City) {
        type(CityField, City);
        log.info(" city type success");}
//    public void typeState(String State) {
//        type(StateField, State);
//        log.info(" state type success");}

    public void clickOnSaveButton() {
        clickOn(saveButton);
        log.info("click save button success");}


}
