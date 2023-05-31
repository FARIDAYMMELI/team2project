package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class ShopPage extends CommonAPI {

    Logger log = LogManager.getLogger(ShopPage.class.getName());
    public ShopPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Shop']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Guitar” to your cart']")
    WebElement addToCartShopButton;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnShopButton;
    public void clickOnAddToCartButtonShop() {
        clickOn(addToCartShopButton);
        log.info("add guitar  to the cart success");}
    public String getHeaderTextShopPage() {
        String text = getElementText(mainHeader);
        log.info("user in shop page");
        return text;}

    public void clickOnCartButtonOnShopButton() {
        clickOn(cartButtonOnShopButton);
        log.info("click on cart button  on shop page success"); }

}

