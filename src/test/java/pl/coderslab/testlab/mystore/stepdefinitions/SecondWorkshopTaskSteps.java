package pl.coderslab.testlab.mystore.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.coderslab.testlab.mystore.helpers.ScreenshotHelper;
import pl.coderslab.testlab.mystore.hooks.Hooks;
import pl.coderslab.testlab.mystore.pages.*;
import pl.coderslab.testlab.mystore.pages.fragments.CartConfirmationPopup;
import pl.coderslab.testlab.mystore.pages.fragments.HeaderSection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SecondWorkshopTaskSteps {

    private final WebDriver driver = Hooks.getDriver();
    private String orderReference;
    private String paymentAmount;

    private ProductPage productPage;
    private CheckoutPage checkoutPage;

    @When("the user selects the {string} for purchase")
    public void theUserSelectsTheForPurchase(String productName) {
        HomePage homePage = new HomePage(driver);
        homePage.clickProductButton(productName);
    }

    @And("the discount is checked to be {int} percent")
    public void theDiscountIsCheckedToBePercent(int discount) {
        productPage = new ProductPage(driver);
        productPage.checkDiscountText(discount);
    }

    @And("the user selects size {string}")
    public void theUserSelectsSize(String size) {
        productPage.clickSizeSelect(size);
        productPage.waitForButtonIsNotDisabled();
    }

    @And("the user sets the quantity to {string}")
    public void theUserSetsTheQuantityTo(String quantity) {
        productPage.typeQuantityInput(quantity);
    }

    @And("the user adds the product to the cart")
    public void theUserAddsTheProductToTheCart() {
        productPage.clickAddToCartButton();
    }

    @And("the user proceeds to checkout")
    public void theUserProceedsToCheckout() {
        CartConfirmationPopup cartConfirmationPopup = new CartConfirmationPopup(driver);
        cartConfirmationPopup.clickProceedToCheckoutButton();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickProceedToCheckoutButton();
    }

    @And("the user confirms the address")
    public void theUserConfirmsTheAddress() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickContinueAddressesButton();
    }

    @And("the user chooses the {string} delivery method")
    public void theUserChoosesTheDeliveryMethod(String deliveryMethod) {
        checkoutPage.clickDeliveryButton(deliveryMethod);
        checkoutPage.clickContinueShippingMethodButton();
    }

    @And("the user selects the {string} payment option")
    public void theUserSelectsThePaymentOption(String paymentOption) {
        checkoutPage.clickPaymentOption(paymentOption);
    }

    @And("the user places the order with an obligation to pay")
    public void theUserPlacesTheOrderWithAnObligationToPay() {
        checkoutPage.clickIAgreeInput();
        checkoutPage.clickPlaceOrderButton();
    }

    @Then("the user takes a screenshot of the confirmation")
    public void theUserTakesAScreenshotOfTheConfirmation() {
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        ScreenshotHelper.takeScreenshot(driver, "target/screenshots/secondWorkshopTask", "confirmation_screenshot");
        orderReference = confirmationPage.getOrderReference();
        paymentAmount = confirmationPage.getPaymentAmount();
    }

    @And("the user verifies the order status in the history as {string}")
    public void theUserVerifiesTheOrderStatusInTheHistoryAs(String expectedStatus) {
        HeaderSection headerSection = new HeaderSection(driver);
        headerSection.clickAccountButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickOrderHistoryButton();
        WebElement row = driver.findElement(By.xpath("//tbody/tr[th[text()='" + orderReference + "']]"));
        WebElement tdElement = row.findElement(By.cssSelector("td.text-xs-right"));
        String actualAmount = tdElement.getText();
        assertEquals("The payment amount value is not as expected", paymentAmount, actualAmount);
        WebElement statusElement = row.findElement(By.cssSelector("td span.label.label-pill.bright"));
        String actualStatus = statusElement.getText();
        assertTrue("The order status is different than expected", actualStatus.contains(expectedStatus));
    }
}
