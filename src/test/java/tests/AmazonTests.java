package tests;

import data.TestDataProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AmazonCartPage;
import pages.AmazonHomePage;
import pages.AmazonProductPage;
import pages.AmazonTodayDeals;

public class AmazonTests {
    WebDriver driver = new ChromeDriver();
    AmazonHomePage homePage = new AmazonHomePage(driver);
    AmazonProductPage productPage = new AmazonProductPage(driver);
    AmazonCartPage cartPage = new AmazonCartPage(driver);
    AmazonTodayDeals todayDealsPage = new AmazonTodayDeals(driver);


    @BeforeTest
    public void init() {
        driver.manage().window().setSize(new Dimension(1024, 768));
        homePage.goToHomePage("https://www.amazon.eg/");
        try {
            homePage.clickElement(homePage.continueButton);
        } catch (Exception e) {
            System.out.println("Continue button not found, proceeding without clicking it.");
        }


    }

    @Test(dataProvider = "amazonSearchData", dataProviderClass = TestDataProvider.class)
    public void testSearchFunctionality(String SearchItem) {
        // Test logic to verify search functionality
        homePage.sendKeysToElement(homePage.searchbar, SearchItem);
        homePage.clickElement(homePage.searchbutton);
        homePage.waitForPageToLoad();
        Assert.assertEquals(homePage.getHomepageTitle(), homePage.expectedTitle, "Search functionality failed!");
        homePage.selectFirstItem();
        productPage.addItemToCart();
        productPage.openCart();
        Assert.assertTrue(cartPage.checkItem(), "item was not added to the cart");

    }

    @Test
    public void testTodayDeals() {

        todayDealsPage.goToTodayDeals();
        todayDealsPage.selectfilters();
        todayDealsPage.setSliderTo10Percent();
        todayDealsPage.scrollingDown();
        todayDealsPage.selectRandomItem();
        productPage.addItemToCart();
        productPage.openCart();
        
    }


    @AfterTest
    public void shutDown() {
        driver.quit();
    }
}
