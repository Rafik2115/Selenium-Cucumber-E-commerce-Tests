package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class LoginPage {
    @FindBy(css = "input#field-email")
    private WebElement emailInput;
    @FindBy(css = "input#field-password")
    private WebElement passwordInput;
    @FindBy(css = "input#field-password ~ span button")
    private WebElement showPasswordButton;
    @FindBy(css = "div.forgot-password a")
    private WebElement forgotPasswordButton;
    @FindBy(css = "button#submit-login")
    private WebElement signInButton;
    @FindBy(css = "div.no-account a")
    private WebElement createAccountButton;
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void typeEmailInput(String email) {
        ElementHelper.fillInput(driver, emailInput, email);
    }

    public void typePasswordInput(String password) {
        ElementHelper.fillInput(driver, passwordInput, password);
    }

    public void clickShowPasswordButton() {
        ElementHelper.clickButton(driver, showPasswordButton);
    }

    public void clickForgotPasswordButton() {
        ElementHelper.clickButton(driver, forgotPasswordButton);
    }

    public void clickSignInButton() {
        ElementHelper.clickButton(driver, signInButton);
    }

    public void clickCreateAccountButton() {
        ElementHelper.clickButton(driver, createAccountButton);
    }
}
