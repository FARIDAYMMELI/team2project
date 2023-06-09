package team2.magentopages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;

public class HomePage extends CommonAPI {
        Logger log = LogManager.getLogger(HomePage.class.getName());

        public HomePage(WebDriver driver) {PageFactory.initElements(driver,this);}

        @FindBy(xpath = "//input[@id='search']")
        WebElement searchField;
        @FindBy(xpath = "//button[@class='action search']")
        WebElement searchButton;
        @FindBy (css = "div[class='panel header'] li[data-label='or'] a")
        WebElement signinButton;

        @FindBy(xpath = "//span[text()='Welcome, thonmoy bhattacharjee!']")
        WebElement headerText;
        @FindBy(css= "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li:nth-child(3) > a")
        WebElement createAccountButton1;



        @FindBy(xpath = "//a[@class='action showcart']")
        WebElement cartButton;
        @FindBy(xpath = "//span[text()='Gear']")
        WebElement gearFloatingMenu;
        @FindBy(xpath = "//span[text()='Fitness Equipment']")
        WebElement fitnessEquipment;
        @FindBy (xpath = "//span[text()='Sale']")
        WebElement saleButton;
        @FindBy (xpath = "//a[@class='action compare']")
        WebElement compareProductsButton;
        @FindBy (xpath = "(//button[@class='action switch'])[1]")
        WebElement DropDown;
        @FindBy (xpath = "//li[@class='authorization-link']/a")
        WebElement SignOut;
        @FindBy (xpath = "//span[text()='Women']")
        WebElement womenProducts;
        @FindBy (xpath = "//span[text()='Shop New Yoga']")
        WebElement shopNewYoga;
        @FindBy (xpath = "//a[text()='Orders and Returns']")
        WebElement OrderAndReturnsButton;
        @FindBy (xpath = "//a[text()='Advanced Search']")
        WebElement AdvancedSearchButton;
        @FindBy (xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[8]")
        WebElement TrainingButton;
        @FindBy (xpath = "//a[text()='Video Download']")
        WebElement VideoDownload ;
        @FindBy (xpath = "(//span[@class='action more icon'])[1]")
        WebElement ShopPantsToday;
        @FindBy (xpath = "(//div[@class='customer-menu']/ul/li/a)[1]")
        WebElement MyAccount;
        @FindBy (xpath = "//a[@id='ui-id-27']")
        WebElement Watches;


        public void clickOnAdvancedSearchButton(){
            clickOn(AdvancedSearchButton);
            LOG.info("click Advanced search success");
        }

        public void clickOnVideoDownload(){
            clickOn(VideoDownload);
            LOG.info("click Video Download success");
        }
        public void clickOnTraining(){
            clickOn(TrainingButton);
            LOG.info("click Advanced search success");
        }

        public String getHeaderText(){

        return getElementText(headerText);
         }


        public void typeItemToSearch(String item){
            type(searchField, item);
            LOG.info("item name type success");
        }

        public void clickOnSearchButton(){
            clickOn(searchButton);
            LOG.info("click search success");
        }
        public void searchItem(String item){
            typeAndEnter(searchField, item);
            LOG.info("item name type and enter success");
        }

        public void clickOnSigninButton(){
            clickOn(signinButton);
            LOG.info("click on signin button success");
        }
        public void clickOnCartButton(){
            clickOn(cartButton);
            LOG.info("click on cart button success");
        }

        public void clickOnAddToCartButton(WebDriver driver){
            clickWithActions(driver, cartButton);
            LOG.info("click cart button success");
        }
        public void clickOnCreateanAccountButton1(){
            clickOn(createAccountButton1);
            LOG.info("click create an account button success");
        }
        public void hoverOverFloatingMenu(WebDriver driver){
            hoverOver(driver, gearFloatingMenu);
            LOG.info("Gear hover over menu success");
        }
        public void clickOnFitnessEquipment(){
            clickOn(fitnessEquipment);
            LOG.info("click fitness Equipment success");
        }

        public void ClickOnSaleButton(){
            clickOn(saleButton);
            LOG.info("click Sale button success");
        }


        public void ClickOnCompareProductsButton(){
            clickOn(compareProductsButton);
            LOG.info("click compare Products Button success");
        }

        public void clickOnDropDown(){
            clickOn(DropDown);
            LOG.info("click DropDown Button success");
        }

        public void clickOnSignOut(){
            clickOn(SignOut);
            LOG.info("click Sign out Button success");
        }

        public void clickOnWomenProducts(){
            clickOn(womenProducts);
            LOG.info("click on women products success");
        }

        public void clickOnShopNewYoga(){
            clickOn(shopNewYoga);
            LOG.info("Click on shop new yoga products success");
        }
        public void clickOnOrderAndReturns(){
            clickOn(OrderAndReturnsButton);
            LOG.info("Click on shop new yoga products success");
        }
        public void clickOnShopPantsToday(){
            clickOn(ShopPantsToday);
            LOG.info("Click on shop pants today success");
        }
        public void clickOnMyAccount(){
            clickOn(MyAccount);
            LOG.info("click On MyAccount Button success");
        }
        public void hoverOverGear(WebDriver driver){
            waitForElementToBeVisible(driver, 10, gearFloatingMenu);
            hoverOver(driver, gearFloatingMenu);
            LOG.info("Gear hover over menu success");
        }

        public void clickOnWatches(){
            clickOn(Watches);
            LOG.info("click Watches success");
        }






    }


