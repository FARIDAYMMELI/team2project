package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class FeaturedCategoriesPage  extends CommonAPI {

    Logger log = LogManager.getLogger(FeaturedCategoriesPage.class.getName());
    public FeaturedCategoriesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Featured']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Woman Collection” to your cart']")
    WebElement addToCartButtonFeatured;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnFeatured;
    public void clickOnAddToCartButtonFeatured() {
        clickOn(addToCartButtonFeatured);
        log.info("add women Collection to the cart success");}
    public String getHeaderTextFeaturedPage() {
        String text = getElementText(mainHeader);
        log.info("user in Featured  page");
        return text;
    }
    public void clickOnCartButtonOnFeatured() {
        clickOn(cartButtonOnFeatured);
        log.info("click on cart button  while in  featured  page  success");

    }

}
