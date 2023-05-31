package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class WomenCollectionCategoriesPage  extends CommonAPI {

    Logger log = LogManager.getLogger(WomenCollectionCategoriesPage.class.getName());

    public WomenCollectionCategoriesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Women Collection']")
    WebElement mainHeader;
    @FindBy(xpath = "//a[@aria-label='Add “Converse” to your cart']")
    WebElement addToCartButtonWomenCollection;

    @FindBy(xpath = "//a[@aria-label='Add “Nail Polish” to your cart']")
    WebElement addToCartButtonWomenCollectionNailPolish;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnWomenCollection;
    public void clickOnAddToCartButtonWomenCollection() {
        clickOn(addToCartButtonWomenCollection);
        log.info("add converse shoes to the cart success");}
    public void clickOnAddToCartButtonWomenCollectionNailPolish() {
        clickOn(addToCartButtonWomenCollectionNailPolish);
        log.info("add Nail polish to the cart success");}
    public String getHeaderTextWomenCollectionCategoriesPage() {
        String text = getElementText(mainHeader);
        log.info("user in women collection page");
        return text;}
    public void clickOnCartButtonOnWomenCollection() {
        clickOn(cartButtonOnWomenCollection);
        log.info("click on cart button  on women collection categories success");}

}
