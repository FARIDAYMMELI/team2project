package team2.magentopages;

import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SearchPage.class.getName());

    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Voyage Yoga Bag']")
    WebElement VoyageYogaBag;
    @FindBy(xpath = "//img[@alt='Typhon Performance Fleece-lined Jacket']")
    WebElement TyphonPerformanceFleecelinedJacket;
    @FindBy(xpath = "(//a[@class='action towishlist'])[5]")
    WebElement AddToWishList;


    public void clickOnVoyageYogaBag(){
        clickOn(VoyageYogaBag);
        LOG.info("click VoyageYogaBag success");
    }
    // git
    public void hoverOverTyphonPerformanceFleecelinedJacket(WebDriver driver){
        waitForElementToBeVisible(driver, 10, TyphonPerformanceFleecelinedJacket);
        hoverOver(driver,TyphonPerformanceFleecelinedJacket);
        LOG.info("hover over Typhon Performance Fleece lined Jacket success");
    }
    public void clickOnAddToWishList(){
        clickOn(AddToWishList);
        LOG.info("click WayfarerMessengerBag success");
    }
}
