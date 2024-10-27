package pl.coderslab.testlab.mystore.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class CartConfirmationPopup {
    @FindBy(css = "div#blockcart-modal button[class='close']")
    private WebElement closeButton;
    @FindBy(css = "div#blockcart-modal button[class='btn btn-secondary']")
    private WebElement continueShoppingButton;
    @FindBy(css = "div#blockcart-modal a[class='btn btn-primary']")
    private WebElement proceedToCheckoutButton;
    private final WebDriver driver;

    public CartConfirmationPopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickCloseButton() {
        ElementHelper.clickButton(driver, closeButton);
    }

    public void clickContinueShoppingButton() {
        ElementHelper.clickButton(driver, continueShoppingButton);
    }

    public void clickProceedToCheckoutButton() {
        ElementHelper.clickButton(driver, proceedToCheckoutButton);
    }
}
