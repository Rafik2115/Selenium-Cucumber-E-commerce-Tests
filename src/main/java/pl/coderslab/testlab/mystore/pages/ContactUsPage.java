package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class ContactUsPage {
    @FindBy(css = "select#id_contact option[value='2']")
    private WebElement customerServiceButton;
    @FindBy(css = "select#id_contact option[value='1']")
    private WebElement webmasterButton;
    @FindBy(css = "input#email")
    private WebElement emailInput;
    //    @FindBy(css = "select#id-order option[value='value']")
//    private WebElement orderReference;
    @FindBy(css = "textarea#contactform-message")
    private WebElement messageInput;
    @FindBy(css = "footer[class='form-footer text-sm-right'] input.btn")
    private WebElement sendButton;
    private final WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickCustomerServiceButton() {
        ElementHelper.clickButton(driver, customerServiceButton);
    }

    public void clickWebmasterButton() {
        ElementHelper.clickButton(driver, webmasterButton);
    }

    public void typeEmailInput(String email) {
        ElementHelper.fillInput(driver, emailInput, email);
    }

    public void typeMessageInput(String message) {
        ElementHelper.fillInput(driver, messageInput, message);
    }

    public void clickSendButton() {
        ElementHelper.clickButton(driver, sendButton);
    }
}
