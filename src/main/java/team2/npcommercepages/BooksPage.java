package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class BooksPage extends CommonAPI {
    Logger log = LogManager.getLogger(BooksPage.class.getName());

    public BooksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement userBooks;

    @FindBy(xpath = "(//a[@href=\"/fahrenheit-451-by-ray-bradbury\"])[1]")
    WebElement clickOnFahrenheitBook;

    @FindBy(css = "#add-to-cart-button-37")
    WebElement userAddToCart;

    @FindBy(xpath = "//h1[text()=\"Shopping cart\"]")
    WebElement shoppingCartTitle;

    public void clickOnBooks() {
        clickOn(userBooks);
        log.info("click on books");
    }

    public void fahrenheitBook(){
        clickOn(clickOnFahrenheitBook);
        log.info("user clicks on fahrenheit book");

    }
    public void clickOnAddToCart(){
        clickOn(userAddToCart);
        log.info("User clicks on adds to cart");
    }
    @FindBy(xpath = "(//a[@href=\"/cart\"])[1]")
    WebElement shoppingCart;
    public void shoppingCartButton(){
        clickOn(shoppingCart);
        log.info("user clicks on shopping cart button");
    }
    public String getShoppingCartPageTitle(){
        String shoppingCartText = getElementText(shoppingCartTitle);
        log.info("shopping cart title is "+shoppingCartText);
        return shoppingCartText;
    }
    @FindBy(xpath = "//a[@title=\"Home\"]")
    WebElement homeButton;

    public void bookPageHomeButton(){
        clickOn(homeButton);
        log.info("user clicks on home button in books page");
    }
    @FindBy(xpath = "//h2[text()=\"Welcome to our store\"]")
    WebElement homePageWelcome;

    public String getHomePageWelcomeTitle() {
        String homePageTitle = getElementText(homePageWelcome);
        return homePageTitle;
    }

    }
