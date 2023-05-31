package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class RemoveItem extends CommonAPI {

    Logger log = LogManager.getLogger(RemoveItem.class.getName());

    public RemoveItem(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelry;
    //a[@href="/jewelry"])[1]
    @FindBy(xpath = "//h1[text()=\"Jewelry\"]")
    WebElement jeweleryPageTitle;

    @FindBy(xpath = "(//a[@href=\"/flower-girl-bracelet\"])[1]")
    WebElement clickOnFlowerGirlBracelet;

    @FindBy(css = "#add-to-cart-button-41")
    WebElement clickOnAddToCart;

    @FindBy(xpath = "(//a[@href=\"/cart\"])[1]")
    WebElement clickOnShoppingCart;

    @FindBy(css = ".remove-btn")
    WebElement clickOnRemoveButton;

    @FindBy(css = ".order-summary-content")
    WebElement shoppingCartEmpty;

    public void clickOnJewelry() {
        clickOn(jewelry);
        log.info(" Click On jewelry Link successfully.");
    }
    public String jeweleryPageHeader(){
        String text = getElementText(jeweleryPageTitle);
        log.info("jewelery page title is present");
        return text;
    }

    public void flowerGirlBracelet(){
        clickOn(clickOnFlowerGirlBracelet);
        log.info("user clicked on flower girl bracelet");
    }
    public void addToCart(){
        clickOn(clickOnAddToCart);
        log.info("user clicked on add to cart button");
    }
    public void shoppingCart(){
        clickOn(clickOnShoppingCart);
        log.info("user clicks on add to cart button");
    }
    public void removeButton(){
        clickOn(clickOnRemoveButton);
        log.info("user clicks on remove");
    }
    public String getEmptyCartMessage(){
        String text = getElementText(shoppingCartEmpty);
        log.info("get shopping cart empty message success");
        return text;

    }




}
