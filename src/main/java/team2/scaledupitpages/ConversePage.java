package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class ConversePage extends CommonAPI {

    Logger log = LogManager.getLogger(ConversePage.class.getName());

    public ConversePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement AddToCartButtonConverse;


    public void clickOnAddToCartButtonConverse() {
        clickOn(AddToCartButtonConverse);
        log.info("click on Converse button success");


    }
}
