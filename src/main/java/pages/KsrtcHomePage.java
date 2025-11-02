package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class KsrtcHomePage extends BasePage {

    final By frombutton = By.id("fromCity_chosen");
    final By fromInput = By.cssSelector("#fromCity_chosen > div > div.chosen-search > input[type=text]");
    final By tobutton = By.id("toCity_chosen");
    final By toInput = By.cssSelector("#toCity_chosen > div > div.chosen-search > input[type=text]");
    final By dateButton = By.id("departDate");
    final By searchbtn = By.cssSelector(".top--wrap>.search--btn--wrap>.search--btn");

    public KsrtcHomePage(WebDriver driver) {
        super(driver);
    }

    private String returnDate(String date) {
        if (date == null || date.length() < 2) {
            return date; // return as-is if null or shorter than 2 chars
        }
        return date.substring(0, 2);
    }

    public void goToKsrtcHomePage() {
        super.navigateTo("https://ksrtc.in/oprs-web/");
    }

    public void enterFromAndToCity(String fromCity, String toCity) {
        super.clickElement(frombutton);
        super.sendKeysToElement(fromInput, fromCity);
        super.sendKeysToElement(fromInput, Keys.ENTER.toString());
        super.clickElement(tobutton);
        super.sendKeysToElement(toInput, toCity);
        super.sendKeysToElement(toInput, Keys.ENTER.toString());


    }

    public void enterDate(String date) {
        String day = returnDate(date);
        By dateInput = By.xpath("//a[text()='" + day + "']");
        driver.findElement(dateButton).click();
        driver.findElement(dateInput).click();
    }

    public void clickSearchBtn() {
        super.clickElement(searchbtn);
    }


}
