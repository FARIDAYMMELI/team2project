package team2.magentopages;

import team2.base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoDownloadPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(VideoDownloadPage.class.getName());
    public VideoDownloadPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //objects
    @FindBy (xpath = "//div[@class='message info empty']")
    WebElement errorMessage4 ;

    public String geterrorMessage4(){

        return getElementText(errorMessage4);
    }
}
