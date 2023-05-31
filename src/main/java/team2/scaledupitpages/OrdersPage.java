package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class OrdersPage extends CommonAPI {
    Logger log = LogManager.getLogger(OrdersPage.class.getName());
    public OrdersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h1[normalize-space()='Orders']")
    WebElement mainHeaderOrders;
    @FindBy(xpath = "//a[normalize-space()='Browse products']")
    WebElement clickOnBrowseProduct;



    public String getHeaderTextOrderPage() {
        String text = getElementText(mainHeaderOrders);
        log.info("user in orders page success");
        return text;}

    public void setClickOnBrowseProduct() {
        clickOn(clickOnBrowseProduct);
        log.info("click browse product button success");}


}
