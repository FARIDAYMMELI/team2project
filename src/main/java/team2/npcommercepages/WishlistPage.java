package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class WishlistPage extends CommonAPI {

    Logger log = LogManager.getLogger(WishlistPage.class.getName());
    public WishlistPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href=\"/jewelry\"])[1]")
    WebElement clickOnJewelry;

    @FindBy(css =".page-title")
    WebElement jewelryPageTitle;

    @FindBy(xpath = "(//a[@href=\"/vintage-style-engagement-ring\"])[1]")
    WebElement vintageEngagementRing;

    @FindBy(css = "#add-to-wishlist-button-42")
    WebElement addToWishList;

    @FindBy(xpath = "(//a[@href=\"/wishlist\"])[1]")
    WebElement addedToWishList;

    @FindBy(xpath = "//h1[text()=\"Wishlist\"]")
    WebElement wishListPageText;

    public void jewelry(){
        clickOn(clickOnJewelry);
        log.info("user clicks on jewelry");
    }
    public String getTitleOfJewelryPage(){
        String titleOfThePageText = getElementText(jewelryPageTitle);
        log.info("Page title text"+titleOfThePageText);
        return titleOfThePageText;
    }
    public void engagementRing(){
        clickOn(vintageEngagementRing);
        log.info("user clicks on vintage engagement ring");
    }
    public void wishListButton(){
        clickOn(addToWishList);
        log.info("user clicks on add to wish list button");
    }
    public void wishListPage(){
        clickOn(addedToWishList);
        log.info("item is added to wish list");
    }
    public String getTitleOfWishlistPage(){
        String titleOfWishListPage = getElementText(wishListPageText);
        log.info("Page title text is "+ titleOfWishListPage);
        return titleOfWishListPage;
    }



}
