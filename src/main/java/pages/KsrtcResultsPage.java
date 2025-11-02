package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KsrtcResultsPage extends BasePage {

    final By selectseatbtn = By.className("selectbutton");
    final By seat = By.cssSelector("div.seatchart > div.seat-wrap > div.seats > div > div:nth-child(3) > div:nth-child(9)");
    final By pickpoint = By.className("pick--val");
    final By droppointbtn = By.cssSelector(".points [tabindex = \"1\"]");
    final By droppoint = By.className("drop--val");
    final By datePassBtn = By.className("btnPassDetails");
    final By mobileField = By.cssSelector("[name= \"mobileNo\"]");
    final By emailField = By.cssSelector("[name= \"email\"]");
    final By proceedBtn = By.cssSelector(".block > .navswitchbtn ");
    final By nameField = By.cssSelector("[placeholder=\"Name\"]");
    final By genderDropdown = By.cssSelector("[name=\"paxGender[0]\"]");
    final By genderSearch = By.className("checkout--drop--inp");
    final By ageField = By.cssSelector("[name=\"paxAge[0]\"]");


    //constructor
    public KsrtcResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSelectSeatBtn() {
        super.waitForVisible(selectseatbtn);
        (driver.findElements(selectseatbtn).getFirst()).click();
    }

    public void selectSeat() {
        super.waitForVisible(seat);
        super.clickElement(seat);
    }

    public void selectPoints() {
        super.waitForVisible(pickpoint);
        super.clickElement(pickpoint);
        super.clickElement(droppointbtn);
        super.waitForVisible(droppoint);
        super.clickElement(droppoint);
        super.clickElement(datePassBtn);

    }

    public void enterMobileNumberAndEmail(String phone, String email) {
        super.waitForVisible(mobileField);
        super.sendKeysToElement(mobileField, phone);
        super.sendKeysToElement(emailField, email);
        super.waitForVisible(proceedBtn);
        super.clickElement(proceedBtn);

    }

    public void enterPassengerDetails(String name, String gender, String age) {
        super.waitForVisible(nameField);
        super.sendKeysToElement(nameField, name);
        super.clickElement(genderDropdown);
        super.sendKeysToElement(genderSearch, gender);
        super.sendKeysToElement(genderSearch, Keys.ENTER.toString());
        super.sendKeysToElement(ageField, age);
        super.waitForVisible(proceedBtn);
        super.clickElement(proceedBtn);

    }


}
