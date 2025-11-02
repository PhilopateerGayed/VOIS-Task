package tests;

import data.TestDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.KsrtcHomePage;
import pages.KsrtcPaymentPage;
import pages.KsrtcResultsPage;

public class KsrtcTests {

    WebDriver driver = new ChromeDriver();
    KsrtcHomePage homePage = new KsrtcHomePage(driver);
    KsrtcResultsPage resultsPage = new KsrtcResultsPage(driver);
    KsrtcPaymentPage paymentPage = new KsrtcPaymentPage(driver);


    @BeforeTest
    public void init() {
        driver.manage().window().maximize();
        homePage.goToKsrtcHomePage();

    }


    @Test(dataProvider = "ksrtcData", dataProviderClass = TestDataProvider.class)
    void testBusBooking(String from, String to, String date, String phone, String email, String name, String gender, String age) {
        // Test logic to verify bus booking functionality
        homePage.enterFromAndToCity(from, to);
        homePage.enterDate(date);
        homePage.clickSearchBtn();
        resultsPage.clickSelectSeatBtn();
        resultsPage.selectSeat();
        resultsPage.selectPoints();
        resultsPage.enterMobileNumberAndEmail(phone, email);
        resultsPage.enterPassengerDetails(name, gender, age);
        paymentPage.selectPaymentMethod();


    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

}
