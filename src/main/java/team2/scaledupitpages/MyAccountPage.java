package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class MyAccountPage  extends CommonAPI{

    Logger LOG = LogManager.getLogger(MyAccountPage.class.getName());
    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement mainHeader;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
    WebElement logOutButton;

    @FindBy(xpath = "//input[@id='wp-block-search__input-1']")

    WebElement SearchField;
    @FindBy(xpath = "//button[@aria-label='Search']//*[name()='svg']")
    WebElement searchButton;
    @FindBy(xpath = "//span[@class='cart-value cart-customlocation']")
    WebElement cartButton;

    //reusable methods
    public  String getHeaderText(){
        String text = getElementText(mainHeader);
        LOG.info("user logged in success");
        return text;
    }

    public void clickOnLogOut(){

        clickOn(logOutButton);
        LOG.info("click log out button success");
    }
    public void typeItemToSearch(String item) {
        type(SearchField, item);
        LOG.info("item name type success");
    }
    public void clickOnSearchButton() {
        clickOn(searchButton);
        LOG.info("click search success");
    }
    public void clickOnCartButton() {
        clickOn(cartButton);
        LOG.info("click on shop Button success");

    }
}
