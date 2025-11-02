package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonProductPage extends BasePage {
    final By addtocart = By.cssSelector("[id = \"add-to-cart-button\"]");
    final By cartIcon = By.id("nav-cart");

    public AmazonProductPage(WebDriver driver) {
        super(driver);
    }

    public void addItemToCart() {
        super.clickElement(addtocart);
    }

    public void openCart() {
        super.clickElement(cartIcon);
    }
}
