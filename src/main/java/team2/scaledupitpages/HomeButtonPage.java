package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class HomeButtonPage  extends CommonAPI {

    Logger log = LogManager.getLogger(HomeButtonPage.class.getName());
    public HomeButtonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h2[normalize-space()='Onsale Products']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Flying Ninja” to your cart']")
    WebElement addToCartHomeButton;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnHomeButton;
    public void clickOnAddToCartButtonHome() {
        clickOn(addToCartHomeButton);
        log.info("add read laptop  to the in blog page success");}
    public String getHeaderTextHomeButtonPage() {
        String text = getElementText(mainHeader);
        log.info("user in home from button  page");
        return text;}

    public void clickOnCartButtonOnHomeButton() {
        clickOn(cartButtonOnHomeButton);
        log.info("click on cart button  on shop page success"); }

}
