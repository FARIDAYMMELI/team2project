package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class SunglassCategoriesPage extends CommonAPI {

    Logger log = LogManager.getLogger(SunglassCategoriesPage.class.getName());
    public SunglassCategoriesPage(WebDriver driver) { PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Sunglass']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Mountain Glass” to your cart']")
    WebElement addToCartButtonSunglassCategories;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnSunglassCategories;
    public void clickOnAddToCartButtonSunglassCategories() {
        clickOn(addToCartButtonSunglassCategories);
        log.info("add mountain glass  to the cart success");}
    public String getHeaderTextSunglassCategoriesPage() {
        String text = getElementText(mainHeader);
        log.info("user in sunglass categories page");
        return text;
    }
    public void clickOnCartButtonOnSunglassCategories() {
        clickOn(cartButtonOnSunglassCategories);
        log.info("click on cart button  while in  sunglass categories page  success");

    }

}
