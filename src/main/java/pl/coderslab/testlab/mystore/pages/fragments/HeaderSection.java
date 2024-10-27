package pl.coderslab.testlab.mystore.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class HeaderSection {
    @FindBy(css = "div#contact-link a")
    private WebElement contactUsButton;
    @FindBy(css = "button[class='hidden-sm-down btn-unstyle']")
    private WebElement currencyDropdownButton;
    @FindBy(css = "div#_desktop_currency_selector a[title='Euro']")
    private WebElement euroButton; //from currencyDropdownButton
    @FindBy(css = "a[title='US Dollar']")
    private WebElement dollarButton; //from currencyDropdownButton
    @FindBy(css = "a[title='Log in to your customer account']")
    private WebElement signInButton;
    @FindBy(css = "a[class='logout hidden-sm-down']")
    private WebElement signOutButton;
    @FindBy(css = "a[class='account']")
    private WebElement accountButton;
    @FindBy(css = "div[class='blockcart cart-preview active'] a")
    private WebElement cartButton;
    @FindBy(css = "div#_desktop_logo a")
    private WebElement logoButton;
    @FindBy(css = "li#category-3 a")
    private WebElement clothesDropdownButton;
    @FindBy(css = "li#category-4 a")
    private WebElement menButton; //from clothesDropdownButton
    @FindBy(css = "li#category-5 a")
    private WebElement womenButton; //from clothesDropdownButton
    @FindBy(css = "li#category-6 a")
    private WebElement accessoriesDropdownButton;
    @FindBy(css = "li#category-7 a")
    private WebElement stationeryButton; //from accessoriesDropdownButton
    @FindBy(css = "li#category-8 a")
    private WebElement homeAccessoriesButton; //from accessoriesDropdownButton
    @FindBy(css = "li#category-9 a")
    private WebElement artButton;
    @FindBy(css = "input[class='ui-autocomplete-input']")
    private WebElement searchInput;
    private final WebDriver driver;

    public HeaderSection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickContactUsButton() {
        ElementHelper.clickButton(driver, contactUsButton);
    }

    public void clickCurrencyDropdownButton() {
        ElementHelper.clickButton(driver, currencyDropdownButton);
    }

    public void clickEuroButton() {
        ElementHelper.clickButton(driver, euroButton);
    }

    public void clickDollarButton() {
        ElementHelper.clickButton(driver, dollarButton);
    }

    public void clickSignInButton() {
        ElementHelper.clickButton(driver, signInButton);
    }

    public void clickSignOutButton() {
        ElementHelper.clickButton(driver, signOutButton);
    }

    public void clickAccountButton() {
        ElementHelper.clickButton(driver, accountButton);
    }

    public void clickCartButton() {
        ElementHelper.clickButton(driver, cartButton);
    }

    public void clickLogoButton() {
        ElementHelper.clickButton(driver, logoButton);
    }

    public void clickClothesDropdownButton() {
        ElementHelper.clickButton(driver, clothesDropdownButton);
    }

    public void clickMenButton() {
        ElementHelper.clickButton(driver, menButton);
    }

    public void clickWomenButton() {
        ElementHelper.clickButton(driver, womenButton);
    }

    public void clickAccessoriesDropdownButton() {
        ElementHelper.clickButton(driver, accessoriesDropdownButton);
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

    public void typeSearchInput(String text) {
        ElementHelper.fillInput(driver, searchInput, text);
    }

}
