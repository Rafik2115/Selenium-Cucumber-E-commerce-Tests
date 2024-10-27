package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class MyAccountPage {
    @FindBy(css = "a#identity-link")
    private WebElement informationButton;
    @FindBy(css = "a#address-link")
    private WebElement addFirstAddressButton;
    @FindBy(css = "a#addresses-link")
    private WebElement addressesButton;
    @FindBy(css = "a#history-link")
    private WebElement orderHistoryButton;
    @FindBy(css = "a#order-slips-link")
    private WebElement creditSlipsButton;
    @FindBy(css = "a#wishlist-link")
    private WebElement myWishlistsButton;
    @FindBy(css = "div.text-sm-center a")
    private WebElement signOutButton;
    private final WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickInformationButton() {
        ElementHelper.clickButton(driver, informationButton);
    }

    public void clickAddFirstAddressButton() {
        ElementHelper.clickButton(driver, addFirstAddressButton);
    }

    public void clickAddressesButton() {
        ElementHelper.clickButton(driver, addressesButton);
    }

    public void clickOrderHistoryButton() {
        ElementHelper.clickButton(driver, orderHistoryButton);
    }

    public void clickCreditSlipsButton() {
        ElementHelper.clickButton(driver, creditSlipsButton);
    }

    public void clickMyWishlistsButton() {
        ElementHelper.clickButton(driver, myWishlistsButton);
    }

    public void clickSignOutButton() {
        ElementHelper.clickButton(driver, signOutButton);
    }
}
