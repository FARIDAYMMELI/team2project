package team2.base;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import team2.utility.Utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class CommonAPI {
    Logger log = LogManager.getLogger(CommonAPI.class.getName());
    Properties prop = Utility.loadProperties();
    String browserstackUsername = prop.getProperty("browserstack.username");
    String browserstackPassword = prop.getProperty("browserstack.password");

    String implicitWait = prop.getProperty("implicit.wait","5");
    String windowMaximize = prop.getProperty("browser.maximize","true");
    String takeScreenshots = prop.getProperty("take.screenshots","false");

    public WebDriver driver;

    public void getCloudDriver(String envName, String os, String osVersion, String browserName, String browserVersion, String username, String password) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("os", os);
        cap.setCapability("os_version", osVersion);
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        if (envName.equalsIgnoreCase("browserstack")){
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://"+username+":"+password+"@hub-cloud.browserstack.com:80/wd/hub"),cap);
        } else if (envName.equalsIgnoreCase("saucelabs")) {
            driver = new RemoteWebDriver(new URL("http://"+username+":"+password+"@ondemand.saucelabs.com:80/wd.hub"),cap);
        }
    }

    public void getLocalDriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            log.info("chrome browser open success");
        }else if (browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            log.info("firefox browser open success");
        }else if (browserName.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
            log.info("edge browser open success");
        }
    }

    @Parameters({"useCloudEnv","envName","os","osVersion","browserName","browserVersion","url"})
    @BeforeMethod
    public void setUp(@Optional("false") String useCloudEnv, @Optional("browserstack") String envName, @Optional("windows") String os,
                      @Optional("10") String osVersion, @Optional("chrome") String browserName, @Optional("110") String browserVersion,
                      @Optional("https://www.google.com") String url) throws MalformedURLException {
        if (useCloudEnv.equalsIgnoreCase("true")){
            getCloudDriver(envName,os,osVersion,browserName,browserVersion,browserstackUsername,browserstackPassword);
        } else if(useCloudEnv.equalsIgnoreCase("false")){
            getLocalDriver(browserName);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(implicitWait)));
        if (windowMaximize.equalsIgnoreCase("true")){
            driver.manage().window().maximize();
        }
        driver.get(url);
    }
    @AfterMethod
    public void tearDown(){
        //close browser
        driver.quit();
        log.info("browser close success");
    }

    //------------------------------------------------------------------------------------------------------------------
    //                                              selenium methods
    //------------------------------------------------------------------------------------------------------------------

    /*public WebDriver getDriver() {
        return driver;
    }
    public String getCurrentTitle(){
        return driver.getTitle();
    }

    public void clickOn(WebElement element){
        element.click();
    }
    public void type(WebElement element, String text){
        element.sendKeys(text);

    }
    public void hoverOver(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }



     */


    public WebDriver getDriver() {
        return driver;
    }
    public String getCurrentTitle(){
        return driver.getTitle();
    }

    public String getElementText(WebElement element){
        return element.getText();
    }
    /*public String getTextFromElement(WebElement element){
        return element.getText();} */
    public void clickOn(WebElement element){
        element.click();
    }
    public void type(WebElement element, String text){
        element.sendKeys(text);
    }
    public void typeAndEnter(WebElement element, String text){
        element.sendKeys(text, Keys.ENTER);
    }
    public void selectOptionFromDropdown(WebElement dropdown, String option){
        Select select = new Select(dropdown);
        try {
            select.selectByVisibleText(option);
        }catch (Exception e){
            select.selectByValue(option);
        }
    }
    public void hoverOver(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }


    public void hoverOverAndClickOn(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    public void waitForElementToBeVisible(WebDriver driver, int duration, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public WebElement waitForElementToBeVisible(By locator, int timeOut, long intervalTime) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofMillis(intervalTime));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }



    public void clickWithActions(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    public void clickWithJavascript(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }
    public void captureScreenshot() {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("screenshots"+File.separator+"screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void takeScreenshot(String screenshotName){
        DateFormat df = new SimpleDateFormat("MMddyyyyHHmma");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(Utility.currentDir + File.separator +"screenshots"+ File.separator + screenshotName+" "+df.format(date)+".jpeg"));
            log.info("Screenshot captured");
        } catch (Exception e) {
            log.info("Exception while taking screenshot "+e.getMessage());
        }
    }
    //Added Methods
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
    public String getAttributeValue (WebElement element, String attributeName){
        return element.getAttribute(attributeName);
    }
    public boolean elementIsDisplayed (WebElement element){
        return element.isDisplayed();
    }
    public boolean elementIsSelected (WebElement element){
        return element.isSelected();
    }
    public boolean elementIsEnabled (WebElement element){
        return element.isEnabled();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
        log.info("clicked on accept alert success");
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }
    public void clearTextFromTextBox (WebElement element){
        element.clear();
    }
    public void typeNumber(WebElement element, int number){
        element.sendKeys(""+number+"");
    }
    public void navigateBack (){
        driver.navigate().back();
    }
    public void navigateForward(){
        driver.navigate().forward();
    }
    public int extractNumberBetweenBrackets (String quantity){
        String quantityNumber = quantity.substring(quantity.indexOf('(')+1,quantity.indexOf(')'));
        int number = Integer.parseInt(quantityNumber);
        return number;
    }
    public void switchToChildWindow(WebDriver driver, String Title){
        Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> hList = new ArrayList<String>(allWindowHandles);
        for(String window : hList){
            String url = driver.switchTo().window(window).getCurrentUrl();
            String windowHandle=driver.switchTo().window(window).getWindowHandle();
            if(url.contains(Title)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    public void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isVisible(WebElement element){
        return element.isDisplayed();
    }
    public boolean isInteractible(WebElement element){
        return element.isEnabled();
    }
    public boolean isChecked(WebElement element){
        return element.isSelected();}

}


