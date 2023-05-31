package orangehrm;

import com.amazonaws.services.dynamodbv2.xspec.S;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.orangehrmpages.DirectoryPage;
import team2.orangehrmpages.HomePage;
import team2.orangehrmpages.LoginPage;
import team2.orangehrmpages.RecruitmentPage;
import team2.utility.Utility;

import java.util.Properties;

public class RecruitmentTest extends CommonAPI {
    Logger log = LogManager.getLogger(RecruitmentTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");

    @Test
    public void search() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        RecruitmentPage recruitmentPage = new RecruitmentPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("Page header validation success");

        recruitmentPage.clickOnRecruitmentSection();
        String expectedPageHeader = "Recruitment";
        String actualPageHeader = recruitmentPage.getRecruitmentPageHeaderText();
        Assert.assertEquals(expectedPageHeader, actualPageHeader);
        log.info("Page Header validation success");
        recruitmentPage.enterName("Peter");
        recruitmentPage.enterKeywords("ab");
        recruitmentPage.clickOnSearchButton();
        String expectedMessage = "Candidates";
        String actualMessage = recruitmentPage.getCandidateHeaderText();
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Message validation success");
    }

    @Test
    public void addButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        RecruitmentPage recruitmentPage = new RecruitmentPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("Page header validation success");
        recruitmentPage.clickOnRecruitmentSection();
        String expectedPageHeader = "Recruitment";
        String actualPageHeader = recruitmentPage.getRecruitmentPageHeaderText();
        Assert.assertEquals(expectedPageHeader, actualPageHeader);
        log.info("Page Header validation success");
        recruitmentPage.clickOnAddButton();
        String expectedHeader = "Add Candidate";
        String actualHeader = recruitmentPage.getAddCandidateHeaderText();
        Assert.assertEquals(expectedHeader, actualHeader);
        log.info("header validation success");
        recruitmentPage.enterFirstName("aa");
        recruitmentPage.enterLastName("ac");
        recruitmentPage.enterEmail("a@a.com");
        recruitmentPage.clickOSaveButton();
        String expectedMessage = "Application Stage";
        String actualMessage = recruitmentPage.getApplicationStageHeaderText();
        log.info("Message validation success");

    }

    @Test
    public void vacancies() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        RecruitmentPage recruitmentPage = new RecruitmentPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("Page header validation success");
        recruitmentPage.clickOnRecruitmentSection();
        String expectedPageHeader = "Recruitment";
        String actualPageHeader = recruitmentPage.getRecruitmentPageHeaderText();
        Assert.assertEquals(expectedPageHeader, actualPageHeader);
        log.info("Page Header validation success");
        recruitmentPage.clickOnVacanciesButton();
        String expectedHeader = "Vacancies";
        String actualHeader = recruitmentPage.getVacanciesHeaderText();
        Assert.assertEquals(expectedHeader, actualHeader);
        log.info("Header validation success");

    }

    @Test
    public void searchInVacancies() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        RecruitmentPage recruitmentPage = new RecruitmentPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("Page header validation success");
        recruitmentPage.clickOnRecruitmentSection();
        String expectedPageHeader = "Recruitment";
        String actualPageHeader = recruitmentPage.getRecruitmentPageHeaderText();
        Assert.assertEquals(expectedPageHeader, actualPageHeader);
        log.info("Page Header validation success");
        recruitmentPage.clickOnVacanciesButton();
        String expectedHeader = "Vacancies";
        String actualHeader = recruitmentPage.getVacanciesHeaderText();
        Assert.assertEquals(expectedHeader, actualHeader);
        log.info("Header validation success");

        recruitmentPage.clickOnJobTitleDropdown();
        recruitmentPage.clickOnAccountAssistant();
        recruitmentPage.clickOnVacancyFromDropdown();
        recruitmentPage.clickOnSeniorQALead();
        recruitmentPage.clickOnHiringManagerDropdown();
        recruitmentPage.clickOnSearchButtonFromVacancy();
        String expectedMessage = "Add";
        String actualMessage = recruitmentPage.getAddText();
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Message validation success");
    }

    @Test
    public void addInVacancies() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        RecruitmentPage recruitmentPage = new RecruitmentPage(getDriver());
        String expectedTitle = "OrangeHRM";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        loginPage.enterUsername(validUsername);
        loginPage.enterPassword(validPassword);
        loginPage.clickOnLoginButton();
        String expectedHomePageHeader = "Dashboard";
        String actualHomePageHeader = homePage.getHomePageHeaderText();
        Assert.assertEquals(expectedHomePageHeader, actualHomePageHeader);
        log.info("Page header validation success");
        recruitmentPage.clickOnRecruitmentSection();
        String expectedPageHeader = "Recruitment";
        String actualPageHeader = recruitmentPage.getRecruitmentPageHeaderText();
        Assert.assertEquals(expectedPageHeader, actualPageHeader);
        log.info("Page Header validation success");
        recruitmentPage.clickOnVacanciesButton();
        String expectedHeader = "Vacancies";
        String actualHeader = recruitmentPage.getVacanciesHeaderText();
        Assert.assertEquals(expectedHeader, actualHeader);
        log.info("Header validation success");

        recruitmentPage.clickOnAddButtonInVacancies();
        String expectedText = "Add Vacancy";
        String actualText = recruitmentPage.getAddVacancyHeaderText();
        Assert.assertEquals(expectedText, actualText);
        log.info("Page Text validation success");

    }


}
