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

    @FindBy(xpath = "//h2[text()=\"Welcome to our store\"]")
    WebElement homePageWelcomeTitle;
    public String getHomePageTitle(){
        String homePageTitle = getElementText(homePageWelcomeTitle);
        log.info("Home page title is ");
        return homePageTitle;
    }

    @FindBy(xpath = "//strong[text()=\"Featured products\"]")
    WebElement featuredHomePageTitle;
    public String featuredTitle(){
        String featuredTitle = getElementText(featuredHomePageTitle);
        log.info("Featured title is validation success");
        return featuredTitle;
    }

    @FindBy(xpath = "//strong[text()=\"News\"]")
    WebElement newsTitle;

    public String homePageNewsTitle(){
        String newsTitleDisplayed = getElementText(newsTitle);
        log.info("News title validation success");
        return newsTitleDisplayed;
    }

    @FindBy(xpath = "//strong[text()=\"Community poll\"]")
    WebElement communityPollTitle;
    public String communityTitle(){
        String communityTitleDisplayed = getElementText(communityPollTitle);
        log.info("community poll title validation success");
        return communityTitleDisplayed;
    }

    @FindBy(xpath = "//strong[text()=\"Information\"]")
    WebElement informationTab;
    public String homePageInformation(){
        String homeInformation = getElementText(informationTab);
        log.info("information ");
        return homeInformation;
    }

    @FindBy(xpath= "//strong[text()=\"Customer service\"]")
    WebElement customerService;
    public String customerServiceElement(){
        String homePageCustomerService = getElementText(customerService);
        log.info("customer service validation ");
        return homePageCustomerService;
    }

    @FindBy(xpath= "//strong[text()=\"My account\"]")
    WebElement myAccount;
    public String myAccountElement(){
        String myAccountTab = getElementText(myAccount);
        log.info("my account ");
        return myAccountTab;
        }

    @FindBy(xpath = "//a[@href=\"/shipping-returns\"]")
    WebElement shippingAndReturns;
        public void shippingAndReturnsElement(){
        clickOn(shippingAndReturns);
        log.info("user clicks on shipping and returns");
        }

    @FindBy(xpath = "//h1[text()=\"Shipping & returns\"]")
    WebElement shippingAndReturnsText;
        public String shippingAndReturns(){
        String shippingAndReturnsPage = getElementText(shippingAndReturnsText);
        log.info("Title of the page");
        return shippingAndReturnsPage;
        }
    @FindBy(xpath = "//a[text()=\"Documentation\"]")
    WebElement documentationButton;

        public void homePageDocumentation(){
            clickOn(documentationButton);
            log.info("user clicks on documentation");
        }

        @FindBy(xpath = "//a[text()=\"Forums\"]")
        WebElement forums;

        public void forumsButton(){
            clickOn(forums);
            log.info("user clicks on forums button on homepage");
        }
        @FindBy(xpath = "//h1[text()=\"nopCommerce forums\"]")
        WebElement forumsHomePageTitle;

        public String forumsPageTitle(){
            String pageTitle = getElementText(forumsHomePageTitle);
            log.info("forums home page title is displayed");
            return pageTitle;
        }
    @FindBy(xpath = "(//a[text()=\"News and Announcements\"])[1]")
    WebElement newsAndAnnouncements;

        public String newsAndAnnouncement(){
            String title = getElementText(newsAndAnnouncements);
            log.info("user can see news and annoucements title on the page");
            return title;

        }

}

