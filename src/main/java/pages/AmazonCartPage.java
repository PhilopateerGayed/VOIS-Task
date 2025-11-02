package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonCartPage extends BasePage {
    final By subtotaltext = By.id("sc-subtotal-label-activecart");

    //constructor
    public AmazonCartPage(WebDriver driver) {
        super(driver);
    }

    //methods
    public boolean checkItem() {
        try {
            return driver.findElement(subtotaltext).getText().equals("Subtotal (1 item):");
        } catch (Exception e) {
            return false;
        }
    }
}
