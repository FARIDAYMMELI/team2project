package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class PostersCategoriesPage extends CommonAPI {

    Logger log = LogManager.getLogger(PostersCategoriesPage.class.getName());
    public PostersCategoriesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Posters']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Flying Ninja” to your cart']")
    WebElement addToCartButtonPosters;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnPosters;
    public void clickOnAddToCartButtonPosters() {
        clickOn(addToCartButtonPosters);
        log.info("add flying ninja to the cart success");}
    public String getHeaderTextPostersPage() {
        String text = getElementText(mainHeader);
        log.info("user in posters page");
        return text;
    }
    public void clickOnCartButtonOnPosters() {
        clickOn(cartButtonOnPosters);
        log.info("click on cart button  while in  posters  page  success");

    }

}
