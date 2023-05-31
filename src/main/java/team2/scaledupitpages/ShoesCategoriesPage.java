package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class ShoesCategoriesPage extends CommonAPI {

    Logger log = LogManager.getLogger(ShoesCategoriesPage.class.getName());
    public ShoesCategoriesPage(WebDriver driver) { PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Shoes']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Black Shoe” to your cart']")
    WebElement addToCartButtonShoesCategories;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnShoesCategories;
    public void clickOnAddToCartButtonShoesCategories() {
        clickOn(addToCartButtonShoesCategories);
        log.info("add black shoe to the cart success");}
    public String getHeaderTextShoesCategoriesPage() {
        String text = getElementText(mainHeader);
        log.info("user in shoes categories page");
        return text;
    }
    public void clickOnCartButtonOnShoesCategories() {
        clickOn(cartButtonOnShoesCategories);
        log.info("click on cart button  while in  shoes categories page  success");

    }

}
