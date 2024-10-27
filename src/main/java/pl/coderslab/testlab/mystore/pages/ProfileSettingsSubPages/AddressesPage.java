package pl.coderslab.testlab.mystore.pages.ProfileSettingsSubPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

import java.util.List;

public class AddressesPage {
    @FindBy(css = "section#content div:nth-child(2) a[data-link-action='edit-address']")
    private WebElement updateButton;
    @FindBy(css = "section#content div:nth-child(2) a[data-link-action='delete-address']")
    private WebElement deleteButton;
    @FindBy(css = "a[data-link-action='add-address']")
    private WebElement createNewAddressButton;
    @FindBy(css = "div[class='address-body']")
    private List<WebElement> addressList;
    @FindBy(css = "article[id*='address'] a:last-of-type")
    private List<WebElement> deleteButtonList;
    private final WebDriver driver;
    private int listSize;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickUpdateButton() {
        ElementHelper.clickButton(driver, updateButton);
    }

    public void clickDeleteButton() {
        ElementHelper.clickButton(driver, deleteButton);
    }

    public void clickCreateNewAddressButton() {
        ElementHelper.clickButton(driver, createNewAddressButton);
    }

    public boolean waitForArticleContains(String text) {
        WebElement lastAddress = addressList.getLast();
        String actualContent = lastAddress.getText();
        return actualContent.contains(text);
    }

    public void clickDeleteLastAddressButton() {
        WebElement lastArticle = deleteButtonList.getLast();
        ElementHelper.clickButton(driver, lastArticle);
    }

    public void addressListSize() {
        listSize = addressList.size();
    }

    public boolean checkForLastAddressWasDelete() {
        return addressList.size() == (listSize - 1);
    }
}