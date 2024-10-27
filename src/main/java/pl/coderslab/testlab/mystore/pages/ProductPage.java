package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

import java.time.Duration;

public class ProductPage {
    @FindBy(css = "select#group_1")
    private WebElement sizeSelect;
    @FindBy(css = "input#quantity_wanted")
    private WebElement quantityInput;
    @FindBy(css = "button.bootstrap-touchspin-up")
    private WebElement quantityIncreaseButton;
    @FindBy(css = "button.bootstrap-touchspin-down")
    private WebElement quantityDecreaseButton;
    @FindBy(css = "button.add-to-cart")
    private WebElement addToCartButton;
    @FindBy(css = "button.wishlist-button-product")
    private WebElement addToWishListButton;
    @FindBy(css = "li.facebook a")
    private WebElement facebookLinkShareButton;
    @FindBy(css = "li.twitter a")
    private WebElement twitterLinkShareButton;
    @FindBy(css = "li.pinterest a")
    private WebElement pinterestLinkShareButton;
    @FindBy(css = "div.tabs li:first-of-type a")
    private WebElement descriptionButton;
    @FindBy(css = "div.tabs li:nth-of-type(2) a")
    private WebElement productDetailsButton;
    @FindBy(css = "button.post-product-comment")
    private WebElement reviewButton;
    @FindBy(css = "div.product-container span.discount-percentage")
    private WebElement discountElement;
    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickSizeSelect(String size) {
        ElementHelper.clickSelect(driver, sizeSelect, size);
    }

    public void typeQuantityInput(String quantity) {
        ElementHelper.fillInputWithJavaScript(driver, quantityInput, quantity);
    }

    public void clickQuantityIncreaseButton() {
        ElementHelper.clickButton(driver, quantityIncreaseButton);
    }

    public void clickQuantityDecreaseButton() {
        ElementHelper.clickButton(driver, quantityDecreaseButton);
    }

    public void clickAddToCartButton() {
        ElementHelper.clickButton(driver, addToCartButton);
    }

    public void clickAddToWishListButton() {
        ElementHelper.clickButton(driver, addToWishListButton);
    }

    public void clickFacebookLinkShareButton() {
        ElementHelper.clickButton(driver, facebookLinkShareButton);
    }

    public void clickTwitterLinkShareButton() {
        ElementHelper.clickButton(driver, twitterLinkShareButton);
    }

    public void clickPinterestLinkShareButton() {
        ElementHelper.clickButton(driver, pinterestLinkShareButton);
    }

    public void clickDescriptionButton() {
        ElementHelper.clickButton(driver, descriptionButton);
    }

    public void clickProductDetailsButton() {
        ElementHelper.clickButton(driver, productDetailsButton);
    }

    public void clickReviewButton() {
        ElementHelper.clickButton(driver, reviewButton);
    }

    public void checkDiscountText(int discountPercent) {
        String discountText = ElementHelper.getText(driver,discountElement);
        if (!discountText.contains(discountPercent + "%")) {
            throw new AssertionError("Discount is not " + discountPercent + "%");
        }
    }

    public void waitForButtonIsNotDisabled() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
    }
}
