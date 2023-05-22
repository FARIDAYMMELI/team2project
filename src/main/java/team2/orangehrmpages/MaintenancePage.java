package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team2.base.CommonAPI;

public class MaintenancePage extends CommonAPI {
    Logger log = LogManager.getLogger(MaintenancePage.class.getName());
    //17 Test Maintenance in the Maintenance Section
    @FindBy(xpath = "//a[@href='/web/index.php/maintenance/viewMaintenanceModule']")
    WebElement maintenanceSection;
    @FindBy(xpath = "//h6[text()=\"Administrator Access\"]")
    WebElement administrativeAccessHeader;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement confirmButton;
    @FindBy(xpath = "//h6[text()='Maintenance']")
    WebElement maintenanceValidation;
    public MaintenancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //17 Test Maintenance in the Maintenance Section
    public void clickOnMaintenance() {
        clickOn(maintenanceSection);
        log.info("Click on maintenance success");
    }

    public boolean checkPresenceOfAdministratorHeader() {
        boolean administratorPageHeaderIsDisplayed = isVisible(administrativeAccessHeader);
        log.info("administrator access header presence " + administratorPageHeaderIsDisplayed);
        return administratorPageHeaderIsDisplayed;
    }
    public String getAdministratorHeaderMessage(){
        String administratorText = getElementText(administrativeAccessHeader);
        log.info("Administrator header text "+administratorText);
        return administratorText;
    }

    public void enterPassword(String password) {
        type(passwordField, password);
        log.info("enter password success");
    }

    public void clickOnConfirmButton() {
        clickOn(confirmButton);
        log.info("Click on confirm button success");
    }
    public String getMaintenanceMessage(){
        String maintenanceText = getElementText(maintenanceValidation);
        log.info("maintenance text "+ maintenanceText);
        return maintenanceText;
    }



}
