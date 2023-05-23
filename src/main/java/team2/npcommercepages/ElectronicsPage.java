package team2.npcommercepages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ElectronicsPage extends CommonAPI {

    Logger log = LogManager.getLogger(ElectronicsPage.class.getName());

    public ElectronicsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
}
    @FindBy(xpath = "(//a[@href=\"/electronics\"])[1]")
    WebElement hoverOverElectronics;

    @FindBy(xpath = "(//a[@href=\"/camera-photo\"])[1]")
    WebElement clickOnCameraAndPhotos;

    @FindBy(xpath = "//h1[text()=\"Camera & photo\"]")
    WebElement titleIsPresent;

    public void electronicsDropDown(WebDriver driver){
        hoverOver(driver, hoverOverElectronics);
        log.info("hover over electronics drop down menu");
    }
    public void hoverOverOnTheElectronics(){
       hoverOverAndClickOn(clickOnCameraAndPhotos);
        log.info("user hover overs electronic and clicks camera and photos");
}
    public String cameraAndPhotosTitle(){
        String titleIsDisplayed = getElementText(titleIsPresent);
        log.info("title is displayed success");
        return titleIsDisplayed;

    }

}









