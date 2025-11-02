package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KsrtcPaymentPage extends BasePage {

    final By paymentMethod = By.cssSelector(".pay-opts-item:nth-of-type(1)");
    final By checkBox = By.cssSelector(".checkout_tandc >div >.checkbox ");

    public KsrtcPaymentPage(WebDriver driver) {
        super(driver);
    }

    public void selectPaymentMethod() {
        super.waitForVisible(paymentMethod);
        super.clickElement(paymentMethod);
        super.clickElement(checkBox);
    }
}
