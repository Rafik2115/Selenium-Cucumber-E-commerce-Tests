package pl.coderslab.testlab.mystore.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class searchBarAutocompletePopup {
    @FindBy(css = "a#ui-id-124")
    private WebElement firstButton;
    @FindBy(css = "a#ui-id-125")
    private WebElement secondButton;
    @FindBy(css = "a#ui-id-126")
    private WebElement thirdButton;
    @FindBy(css = "a#ui-id-127")
    private WebElement fourthButton;
    @FindBy(css = "a#ui-id-128")
    private WebElement fifthButton;
    @FindBy(css = "a#ui-id-129")
    private WebElement sixthButton;
    @FindBy(css = "a#ui-id-130")
    private WebElement seventhButton;
    private final WebDriver driver;

    public searchBarAutocompletePopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickFirstButton() {
        ElementHelper.clickButton(driver, firstButton);
    }

    public void clickSecondButton() {
        ElementHelper.clickButton(driver, secondButton);
    }

    public void clickThirdButton() {
        ElementHelper.clickButton(driver, thirdButton);
    }

    public void clickFourthButton() {
        ElementHelper.clickButton(driver, fourthButton);
    }

    public void clickFifthButton() {
        ElementHelper.clickButton(driver, fifthButton);
    }

    public void clickSixthButton() {
        ElementHelper.clickButton(driver, sixthButton);
    }

    public void clickSeventhButton() {
        ElementHelper.clickButton(driver, seventhButton);
    }
}
