package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class LightShoesPage extends CommonAPI {


    Logger log = LogManager.getLogger(LightShoesPage.class.getName());

    public LightShoesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement AddToCartButton;



    public void clickOnAddToCartButton() {
        clickOn(AddToCartButton);
        log.info("click on Shirt button success");


    }
}
