package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class CartPage extends CommonAPI {

    Logger log = LogManager.getLogger(CartPage.class.getName());

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //objects

    @FindBy(xpath = "//a[contains(text(),'Light Shoes')]")
    WebElement HoverOverLightShoes;
    @FindBy(xpath = "//a[normalize-space()='Converse']")
    WebElement HoverOverConverse;
    @FindBy(xpath = "//a[normalize-space()='Belt']")
    WebElement HoverOverBelt;
    @FindBy(xpath = "//a[normalize-space()='Woo Album #1']")
    WebElement HoverOverWooAlbum;
    @FindBy(xpath = "//a[normalize-space()='Flying Ninja']")
    WebElement HoverOverFlyingNinja;

    @FindBy(xpath = "//a[normalize-space()='Bag Collection']")
    WebElement HoverOverBagCollection;

    @FindBy(xpath = "//a[normalize-space()='Woman Collection']")
    WebElement HoverOverWomenCollectionItem;
    @FindBy(xpath = "//a[normalize-space()='Happy Ninja']")
    WebElement HoverOverHappyNinja;

    @FindBy(xpath = "//a[normalize-space()='Black Shoe']")
    WebElement HoverOverBlackShoes;
    @FindBy(xpath = "//a[normalize-space()='Mountain Glass']")
    WebElement HoverOverMountainGlass;
    @FindBy(xpath = "//a[normalize-space()='Hair Care']")
    WebElement HoverOverHairCare;
    @FindBy(xpath = "//a[normalize-space()='Biscuits']")
    WebElement HoverOverBiscuits;
    @FindBy(xpath = "//a[contains(text(),'Guitar')]")
    WebElement HoverOverGuitar;
    @FindBy(xpath = "//a[normalize-space()='Nail Polish']")
    WebElement HoverOverNailPolish;
    @FindBy(xpath = "//a[normalize-space()='Nail Polish']")
    WebElement HoverOverLaptop;






    @FindBy(xpath = "//a[normalize-space()='×']")
    WebElement deleteButton;
    @FindBy(xpath ="//button[normalize-space()='Apply coupon']")

    WebElement couponButtonApply;
    @FindBy(xpath = "//input[@id='coupon_code']")
    WebElement couponField;
    @FindBy(xpath = "//input[@id='coupon_code']")
    WebElement couponFieldClick;
    @FindBy(xpath = "//li[normalize-space()='Coupon \"farida\" does not exist!']")
    WebElement ErrorMessageCoupon;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement ErrorMessageRemove;
    @FindBy(xpath = "//p[@class='cart-empty woocommerce-info']")
    WebElement ErrorMessageEmpty;
    //reusable methods
    public void HoverOverLightShoes(){
        clickOn(HoverOverLightShoes);
        log.info("lightshoes selected  successfully appear in the cart");
    }
    public void HoverOverBelt(){
        clickOn(HoverOverBelt);
        log.info("belt  selected  successfully from men collection from categories");
    }
    public void HoverOverConverse(){
        clickOn(HoverOverConverse);
        log.info("converse shoes selected  successfully from women collection from categories");
    }
    public void HoverOverWooAlbum(){
        clickOn(HoverOverWooAlbum);
        log.info("Woo album  selected  successfully from Music section  from categories");
    }
    public void HoverOverFlyingNinja(){
        clickOn(HoverOverFlyingNinja);
        log.info("Flying ninja is  selected  successfully from posters section  from categories");
    }
    public void HoverOverBagCollection(){
        clickOn(HoverOverBagCollection);
        log.info("Bag collection  is  selected  successfully from featured beside  section  from categories");
    }
    public void HoverOverWomenCollectionItem(){
        clickOn(HoverOverWomenCollectionItem);
        log.info("women collection item  is  selected  successfully from featured   section  from categories");
    }

    public void HoverOverHappyNinja(){
        clickOn(HoverOverHappyNinja);
        log.info("Happy ninja is selected  is  selected  successfully from clothing   section  from categories");
    }
    public void HoverOverBlackShoes(){
        clickOn(HoverOverBlackShoes);
        log.info("black shoes is selected  is  selected  successfully from shoes categories  section  from categories");
    }
    public void HoverOverMountainGlass(){
        clickOn(HoverOverMountainGlass);
        log.info("mountain glass  is selected  is  selected  successfully from sunglass categories  section  from categories");
    }
    public void HoverOverHairCare(){
        clickOn(HoverOverHairCare);
        log.info("Hair care   is selected  is  selected  successfully from beauty care  from categories");
    }
    public void HoverOverBiscuits(){
        clickOn(HoverOverBiscuits);
        log.info("Biscuits   is selected  is  selected  successfully from food and beverage  from categories");
    }
    public void HoverOverGuitar(){
        clickOn(HoverOverGuitar);
        log.info("Guitar   is selected successfully from shop button");
    }
    public void HoverOverNailPolish(){
        clickOn(HoverOverLaptop);
        log.info("laptop is selected successfully from blog button");
    }
    public void HoverOverLaptop(){
        clickOn(HoverOverNailPolish);
        log.info("nail polish  is selected successfully from shop button");
    }

    public void clickOnDeleteButton() {
        clickOn(deleteButton);
        log.info("click on delete success");}
    public void typeCoupon(String code) {
        type(couponField, code);
        log.info("code number  type success");}
    public void clickOnCouponField() {
        clickOn(couponFieldClick);
        log.info("click on Coupon field success");}
    public void clickOnCouponButton() {
        clickOn(couponButtonApply);
        log.info("click on Coupon success");}

    public String getErrorMessageCoupon(){
        log.info("error coupon message success");
        return getElementText(ErrorMessageCoupon);

    }
    public String getErrorMessageRemove(){
        log.info("error remove message success");
        return getElementText(ErrorMessageRemove);


    }
    public String getErrorMessageEmpty(){
        log.info("error empty message success");
        return getElementText(ErrorMessageEmpty);


    }
}
