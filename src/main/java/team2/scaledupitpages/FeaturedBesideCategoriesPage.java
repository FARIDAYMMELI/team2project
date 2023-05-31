package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class FeaturedBesideCategoriesPage extends CommonAPI {
    Logger log = LogManager.getLogger(FeaturedBesideCategoriesPage.class.getName());
    public FeaturedBesideCategoriesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Featured Beside']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Bag Collection” to your cart']")
    WebElement addToCartButtonFeaturedBeside;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnFeaturedBeside;
    public void clickOnAddToCartButtonFeaturedBeside() {
        clickOn(addToCartButtonFeaturedBeside);
        log.info("add Bag Collection to the cart success");}
    public String getHeaderTextFeaturedBesidePage() {
        String text = getElementText(mainHeader);
        log.info("user in Featured Beside page");
        return text;
    }
    public void clickOnCartButtonOnFeaturedBeside() {
        clickOn(cartButtonOnFeaturedBeside);
        log.info("click on cart button  while in  featured beside page  success");

    }

}
