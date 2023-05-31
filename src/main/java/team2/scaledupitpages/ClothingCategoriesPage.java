package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class ClothingCategoriesPage  extends CommonAPI {

    Logger log = LogManager.getLogger(ClothingCategoriesPage.class.getName());
    public ClothingCategoriesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Clothing']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Happy Ninja” to your cart']")
    WebElement addToCartButtonClothing;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnClothing;
    public void clickOnAddToCartButtonClothing() {
        clickOn(addToCartButtonClothing);
        log.info("add happy ninja to the cart success");}
    public String getHeaderTextClothingPage() {
        String text = getElementText(mainHeader);
        log.info("user in clothing page");
        return text;
    }
    public void clickOnCartButtonOnClothing() {
        clickOn(cartButtonOnClothing);
        log.info("click on cart button  while in  clothing page  success");

    }

}
