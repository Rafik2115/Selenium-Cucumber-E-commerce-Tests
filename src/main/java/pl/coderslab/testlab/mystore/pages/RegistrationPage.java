package pl.coderslab.testlab.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class RegistrationPage {
    @FindBy(css = "input#field-id_gender-1")
    private WebElement mrButton;
    @FindBy(css = "input#field-id_gender-2")
    private WebElement mrsButton;
    @FindBy(css = "input#field-firstname")
    private WebElement firstNameInput;
    @FindBy(css = "input#field-lastname")
    private WebElement lastNameInput;
    @FindBy(css = "input#field-email")
    private WebElement emailInput;
    @FindBy(css = "input#field-password")
    private WebElement passwordInput;
    @FindBy(css = "input#field-password ~ span button")
    private WebElement showPasswordButton;
    @FindBy(css = "input#field-birthday")
    private WebElement birthdateInput;
    //consent section
    @FindBy(css = "input[name='optin']")
    private WebElement receiveOffersFromOurPartnersButton;
    @FindBy(css = "input[name='customer_privacy']")
    private WebElement customerDataPrivacyButton;
    @FindBy(css = "input[name='newsletter']")
    private WebElement signUpForOurNewsletterButton;
    @FindBy(css = "input[name='psgdpr']")
    private WebElement iAgreePrivacyPolicyButton;
    @FindBy(css = "input[name='submitCreate'] ~ button")
    private WebElement saveButton;
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickMrButton() {
        ElementHelper.clickButton(driver, mrButton);
    }

    public void clickMrsButton() {
        ElementHelper.clickButton(driver, mrsButton);
    }

    public void typeFirstNameInput(String firstName) {
        ElementHelper.fillInput(driver, firstNameInput, firstName);
    }

    public void typeLastNameInput(String lastName) {
        ElementHelper.fillInput(driver, lastNameInput, lastName);
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

    public void typeBirthdateInput(String birthdate) {
        ElementHelper.fillInput(driver, birthdateInput, birthdate);
    }

    public void clickReceiveOffersFromOurPartnersButton() {
        ElementHelper.clickButton(driver, receiveOffersFromOurPartnersButton);
    }

    public void clickCustomerDataPrivacyButton() {
        ElementHelper.clickButton(driver, customerDataPrivacyButton);
    }

    public void clickSignUpForOurNewsletterButton() {
        ElementHelper.clickButton(driver, signUpForOurNewsletterButton);
    }

    public void clickIAgreePrivacyPolicyButton() {
        ElementHelper.clickButton(driver, iAgreePrivacyPolicyButton);
    }

    public void clickSaveButton() {
        ElementHelper.clickButton(driver, saveButton);
    }
}
