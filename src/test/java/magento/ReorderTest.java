package magento;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.magentopages.*;

public class ReorderTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(ReorderTest.class.getName());

    //ReadFromExcel read = new ReadFromExcel("D:\\BootCamp Selenium\\web-automation-framework-team4\\data\\titles.xlsx", "Magento");

    @Test
    public void orderAndReturn() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        OrderAndReturnPage orderAndReturn = new OrderAndReturnPage(getDriver());
        Order000017128Page order000017128Page = new Order000017128Page(getDriver());
        homePage.clickOnOrderAndReturns();

        String title= getCurrentTitle();
        Assert.assertEquals(title, "Orders and Returns Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Orders and Returns  title page validation success");
        orderAndReturn.typeOrderID("000017128");
        orderAndReturn.typeBillingLastname("iddir");
        orderAndReturn.typeEmail("samia.mails@gmail.com");
        orderAndReturn.clickOnContinueButton();

        String title1= getCurrentTitle();
        Assert.assertEquals(title1, "Order # 000017128 Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites");
        LOG.info("Order # 000017128  title page validation success");
        order000017128Page.clickOnPrintOrder();

    }




}
