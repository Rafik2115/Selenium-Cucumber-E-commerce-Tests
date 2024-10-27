package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;
import pl.coderslab.testlab.mystore.helpers.SeleniumHelper;

public class ConfirmationPage {
    @FindBy(css = "li#order-reference-value")
    private WebElement OrderReferenceElement;
    @FindBy(css = "span.price strong")
    private WebElement PaymentAmount;
    private final WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        SeleniumHelper.waitForPageLoaded(driver, By.cssSelector("section#content-hook_order_confirmation"));
        PageFactory.initElements(this.driver, this);
    }
    public String getOrderReference(){
        String fullText = ElementHelper.getText(driver,OrderReferenceElement);
        return fullText.split(": ")[1];
    }
    public String getPaymentAmount(){
        return ElementHelper.getText(driver,PaymentAmount);
    }
}
