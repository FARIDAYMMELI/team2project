package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class GiftCard extends CommonAPI {

    Logger log = LogManager.getLogger(GiftCard.class.getName());
    public GiftCard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href=\"/gift-cards\"])[1]")
    WebElement giftCardButton;

    @FindBy(xpath = "(//a[@href=\"/25-virtual-gift-card\"])[1]")
    WebElement twentyFiveDollarGiftCard;

    @FindBy(css = ".recipient-name")
    WebElement addRecipientName;

    @FindBy(css = ".recipient-email")
    WebElement addRecipientsEmail;

    @FindBy(css = ".sender-name")
    WebElement addUserName;

    @FindBy(css = ".sender-email")
    WebElement usersEmail;

    @FindBy(css = "#giftcard_43_Message")
    WebElement userTypesAMessage;

    @FindBy(css = "#add-to-cart-button-43")
    WebElement userAddsToCart;

    @FindBy(xpath ="(//a[@href=\"/cart\"])[1]")
    WebElement shoppingCart;

    @FindBy(css = ".sku-number")
    WebElement giftCardInCart;

    public void giftCard(){
        clickOn(giftCardButton);
        log.info("user clicks on gift card button");
    }
    public void giftCardAmount(){
        clickOn(twentyFiveDollarGiftCard);
        log.info("user clicks on 25$ gift card");
    }
    public void friendsName(String name){
        type(addRecipientName, name);
        log.info("user types in friends name");
    }
    public void friendEmail(String email){
        type(addRecipientsEmail, email);
        log.info("user types in friends email");
    }
    public void userName(String userName){
        type(addUserName, userName);
        log.info("user types in user name");
    }
    public void userEmail(String userEmail){
        type(usersEmail, userEmail);
        log.info("user types in email");
    }
    public void message(String aMessage){
        type(userTypesAMessage, aMessage);
        log.info("user types in a message");
    }
    public void addToCart(){
        clickOn(userAddsToCart);
        log.info("user clicks on add to cart button");
    }
    public void cart(){
        clickOn(shoppingCart);
        log.info("user clicks on shopping cart");
    }
    public String shoppingCartPage(){
        String shoppingCartText = getElementText(giftCardInCart);
        log.info("shopping card page");
        return shoppingCartText;
    }
}
