package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class HomePage {
    @FindBy(css = "div#carousel a.left")
    private WebElement bannerSwipeLeftButton;
    @FindBy(css = "div#carousel a.right")
    private WebElement bannerSwipeRightButton;
    @FindBy(css = "div#carousel li:first-of-type a")
    private WebElement bannerButton;
    @FindBy(xpath = "//a[contains(text(),'Hummingbird printed t-shirt')]")
    private WebElement firstPopularProductButton;
    @FindBy(xpath = "//a[contains(text(),'Hummingbird printed sweater')]")
    private WebElement secondPopularProductButton;
    @FindBy(css = "h3.h3.product-title a")
    private WebElement productButton;
    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void clickBannerSwipeLeftButton() {
        ElementHelper.clickButton(driver,bannerSwipeLeftButton);
    }
    public void clickBannerSwipeRightButton() {
        ElementHelper.clickButton(driver,bannerSwipeRightButton);
    }
    public void clickBannerButton() {
        ElementHelper.clickButton(driver,bannerButton);
    }
    public void clickFirstPopularProductButton() {
        ElementHelper.clickButton(driver,firstPopularProductButton);
    }
    public void clickSecondPopularProductButton() {
        ElementHelper.clickButton(driver,secondPopularProductButton);
    }
    public void clickProductButton(String productName){
        ElementHelper.clickButton(driver,productButton, productName);
    }
}