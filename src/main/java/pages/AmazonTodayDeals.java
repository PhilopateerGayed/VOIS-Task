package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTodayDeals extends BasePage {

    final By todayDeals = By.cssSelector("#nav-xshop>.nav-ul>.nav-li>.nav-div>a");
    final By sliderLocatorMin = By.cssSelector("input[type='range'][aria-label='Minimum Discount']");
    final By sliderLocatorMax = By.cssSelector("input[type='range'][aria-label='Maximum Discount']");
    final By seeMoreBtn = By.cssSelector("[data-tabulation-id=\"desktop-refinements\"]>div>button[aria-labelledby=\"see-more-departments-label\"]");
    final By electronicsCheckbox = By.cssSelector("[data-csa-c-element-id=\"filter-departments-Electronics\"]");
    final By checkItem = By.cssSelector("[data-testid=\"virtuoso-item-list\"]");
    final By randomItem = By.cssSelector("[data-testid=\"virtuoso-item-list\"]>[data-index=\"7\"] [data-test-index=\"31\"] [data-testid=\"product-card-link\"]");

    //constructor
    public AmazonTodayDeals(WebDriver driver) {
        super(driver);

    }


    //methods
    public void goToTodayDeals() {
        super.clickElement(todayDeals);
    }

    public void setSliderTo10Percent() {
        super.waitForVisible(todayDeals);
        WebElement min = driver.findElement(sliderLocatorMin);
        WebElement max = driver.findElement(sliderLocatorMax);
        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript(
                "var input = arguments[0], value = arguments[1];" +
                        "var lastValue = input.value;" +
                        "input.value = value;" +
                        "var event = new Event('input', { bubbles: true });" +
                        "event.simulated = true;" +
                        "var tracker = input._valueTracker;" +
                        "if (tracker) { tracker.setValue(lastValue); }" +
                        "input.dispatchEvent(event);",
                min, "10"
        );
        js.executeScript(
                "var input = arguments[0], value = arguments[1];" +
                        "var lastValue = input.value;" +
                        "input.value = value;" +
                        "var event = new Event('input', { bubbles: true });" +
                        "event.simulated = true;" +
                        "var tracker = input._valueTracker;" +
                        "if (tracker) { tracker.setValue(lastValue); }" +
                        "input.dispatchEvent(event);",
                max, "100"
        );

    }

    public void selectfilters() {
        super.clickElement(seeMoreBtn);
        super.clickElement(electronicsCheckbox);
    }

    public void scrollingDown() {
        super.waitForVisible(checkItem);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
    }

    public void selectRandomItem() {
        super.waitForVisible(randomItem);
        super.clickElement(randomItem);
    }
}
