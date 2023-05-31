package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class DigitalDownloadsPage extends CommonAPI {

    Logger log = LogManager.getLogger(BooksPage.class.getName());

    public DigitalDownloadsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href=\"/digital-downloads\"])[1]")
    WebElement digitalDownloadsButton;

    @FindBy(xpath = "//h1[text()=\"Digital downloads\"]")
    WebElement getPageTitle;
    public void digitalDownloads() {
        clickOn(digitalDownloadsButton);
        log.info("user clicks on digital downloads button");
    }

    public String getTitleOfDigitalPage(){
        String digitalTitle = getElementText(getPageTitle);
        log.info("digital page title validation success");
        return digitalTitle;
        }

        @FindBy(xpath = "(//span[@class=\"price actual-price\"])[1]")
        WebElement price;

    public void priceTag(){
        isVisible(price);
        log.info("user can see the price of item");
    }
    @FindBy(xpath= "//strong[text()=\"Categories\"]")
    WebElement categoriesList;


    public String categoriesOption(){
        String categories= getElementText(categoriesList);
        log.info("user can see categories on the left side of page.");
        return categories;
    }


        }


//    public String getShoppingCartPageTitle(){
//        String shoppingCartText = getElementText(shoppingCartTitle);
//        log.info("shopping cart title is "+shoppingCartText);
//        return shoppingCartText;