package pl.coderslab.testlab.mystore.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class NavBarBottom {
    @FindBy(css = "footer[class='page-footer'] a[href*='my-account']")
    private WebElement backToYourAccountButton;
    @FindBy(css = "footer[class='page-footer'] a[href='https://mystore-testlab.coderslab.pl/index.php']")
    private WebElement homeButtonBottom;
    private final WebDriver driver;

    public NavBarBottom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickBackToYourAccountButton() {
        ElementHelper.clickButton(driver, backToYourAccountButton);
    }

    public void clickHomeButtonBottom() {
        ElementHelper.clickButton(driver, homeButtonBottom);
    }
}
