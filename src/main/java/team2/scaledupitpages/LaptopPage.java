package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LaptopPage extends CommonAPI {
    Logger log = LogManager.getLogger(LaptopPage.class.getName());

    public LaptopPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement AddToCartButtonLaptop;

    public void clickOnAddToCartButtonLaptop() {
        clickOn(AddToCartButtonLaptop);
        log.info("click on laptop button success");


    }

}
