package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class DownloadsPage  extends CommonAPI {
    Logger log = LogManager.getLogger(DownloadsPage.class.getName());
    public DownloadsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h1[normalize-space()='Downloads']")
    WebElement mainHeaderDownloads;
    @FindBy(xpath = "//a[normalize-space()='Browse products']")
    WebElement clickOnBrowseProduct;



    public String getHeaderTextDownloadsPage() {
        String text = getElementText(mainHeaderDownloads);
        log.info("user in downloads page success");
        return text;}

    public void setClickOnBrowseProduct() {
        clickOn(clickOnBrowseProduct);
        log.info("click browse product button success");}


}


