package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.ContactUs;
import team2.npcommercepages.LoginPage;

public class ContactUsTest extends CommonAPI {

    Logger log = LogManager.getLogger(ContactUsTest.class.getName());

    @Test
    public void companyContact() {
        LoginPage loginPage = new LoginPage(getDriver());
        ContactUs contactUs = new ContactUs(getDriver());
        String expectedTitle = "nopCommerce demo store. Camera & photo";
        String actualTitle = loginPage.getPageTitleMessage();
        Assert.assertEquals(expectedTitle, actualTitle);
        log.info("The page title validation success");

        contactUs.clickOnContactUs();
        contactUs.usersFullName("fullName");
        contactUs.usersEmail("abc@abc.com");
        contactUs.enquiry("Hello my name is tamanna, i love my new camera!");
        contactUs.clickOnSubmit();
        String expectedPageText = "Your enquiry has been successfully sent to the store owner.";
        String actualPageText = contactUs.getSubmittedEmailMessageText();
        Assert.assertEquals(expectedPageText, actualPageText);
        log.info("User contact enquiry validation success.");

    }
}