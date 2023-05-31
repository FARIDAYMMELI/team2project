package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class FoodBeverageCategoriesPage extends CommonAPI {

    Logger log = LogManager.getLogger(FoodBeverageCategoriesPage.class.getName());
    public FoodBeverageCategoriesPage(WebDriver driver) { PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Food & Beverage']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Biscuits” to your cart']")
    WebElement addToCartButtonFoodBeverageCategories;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnFoodBeverageCategories;
    public void clickOnAddToCartButtonFoodBeverageCategories() {
        clickOn(addToCartButtonFoodBeverageCategories);
        log.info("add Biscuits to the cart success");}
    public String getHeaderTextFoodBeverageCategoriesPage() {
        String text = getElementText(mainHeader);
        log.info("user in food beverage categories page");
        return text;
    }
    public void clickOnCartButtonOnBeautyCareCategories() {
        clickOn(cartButtonOnFoodBeverageCategories);
        log.info("click on cart button  while in  food beverage categories page  success");

    }

}
