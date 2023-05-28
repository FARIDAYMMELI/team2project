package team2.orangehrmpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import team2.base.CommonAPI;

public class RecruitmentPage extends CommonAPI {
    Logger log = LogManager.getLogger(RecruitmentPage.class.getName());
    public RecruitmentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //tc-24 Test the Search Button in the Recruitment Section
    @FindBy(xpath = "//span[text()='Recruitment']")
    WebElement recruitmentSection;
    public void clickOnRecruitmentSection(){
        clickOn(recruitmentSection);
        log.info("Click on Recruitment section success");
    }
    @FindBy(xpath = "//h6[text()='Recruitment']")
    WebElement recruitmentPageHeader;
    public boolean checkPresenceOfRecruitmentPageHeader(){
        boolean recruitmentPageHeaderIsDisplayed = isVisible(recruitmentPageHeader);
        log.info("Recruitment page header presence "+recruitmentPageHeaderIsDisplayed);
        return recruitmentPageHeaderIsDisplayed;
    }
    public String getRecruitmentPageHeaderText(){
        String recruitmentPageHeaderText = getElementText(recruitmentPageHeader);
        waitFor(5);
        log.info("Recruitment page header text "+recruitmentPageHeaderText);
        return recruitmentPageHeaderText;
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement jobTitleDropdown;
    public void clickOnJobTitleDropdwon(){
        clickOn(jobTitleDropdown);
        waitFor(5);
        jobTitleDropdown.sendKeys(Keys.ARROW_DOWN);
        waitFor(5);
        jobTitleDropdown.sendKeys(Keys.ENTER);
        log.info("Click on Job Title dropdown success");
    }

    @FindBy(xpath = "//div[text()='QA Engineer']")
    WebElement QAEngeneerFromDropdown;
    public void clickOnQAEngeneerFromJobTitleDropdown(){
        clickOn(QAEngeneerFromDropdown);
        log.info("Click on QA Engeneer from Job Title dropdown success");
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement vacancyDropdown;
    public void clickOnVacancyDropdown(){
        clickOn(vacancyDropdown);
        log.info("Click on Vacancy dropdown");
    }
    @FindBy(xpath = "(//div[text()='Senior QA Lead'])[1]")
    WebElement seniorQALeadeFromVacancyDropdown;
    public void clickOnSeniorQALeadFromVacancyDropdown(){
        clickOn(seniorQALeadeFromVacancyDropdown);
        log.info("Click on Senior QA Lead from Vacancy dropdown");
    }
    @FindBy(xpath = "oxd-icon bi-caret-down-fill oxd-select-text--arrow")
    WebElement hiringManagerDropdown;
    public void clickHiringManagerDropdown(){
        clickOn(hiringManagerDropdown);
        log.info("Click on the Hiring Manager dropdown success");
    }

    @FindBy(xpath = "//div[text()='Linda Anderson']")
    WebElement lindaAdersonFromManagerDropdown;
    public void clickOnLindaAdersonFromDropdown(){
        clickOn(lindaAdersonFromManagerDropdown);
        log.info("click on the Linda Anderson from dropdown success");
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
    WebElement statusDropdown;
    public void clickOnStatusDropdown(){
        clickOn(statusDropdown);
        log.info("Click on the status dropdown success");
    }
    @FindBy(xpath = "//div[text()='Interview Passed']")
    WebElement interviewPassedFromDropdown;
    public void clickOnInterviewPassedFromDropdown(){
        clickOn(interviewPassedFromDropdown);
        log.info("Click on Interview Passed from dropdown success");
    }
  //-------------
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement candidateNameField;

    public void enterName(String name){
        type(candidateNameField,name);
        waitFor(5);
        candidateNameField.sendKeys(Keys.ARROW_DOWN);
        candidateNameField.sendKeys(Keys.ENTER);
        log.info("Enter name success");
    }



    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement keywordsField;
    public void enterKeywords(String keys){
        type(keywordsField,keys);
        log.info("Enter keywords success");
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[5]")
    WebElement methodOfApplicationDropdown;
    public void clickOnMethodsOfDropdown(){
        clickOn(methodOfApplicationDropdown);
        log.info("Click on Methods Of Application success");
    }
    @FindBy(xpath = "//div[text()='Manual']")
    WebElement manualFromDropdown;
    public void clickOnManul(){
        clickOn(manualFromDropdown);
        log.info("click on manual from dropdown success");
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    public void clickOnSearchButton(){
        clickOn(searchButton);
        log.info("Click on Search button success");
    }
    @FindBy(xpath = "//h5[text()='Candidates']")
    WebElement candidatesHeader;
    public boolean checkPresenceOfCandidateHeader(){
        boolean candidateHeaderIsDisplayed = isVisible(candidatesHeader);
        log.info("Candiate header presence "+candidateHeaderIsDisplayed);
        return candidateHeaderIsDisplayed;
    }
    public String getCandidateHeaderText(){
        String candidateHeaderText = getElementText(candidatesHeader);
        waitFor(5);
        log.info("Candidate header text "+candidateHeaderText);
        return candidateHeaderText;
    }

    //tc-25 Test the Add Button in Recruitment Section
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    public void clickOnAddButton(){
        clickOn(addButton);
        log.info("Click on Add button success");
    }
    @FindBy(xpath = "//h6[text()='Add Candidate']")
    WebElement addCandidateHeader;
    public boolean checkOfPresenceOfAddCandidateHeader(){
        boolean addCandidateHeaderIsDisplayed = isVisible(addCandidateHeader);
        log.info("Candidate header presence "+addCandidateHeaderIsDisplayed);
        return addCandidateHeaderIsDisplayed;
    }
    public String getAddCandidateHeaderText(){
        String addCandidateHeaderText = getElementText(addCandidateHeader);
        waitFor(5);
        log.info("Add candidate header text "+ addCandidateHeaderText);
        return addCandidateHeaderText;
    }
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;
    public void enterFirstName(String name){
        type(firstName,name);
        log.info("Enter first name success");
    }
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;
    public void enterLastName(String name){
        type(lastName,name);
        log.info("Enter last name success");
    }
    @FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
    WebElement emailField;
    public void enterEmail(String email){
        type(emailField,email);
        log.info("Enter email success");
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;
    public void clickOSaveButton(){
        clickOn(searchButton);
        log.info("Click on save button success");
    }
    @FindBy(xpath = "//h6[text()='Application Stage']")
    WebElement applicationStageHeader;
    public String getApplicationStageHeaderText(){
        String applicationStageHeaderText = getElementText(applicationStageHeader);
        waitFor(5);
        log.info("Application stage header text "+applicationStageHeaderText);
        return applicationStageHeaderText;
    }

    //tc-26 Test the Vacancies Button in the Recruitment section

    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab']")
    WebElement vacanciesButton;
    public void clickOnVacanciesButton(){
        clickOn(vacanciesButton);
        log.info("Click on Vacancies success");
    }
    @FindBy(xpath = "//h5[text()='Vacancies']")
    WebElement vacanciesHeader;
    public String getVacanciesHeaderText(){
        String vacanciesHeaderText = getElementText(vacanciesHeader);
        waitFor(5);
        log.info("Vacancies header Text "+vacanciesHeaderText);
        return vacanciesHeaderText;
    }

    //tc-27 Test the Search Button in Vacancies in the Recruitment section
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement vacanciesJobTitleDropdown;
    public void clickOnJobTitleDropdown(){
        clickOn(vacanciesJobTitleDropdown);
        waitFor(1);
        log.info("Click on Job Title dropdown success");
    }
    @FindBy(xpath = "(//div[text()='Account Assistant'])[1]")
    WebElement accoungAssistantFromDropdown;
    public void clickOnAccountAssistant(){
        clickOn(accoungAssistantFromDropdown);
        log.info("Click on Account Assistant success");
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    WebElement vacancyFromDropdown;
    public void clickOnVacancyFromDropdown(){
        clickOn(vacancyFromDropdown);
        waitFor(1);
        log.info("click on vacancy dropdown success");
    }
    @FindBy(xpath = "(//div[text()='Senior QA Lead'])[1]")
    WebElement seniorQALead;
    public void clickOnSeniorQALead(){
        clickOn(seniorQALead);
        log.info("Click on Senior QA Lead success");
    }
    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")
    WebElement hiringMangerDropdown;
    public void clickOnHiringManagerDropdown(){
        clickOn(hiringMangerDropdown);
        log.info("Click on Hiring manager dropdown success");
    }

    @FindBy(xpath = "(//div[text()='Paul Collings'])[1]")
    WebElement PaulCollingsFromDropdown;
    public void clickOnPaulCollingsFromDropdown(){
        clickOn(PaulCollingsFromDropdown);
        log.info("Click on Paul Collings success");
    }

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")
    WebElement statusFromVacancyDropdown;
    public void clickOnVacancyDropdown2(){
        waitFor(5);
        clickOn(statusFromVacancyDropdown);
        waitFor(2);
        log.info("Click on vacancy dropdown success");
    }
    @FindBy(xpath = "//div[@clear='false']")
    WebElement active;
    public void clickOnActive(){
        clickOn(active);
        log.info("Click on Active button success");
    }
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButtton;
    public void clickOnSearchButtonFromVacancy(){
        clickOn(searchButtton);
        log.info("Click on search button success");
    }
    @FindBy(xpath = "//span[text()='No Records Found']")
    WebElement noRecordFound;
    public String getNoRecordFoundText(){
        String noRecordFoundText = getElementText(noRecordFound);
        log.info("No Record found text "+noRecordFoundText);
        return noRecordFoundText;
    }
    public String getAddText(){
        String addText = getElementText(addButtonInVacancies);
        waitFor(5);
        log.info("Add text "+addText);
        return addText;
    }

    //tc-28 Test the Add Button in Vacancies in the Recruitment section
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButtonInVacancies;
    public void clickOnAddButtonInVacancies(){
        clickOn(addButtonInVacancies);
        log.info("Click on add button in vacancies");
    }
    @FindBy(xpath = "//h6[text()='Add Vacancy']")
    WebElement addVacancyHeader;
    public String getAddVacancyHeaderText(){
        String addVacancyHeaderText = getElementText(addVacancyHeader);
        waitFor(5);
        log.info("add vacancy header text "+addVacancyHeaderText);
        return addVacancyHeaderText;
    }
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-input--error']")
    WebElement vacancyName;
    public void enterVacancyName(String name){
        waitFor(2);
        type(vacancyName,name);
        waitFor(2);
        log.info("Enter name success");
    }

















}
