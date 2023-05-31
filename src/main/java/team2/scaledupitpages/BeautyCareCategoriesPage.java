package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class BeautyCareCategoriesPage  extends CommonAPI {

    Logger log = LogManager.getLogger(BeautyCareCategoriesPage.class.getName());
    public BeautyCareCategoriesPage(WebDriver driver) { PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Beauty and Care']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Hair Care” to your cart']")
    WebElement addToCartButtonBeautyCareCategories;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnBeautyCareCategories;
    public void clickOnAddToCartButtonBeautyCareCategories() {
        clickOn(addToCartButtonBeautyCareCategories);
        log.info("add hair care to the cart success");}
    public String getHeaderTextBeautyCareCategoriesPage() {
        String text = getElementText(mainHeader);
        log.info("user in Beauty Care categories page");
        return text;
    }
    public void clickOnCartButtonOnBeautyCareCategories() {
        clickOn(cartButtonOnBeautyCareCategories);
        log.info("click on cart button  while in  beauty Care categories page  success");

    }

}
