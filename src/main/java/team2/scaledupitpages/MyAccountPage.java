package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class MyAccountPage  extends CommonAPI {
    Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement mainHeader;
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
    WebElement logOutButton;
    @FindBy(xpath = "//input[@id='wp-block-search__input-1']")
    WebElement SearchField;
    @FindBy(xpath = "//button[@aria-label='Search']//*[name()='svg']")
    WebElement searchButton;
    @FindBy(xpath = "//span[@class='cart-value cart-customlocation']")
    WebElement cartButton;
    @FindBy(xpath = "//a[normalize-space()='Categories']")
    WebElement hoverOverCategories;
    @FindBy(xpath = "//a[normalize-space()='Categories']")
    WebElement clickOnCategories;
    @FindBy(xpath = "//li[@id='menu-item-300']//a[normalize-space()='Women Collection']")
    WebElement womenCollectionCategories;
    @FindBy(xpath = "//li[@id='menu-item-297']//a[normalize-space()='Men Collection']")
    WebElement menCollectionCategories;
    @FindBy(xpath = "//a[normalize-space()='Music']")
    WebElement musicCategories;
    @FindBy(xpath = "//a[normalize-space()='Posters']")
    WebElement postersCategories;
    @FindBy(xpath = "//a[normalize-space()='Featured Beside']")
    WebElement featuredBesideCategories;
    @FindBy(xpath = "//li[@id='menu-item-305']//a[normalize-space()='Featured']")
    WebElement featuredCategories;
    @FindBy(xpath = "//a[normalize-space()='Clothing']")
    WebElement clothingCategories;
    @FindBy(xpath = "//a[normalize-space()='Shoes']")
    WebElement shoesCategories;
    @FindBy(xpath = "//a[normalize-space()='Sunglass']")
    WebElement sunglassCategories;
    @FindBy(xpath = "//a[normalize-space()='Beauty and Care']")
    WebElement beautyCareCategories;
    @FindBy(xpath = "//a[normalize-space()='Food & Beverage']")
    WebElement foodBeverageCategories;
    @FindBy(xpath = "//li[@id='menu-item-308']//a[normalize-space()='Shop']")
    WebElement ShopButton;
    @FindBy(xpath = "//li[@id='menu-item-282']//a[normalize-space()='Men Collection']")
    WebElement menCollectionNew;
    @FindBy(xpath = "//li[@id='menu-item-281']//a[normalize-space()='Women Collection']")
    WebElement womenCollectionNew;
    @FindBy(xpath = "//li[@id='menu-item-292']//a[normalize-space()='Blog']")
    WebElement blogButton;
    @FindBy(xpath = "//li[@id='menu-item-306']//a[normalize-space()='Home']")
    WebElement homeButton;
    @FindBy(xpath = "//a[normalize-space()='Account details']")
    WebElement accountDetailButton;
    @FindBy(xpath = "//a[normalize-space()='Addresses']")
    WebElement addressButton;
    @FindBy(xpath = "//a[normalize-space()='Orders']")
    WebElement ordersButton;
    @FindBy(xpath = "//a[normalize-space()='Downloads']")
    WebElement downloadButton;

                             /// //reusable methods
    public String getHeaderText() {
        String text = getElementText(mainHeader);
        log.info("user logged in success");
        return text;}

    public void clickOnLogOut() {
        clickOn(logOutButton);
        log.info("click log out button success");}
    public void typeItemToSearch(String item) {
        type(SearchField, item);
        log.info("item name type success");}
    public void clickOnSearchButton() {
        clickOn(searchButton);
        log.info("click search success");}
    public void clickOnCartButton() {
        clickOn(cartButton);
        log.info("click on cart button success");}
    public void clickOnShopButton() {
        clickOn(ShopButton);
        log.info("click on shop Button success");}
    public void clickOnMenCollectionNew() {
        clickOn(menCollectionNew);
        log.info("click on men collection new  button success");}
    public void clickOnWomenMenCollectionNew() {
        clickOn(womenCollectionNew);
        log.info("click on women collection new button success");}
    public void clickOnBlogButton() {
        clickOn(blogButton);
        log.info("click on blog success");}
    public void clickOnHomeButton() {
        clickOn(homeButton);
        log.info("click on home button  success");}
    public void hoverOverCategories(WebDriver driver) {
        waitForElementToBeVisible(driver, 10, hoverOverCategories);
        hoverOver(driver, hoverOverCategories);
        log.info("hover over categories success");}
    public void clickOnCategoryButton() {
        clickOn(clickOnCategories);
        log.info("click on categories success");}
    public void clickOnWomenCollectionCategories() {
        clickOn(womenCollectionCategories);
        log.info("click on women  collection from categories success");}
    public void clickOnMenCollectionCategories() {
        clickOn(menCollectionCategories);
        log.info("click on men collection  from categories success");}
    public void clickOnMusicCategories() {
        clickOn(musicCategories);
        log.info("click music from categories success");}
    public void clickOnPostersCategories() {
        clickOn(postersCategories);
        log.info("click on posters from categories success");}
    public void clickOnFeaturedBesideCategories() {
        clickOn(featuredBesideCategories);
        log.info("click on featured and beside from categories success");}
    public void clickOnFeaturedCategories() {
        clickOn(featuredCategories);
        log.info("click on featured from categories success");}
    public void clickOnClothingCategories() {
        clickOn(clothingCategories);
        log.info("click on clothing from categories success");}
    public void clickOnShoesCategories() {
        clickOn(shoesCategories);
        log.info("click on shoes from categories success");}
    public void clickOnSunglassCategories() {
        clickOn(sunglassCategories);
        log.info("click on sunglass from categories success");}
    public void clickOnBeautyCareCategories() {
        clickOn(beautyCareCategories);
        log.info("click on beauty and care from categories success");}
    public void clickOnFoodBeverageCategories() {
        clickOn(foodBeverageCategories);
        log.info("click on food and beverage from categories  success");}

    public void clickOnAccountDetailButton() {
        clickOn(accountDetailButton);
        log.info("click account detail  success");}

    public void clickOnAddressButton() {
        clickOn(addressButton);
        log.info("click address button success");}

    public void clickOnOrdersButton() {
        clickOn(ordersButton);
        log.info("click orders button success");}

   public void clickOnDownloadButton() {
        clickOn(downloadButton);
        log.info("click download button success");}
        }















































