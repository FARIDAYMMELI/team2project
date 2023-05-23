package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

import java.util.ConcurrentModificationException;

public class PerformancePage extends CommonAPI {
    Logger log = LogManager.getLogger(PerformancePage.class.getName());
    public PerformancePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


     //19 Test My Tracker in the Performance Section
    @FindBy(xpath = "//span[text()='Performance']")
    WebElement performanceSection;
    @FindBy(xpath = "//h6[text()=\"Performance\"]")
    WebElement performanceHeader;
    @FindBy(xpath = "//a[text()='My Trackers']")
    WebElement myTrackerButton;
    @FindBy(xpath = "//h6[text()=\"My Performance Trackers\"]")
    WebElement myTrackerHeader;
    @FindBy(xpath = "//span[text()='(1) Record Found']")
    WebElement recordFoundMessage;

    //19 Test My Tracker in the Performance Section
    public void clickOnPerformance(){
        clickOn(performanceSection);
        log.info("Click on performance section success");
    }
    public boolean checkPresenceOfPerformaceHeader(){
        boolean performanceHeaderIsDisplayed = isVisible(performanceHeader);
        log.info("Performance header presence "+performanceHeaderIsDisplayed);
        return performanceHeaderIsDisplayed;
    }
    public String getPerformanceHeaderText(){
        String performanceHeaderText = getElementText(performanceHeader);
        log.info("Performance header "+performanceHeaderText);
        return performanceHeaderText;
    }
    public void clickMyTrackers(){
        clickOn(myTrackerButton);
        log.info("Click on my trackers success");
    }
    public boolean checkPresenceMyTrackerHeader(){
        boolean myTrackerHeaderIsDisplayed = isVisible(myTrackerHeader);
        log.info("my tracker header presence "+myTrackerHeaderIsDisplayed);
        return myTrackerHeaderIsDisplayed;
    }
    public String getMyTrackerHeader(){
        String getMyTrackerHeaderText = getElementText(myTrackerHeader);
        log.info("My tracker header text "+getMyTrackerHeaderText);
        return getMyTrackerHeaderText;
    }








}
