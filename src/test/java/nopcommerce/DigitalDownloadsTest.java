package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.DigitalDownloadsPage;

public class DigitalDownloadsTest extends CommonAPI {
    Logger log = LogManager.getLogger(BooksTest.class.getName());

    @Test

    public void downloads(){

        DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage(getDriver());
        digitalDownloadsPage.digitalDownloads();
        String expectedTitle = "Digital downloads";
        String actualTitle = digitalDownloadsPage.getTitleOfDigitalPage();
        Assert.assertEquals(expectedTitle,actualTitle);
        log.info("user on digital downloads page validation");
    }

    @Test
    public void priceOfItem(){
        DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage(getDriver());
        digitalDownloadsPage.priceTag();

    }
    @Test
    public void categoriesDisplay(){
        DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage(getDriver());
        digitalDownloadsPage.digitalDownloads();
        digitalDownloadsPage.categoriesOption();

    }
}