//    @FindBy(xpath = "//a[@class='slicknav_btn slicknav_collapsed']")
//    WebElement slickNavMenuButton;
//
//    @FindBy(xpath = "(//div[@class='slider-desc']/div/div/a)[2]")
//    WebElement BagCollection;
//    @FindBy(xpath = "(//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'])[8]")
//    WebElement addguitar;
//    @FindBy(xpath = "(//a[@class='button wp-element-button product_type_simple add_to_cart_button ajax_add_to_cart'])[12]")
//    WebElement addhoodie;
//    @FindBy(xpath = "(//a[text()='View cart'])[2]")
//    WebElement viewcart;
//    @FindBy(xpath = "//a[text()='View All']")
//    WebElement viewAllButton;
//    //    @FindBy(xpath = "//a[@class='at-wc-icon cart-icon']")
////    WebElement cartButton;
//    @FindBy(xpath = "//a[@class='remove remove_from_cart_button']")
//    WebElement deleteButton;
//
//
//    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']/img)[41]")
//    WebElement guitar;
//    @FindBy(xpath = "//a[text()='New Arrival']")
//    WebElement newarrivalButton;
//
//
//    @FindBy(xpath = "(//a[@class='slider-button primary'])[14]")
//    WebElement  shopNowButton;
//    @FindBy(xpath = "(//i[@class='fa fa-facebook'])[1]")
//    WebElement  faceBookButton;
//    @FindBy(xpath = "(//i[@class='fa fa-instagram'])[1]")
//    WebElement  instagramButton;
//    @FindBy(xpath = "(//i[@class='fa fa-camera-retro'])[1]")
//    WebElement  snapshotButton;
//
//
//
//
//
//
//
//
//    public void clickOnslickNavMenuButton() {
//        clickOn(slickNavMenuButton);
//        LOG.info("click slick Nav Menu Button success");
//    }
//
//
//
//    public void clickOnBagCollection() {
//        clickOn(BagCollection);
//        LOG.info("click on bag collection success");
//
//    }
//
//    public void clickOnAddGuitar() {
//        clickOn(addguitar);
//        LOG.info("click on add guitar success");
//
//    }
//
//    public void clickOnAddHoodie() {
//        clickOn(addhoodie);
//        LOG.info("click on add hoodie success");
//
//    }
//
//    public void clickOnViewCart() {
//        clickOn(viewcart);
//        LOG.info("click on view cart success");
//
//    }
//
//    public void clickOnViewAll() {
//        clickOn(viewAllButton);
//        LOG.info("click on view all success");
//
//    }
//
//
//
//
//    public void clickOnDeleteButton() {
//        clickOn(deleteButton);
//        LOG.info("click on delete success");
//
//    }
//
////    public void clickOnCategoryButton() {
////        clickOn(categoryButton);
////        LOG.info("click on category success");
////
////    }
//
//
//    public void clickOnGuitar() {
//        clickOn(guitar);
//        LOG.info("click on guitar success");
//
//    }
//
//    public void clickOnNewArrivalButton() {
//        clickOn(newarrivalButton);
//        LOG.info("click on new arrival success");
//
//    }
//
//
//
//    public void clickOnShopNowButton() {
//        clickOn(shopNowButton);
//        LOG.info("click on discount Shop success");
//
//    }
//
//    public void clickOnFaceBookButton() {
//        clickOn(faceBookButton);
//        LOG.info("click on facebook success");
//
//    }
//
//    public void clickOnInstagramButton() {
//        clickOn(instagramButton);
//        LOG.info("click on discount Shop success");
//
//    }
//
//    public void clickOnSnapShotButton() {
//        clickOn(snapshotButton);
//        LOG.info("click on discount Shop success");
//
//    }
//
//}
