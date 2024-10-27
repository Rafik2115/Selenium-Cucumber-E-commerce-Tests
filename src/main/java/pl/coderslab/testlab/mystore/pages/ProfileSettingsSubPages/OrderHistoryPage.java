package pl.coderslab.testlab.mystore.pages.ProfileSettingsSubPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class OrderHistoryPage {
    @FindBy(css = "table a[href*='detail']")
    private WebElement detailsButton;
    @FindBy(css = "table a[href*='Reorder']")
    private WebElement reorderButton;
    private final WebDriver driver;

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickDetailsButton() {
        ElementHelper.clickButton(driver, detailsButton);
    }

    public void clickReorderButton() {
        ElementHelper.clickButton(driver, reorderButton);
    }
}
