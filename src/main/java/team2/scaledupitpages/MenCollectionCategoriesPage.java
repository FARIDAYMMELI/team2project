package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class MenCollectionCategoriesPage  extends CommonAPI {
    Logger log = LogManager.getLogger(MenCollectionCategoriesPage.class.getName());
    public MenCollectionCategoriesPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Men Collection']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Belt” to your cart']")
    WebElement addToCartButtonMenCollection;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnMenCollection;
    public void clickOnAddToCartButtonMenCollection() {
        clickOn(addToCartButtonMenCollection);
        log.info("add belt  to the cart success");}
    public String getHeaderTextMenCollectionCategoriesPage() {
        String text = getElementText(mainHeader);
        log.info("user in men  collection page");
        return text;}
    public void clickOnCartButtonOnMenCollection() {
        clickOn(cartButtonOnMenCollection);
        log.info("click on cart button  on men collection categories success"); }

}
