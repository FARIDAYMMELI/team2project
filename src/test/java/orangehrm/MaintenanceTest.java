package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LeavePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.MaintenancePage;
import team2.utility.Utility;

import java.util.Properties;

public class MaintenanceTest extends CommonAPI {
    Logger log = LogManager.getLogger(MaintenanceTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void maintenance(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        MaintenancePage maintenancePage = new MaintenancePage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader,actualHomePageHeader);
        waitFor(1);

        maintenancePage.clickOnMaintenance();
        String expectedHeader = "Administrator Access";
        String actualHeader = maintenancePage.getAdministratorHeaderMessage();
        Assert.assertEquals(expectedHeader,actualHeader);
        log.info("Header validation success");

        maintenancePage.enterPassword("admin123");
        maintenancePage.clickOnConfirmButton();
        String expectedMaintenaceHeader = "Maintenance";
        String actualMaintenanceHeader = maintenancePage.getMaintenanceMessage();
        Assert.assertEquals(expectedMaintenaceHeader,actualMaintenanceHeader);
        log.info("Maintenance header validation success");




    }

}
