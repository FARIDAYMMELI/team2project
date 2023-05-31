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

    @FindBy(css = ".page-title")
    WebElement jewelryPageTitle;

    @FindBy(xpath = "(//a[@href=\"/vintage-style-engagement-ring\"])[1]")
    WebElement vintageEngagementRing;

    @FindBy(css = "#add-to-wishlist-button-42")
    WebElement addToWishList;

    @FindBy(xpath = "(//a[@href=\"/wishlist\"])[1]")
    WebElement addedToWishList;

    @FindBy(xpath = "//h1[text()=\"Wishlist\"]")
    WebElement wishListPageText;

    public void jewelry() {
        clickOn(clickOnJewelry);
        log.info("user clicks on jewelry");
    }

    @FindBy(css = ".button-2.email-a-friend-wishlist-button")
    WebElement emailAFriend;

    public void emailAFriendButton() {
        clickOn(emailAFriend);
    }

    @FindBy(xpath = "//h1[text()=\"Email your wishlist to a friend\"]")
    WebElement emailAFriendPage;

    public String getTitleOfEmailAFriendPage() {
        String titleOfPage = getElementText(emailAFriendPage);
        log.info("user landed on email a friend page");
        return titleOfPage;
    }

    @FindBy(css = ".friend-email")
    WebElement typeFriendsEmail;

    public void friendsEmail(String email) {
        type(typeFriendsEmail, email);
        log.info("user types in friends email");

    }

    @FindBy(css = ".your-email")
    WebElement usersEmail;

    public void usersOwnEmail(String email) {
        type(usersEmail, email);
        log.info("users types in email");
    }
    @FindBy(css = "#PersonalMessage")
    WebElement personalMessage;

    public void aPersonalMessage(String message){
        type(personalMessage, message);
        log.info("user types a message");





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
