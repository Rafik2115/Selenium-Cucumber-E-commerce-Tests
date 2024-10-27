package pl.coderslab.testlab.mystore.pages.ProfileSettingsSubPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class MyWishlistsPage {
    @FindBy(css = "div.wishlist-container-header a.wishlist-add-to-new")
    private WebElement createNewListButton;
    @FindBy(css = "li.wishlist-list-item-default a.wishlist-list-item-link")
    private WebElement myWishlistButton;
    private final WebDriver driver;

    public MyWishlistsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickCreateNewListButton() {
        ElementHelper.clickButton(driver, createNewListButton);
    }

    public void clickMyWishlistButton() {
        ElementHelper.clickButton(driver, myWishlistButton);
    }
}
