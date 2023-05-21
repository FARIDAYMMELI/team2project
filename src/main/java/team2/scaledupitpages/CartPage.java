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

    @FindBy(xpath = "//a[normalize-space()='×']")
    WebElement deleteButton;
    @FindBy(xpath = "//button[normalize-space()='Apply coupon']")
    WebElement couponButton;
    @FindBy(xpath = "//input[@id='coupon_code']")
    WebElement codeField;
    @FindBy(xpath = "//li[normalize-space()='Coupon \"farida\" does not exist!']")
    WebElement ErrorMessageCoupon;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement ErrorMessageRemove;
    @FindBy(xpath = "//p[@class='cart-empty woocommerce-info']")
    WebElement ErrorMessageEmpty;

    //reusable methods
    public void HoverOverLightShoes(){
        clickOn(HoverOverLightShoes);
        log.info("click on Shirt button success");
    }
    public void clickOnDeleteButton() {
        clickOn(deleteButton);
        log.info("click on delete success");

    }
    public void typeCoupon(String code) {
        type(codeField, code);
        log.info("code number  type success");
    }
    public void clickOnCouponButton() {
        clickOn(couponButton);
        log.info("click on Coupon success");

    }

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
