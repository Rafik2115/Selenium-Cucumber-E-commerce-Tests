package pl.coderslab.testlab.mystore.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class NavBarTop {
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href='https://mystore-testlab.coderslab.pl/index.php']")
    private WebElement homeButtonTop;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='my-account']")
    private WebElement yourAccountButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='addresses']")
    private WebElement addressesButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='history']")
    private WebElement orderHistoryButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='blockwishlist']")
    private WebElement myWishlistButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=3']")
    private WebElement clothesButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=4']")
    private WebElement menButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=5']")
    private WebElement womenButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=6']")
    private WebElement accessoriesButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=7']")
    private WebElement stationeryButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=8']")
    private WebElement homeAccessoriesButton;
    @FindBy(css = "nav[class='breadcrumb hidden-sm-down'] a[href*='category=9']")
    private WebElement artButton;
    private final WebDriver driver;

    public NavBarTop(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickHomeButtonTop() {
        ElementHelper.clickButton(driver, homeButtonTop);
    }

    public void clickYourAccountButton() {
        ElementHelper.clickButton(driver, yourAccountButton);
    }

    public void clickAddressesButton() {
        ElementHelper.clickButton(driver, addressesButton);
    }

    public void clickOrderHistoryButton() {
        ElementHelper.clickButton(driver, orderHistoryButton);
    }

    public void clickMyWishlistButton() {
        ElementHelper.clickButton(driver, myWishlistButton);
    }

    public void clickClothesButton() {
        ElementHelper.clickButton(driver, clothesButton);
    }

    public void clickMenButton() {
        ElementHelper.clickButton(driver, menButton);
    }

    public void clickWomenButton() {
        ElementHelper.clickButton(driver, womenButton);
    }

    public void clickAccessoriesButton() {
        ElementHelper.clickButton(driver, accessoriesButton);
    }

    public void clickStationeryButton() {
        ElementHelper.clickButton(driver, stationeryButton);
    }

    public void clickHomeAccessoriesButton() {
        ElementHelper.clickButton(driver, homeAccessoriesButton);
    }

    public void clickArtButton() {
        ElementHelper.clickButton(driver, artButton);
    }
}
