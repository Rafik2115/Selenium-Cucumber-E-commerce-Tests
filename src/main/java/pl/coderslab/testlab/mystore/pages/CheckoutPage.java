package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class CheckoutPage {
    @FindBy(css = "p.add-address a")
    private WebElement addNewAddressButton;
    @FindBy(css = "a[data-link-action='different-invoice-address']")
    private WebElement addressDifferenceButton;
    @FindBy(css = "section#checkout-addresses-step div.clearfix button")
    private WebElement continueAddressesButton;
    @FindBy(css = "span.carrier-delay")
    private WebElement deliveryButton;
    @FindBy(css = "textarea#delivery_message")
    private WebElement commentInput;
    @FindBy(css = "section#checkout-delivery-step form.clearfix button")
    private WebElement continueShippingMethodButton;
    @FindBy(css = "div.payment-options label span")
    private WebElement paymentButton;
    @FindBy(css = "span.custom-checkbox input")
    private WebElement iAgreeInput;
    @FindBy(css = "div#payment-confirmation button")
    private WebElement placeOrderButton;
    @FindBy(css = "a.js-show-details")
    private WebElement showDetailsButton;
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickAddNewAddressButton() {
        ElementHelper.clickButton(driver, addNewAddressButton);
    }

    public void clickAddressDifferenceButton() {
        ElementHelper.clickButton(driver, addressDifferenceButton);
    }

    public void clickContinueAddressesButton() {
        ElementHelper.clickButton(driver, continueAddressesButton);
    }

    public void typeCommentInput(String comment) {
        ElementHelper.fillInput(driver, commentInput, comment);
    }

    public void clickContinueShippingMethodButton() {
        ElementHelper.clickButton(driver, continueShippingMethodButton);
    }

    public void clickIAgreeInput() {
        iAgreeInput.click();
    }

    public void clickPlaceOrderButton() {
        ElementHelper.clickButton(driver, placeOrderButton);
    }

    public void clickShowDetailsButton() {
        ElementHelper.clickButton(driver, showDetailsButton);
    }

    public void clickDeliveryButton(String deliveryMethod) {
        ElementHelper.clickButton(driver, deliveryButton, deliveryMethod);
    }

    public void clickPaymentOption(String paymentOption) {
        ElementHelper.clickButton(driver, paymentButton, paymentOption);
    }
}
