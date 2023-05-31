package team2.scaledupitpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class GuitarPage  extends CommonAPI {
    Logger log = LogManager.getLogger(GuitarPage.class.getName());

    public GuitarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

                 //objects
    @FindBy(xpath = "//input[@id='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//a[normalize-space()='Reviews (0)']")
    WebElement reviewButton;
    @FindBy(xpath = "//a[normalize-space()='5']")
    WebElement ratingButton;
    @FindBy(xpath = "//textarea[@id='comment']")
    WebElement reviewField;

             //reusable methods
    public void clickOnSubmitButton() {
        clickOn(submitButton);
        log.info("click on submit button success");}

    public void clickReviewButton() {
        clickOn(reviewButton);
        log.info("click on submit button success");}
    public void clickRating() {
        clickOn(ratingButton);
        log.info("click on Rating button success");}
    public void typeReview(String review) {
        type(reviewField, review);
        log.info("type review success");
    }
}
