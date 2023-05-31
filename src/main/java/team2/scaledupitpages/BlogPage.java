package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class BlogPage  extends CommonAPI {

    Logger log = LogManager.getLogger(BlogPage.class.getName());
    public BlogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//h1[normalize-space()='Blog']")
    WebElement mainHeader;
    @FindBy(xpath = "//article[@id='post-249']//a[@class='read-more'][normalize-space()='Read More']")
    WebElement addToCartBlogButton;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cartButtonOnBlogButton;
    public void clickOnAddToCartButtonBlog() {
        clickOn(addToCartBlogButton);
        log.info("add read laptop  to the in blog page success");}
    public String getHeaderTextBlogPage() {
        String text = getElementText(mainHeader);
        log.info("user in blog page");
        return text;}

    public void clickOnCartButtonOnBlogButton() {
        clickOn(cartButtonOnBlogButton);
        log.info("click on cart button  on shop page success"); }

}
