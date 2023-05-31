package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class MusicCategoriesPage  extends CommonAPI {

    Logger log = LogManager.getLogger(MusicCategoriesPage.class.getName());
    public MusicCategoriesPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Music']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Woo Album #1” to your cart']")
    WebElement addToCartButtonMusic;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnMusic;
    public void clickOnAddToCartButtonMusic() {
        clickOn(addToCartButtonMusic);
        log.info("add Woo album #1 to the cart success");}
    public String getHeaderTextMusicPage() {
        String text = getElementText(mainHeader);
        log.info("user in music page");
        return text;}
    public void clickOnCartButtonOnMusic() {
        clickOn(cartButtonOnMusic);
        log.info("click on cart button  on music categories success");
    }

}
