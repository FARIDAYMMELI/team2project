package team2.magentopages;

import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order01Page extends CommonAPI {

    Logger LOG = LogManager.getLogger(Order01Page.class.getName());

    public Order01Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='action print']/span")
    WebElement printOrderButton;

    public void clickOnPrintOrder() {
        clickOn(printOrderButton);
        LOG.info("click on print order button success");
    }
}
