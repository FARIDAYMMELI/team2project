package nopcommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import team2.base.CommonAPI;
import team2.npcommercepages.BooksPage;
import team2.npcommercepages.LoginPage;

import java.awt.print.Book;

public class BooksTest extends CommonAPI {

    Logger log = LogManager.getLogger(BooksTest.class.getName());

    @Test

    public void addBookToCart(){
        LoginPage loginPage = new LoginPage(getDriver());
        BooksPage booksPage = new BooksPage(getDriver());
//        String expectedTitle = "nopCommerce demo store. Camera & photo";
//        String actualTitle = loginPage.getPageTitleMessage();
//        Assert.assertEquals(expectedTitle, actualTitle);
//        log.info("The page title validation success");

        booksPage.clickOnBooks();
        booksPage.fahrenheitBook();
        booksPage.clickOnAddToCart();
        booksPage.shoppingCartButton();

        String expectedPageTitle = "Shopping cart";
        String actualPageTitle = booksPage.getShoppingCartPageTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        log.info("The page title validation success");
    }
    @Test
    public void homePageButtonOnBooksPage(){
        BooksPage booksPage = new BooksPage(getDriver());
        booksPage.clickOnBooks();
        booksPage.bookPageHomeButton();
        String expectedTitle = "Welcome to our store";
        String actualTitle = booksPage.getHomePageWelcomeTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        log.info("home page validation");
    }
}
