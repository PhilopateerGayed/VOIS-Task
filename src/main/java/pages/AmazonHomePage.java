package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage extends BasePage {

    public final By continueButton = By.cssSelector(".a-button-text");
    public final By searchbar = By.cssSelector("[name = \"field-keywords\"");
    public final By searchbutton = By.cssSelector("[name = \"site-search\"] [type = \"submit\"] ");
    public final String expectedTitle = "Amazon.eg : car accessories";
    final By selectfirstitem = By.cssSelector(".s-search-results .s-title-instructions-style .s-link-style > h2");
    private final String amazon_url = "https://www.amazon.com/";

    //constructor
    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }
    //locators


    //methods
    public void goToHomePage(String url) {
        navigateTo(url);
    }

    public void waitForPageToLoad() {
        super.waitForVisible(selectfirstitem);
    }

    public String getHomepageTitle() {
        return driver.getTitle();
    }

    public void selectFirstItem() {
        driver.findElements(selectfirstitem).getFirst().click();
    }
}
