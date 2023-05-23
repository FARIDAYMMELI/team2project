package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class HomePage extends CommonAPI {
    Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath = "//h2[text()=\"Welcome to out store\"]")
    WebElement homePageWelcomeTitle;

    @FindBy(xpath = "//strong[text()=\"Featured products\"]")
    WebElement featuredHomePageTitle;

    @FindBy(xpath = "//strong[text()=\"News\"]")
    WebElement newsTitle;

    @FindBy(xpath = "//strong[text()=\"Community poll\"]")
    WebElement communityPollTitle;

    @FindBy(xpath = "//strong[text()=\"Information\"]")
    WebElement informationTab;

    @FindBy(xpath= "//strong[text()=\"Customer service\"]")
    WebElement customerService;

    @FindBy(xpath= "//strong[text()=\"My account\"]")
    WebElement myAccount;

    @FindBy(xpath = "//a[@href=\"/shipping-returns\"]")
    WebElement shippingAndReturns;

    @FindBy(xpath = "//h1[text()=\"Shipping & returns\"]")
    WebElement shippingAndReturnsText;

    public String getHomePageTitle(){
        String homePageTitle = getElementText(homePageWelcomeTitle);
        log.info("Home page title is "+homePageTitle);
        return homePageTitle;
    }
    public String featuredTitle(){
        String featuredTitle = getElementText(featuredHomePageTitle);
        log.info("Featured title is validation success");
        return featuredTitle;
    }
    public String homePageNewsTitle(){
        String newsTitleDisplayed = getElementText(newsTitle);
        log.info("News title validation success");
        return newsTitleDisplayed;
    }
    public String communityTitle(){
        String communityTitleDisplayed = getElementText(communityPollTitle);
        log.info("community poll title validation success");
        return communityTitleDisplayed;
    }
    public String homePageInformation(){
        String homeInformation = getElementText(informationTab);
        log.info("information ");
        return homeInformation;
    }
    public String customerServiceElement(){
        String homePageCustomerService = getElementText(customerService);
        log.info("customer service validation ");
        return homePageCustomerService;
    }
    public String myAccountElement(){
        String myAccountTab = getElementText(myAccount);
        log.info("my account ");
        return myAccountTab;
        }
        public void shippingAndReturnsElement(){
        clickOn(shippingAndReturns);
        log.info("user clicks on shipping and returns");
        }
        public String shippingAndReturns(){
        String shippingAndReturnsPage = getElementText(shippingAndReturnsText);
        log.info("Title of the page");
        return shippingAndReturnsPage;
        }
    }

