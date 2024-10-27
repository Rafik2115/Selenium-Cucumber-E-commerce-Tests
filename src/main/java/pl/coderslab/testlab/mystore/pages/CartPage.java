package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class CartPage {
    @FindBy(css = "div.product-line-info a")
    private WebElement productLinkButton;
    @FindBy(css = "input.js-cart-line-product-quantity")
    private WebElement quantityInput;
    @FindBy(css = "button.js-increase-product-quantity")
    private WebElement quantityIncreaseButton;
    @FindBy(css = "button.js-decrease-product-quantity")
    private WebElement quantityDecreaseButton;
    @FindBy(css = "div.cart-line-product-actions a")
    private WebElement removeProductButton;
    @FindBy(css = "div.checkout a")
    private WebElement proceedToCheckoutButton;
    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickProductLinkButton() {
        ElementHelper.clickButton(driver, productLinkButton);
    }

    public void typeQuantityInput(String quantity) {
        ElementHelper.fillInput(driver, quantityInput, quantity);
    }

    public void clickQuantityIncreaseButton() {
        ElementHelper.clickButton(driver, quantityIncreaseButton);
    }

    public void clickQuantityDecreaseButton() {
        ElementHelper.clickButton(driver, quantityDecreaseButton);
    }

    public void clickRemoveProductButton() {
        ElementHelper.clickButton(driver, removeProductButton);
    }

    public void clickProceedToCheckoutButton() {
        ElementHelper.clickButton(driver, proceedToCheckoutButton);
    }
}
