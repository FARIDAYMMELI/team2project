package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class ShoesPage  extends CommonAPI {


    Logger log = LogManager.getLogger(ShoesPage.class.getName());

    public ShoesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //objects


    @FindBy(xpath = "//a[contains(@href,'https://automation.scaledupit.com/product/light-shoes/')][normalize-space()='Read More']")
    WebElement ReadMoreLightShoes;


    //reusable methods


    public void ClickOnReadMoreLightShoes() {
        clickOn(ReadMoreLightShoes);
        log.info("click on read more success");
    }
}
