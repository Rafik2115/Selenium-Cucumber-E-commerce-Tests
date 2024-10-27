package pl.coderslab.testlab.mystore.pages.ProfileSettingsSubPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class AddressesSubPage {
    @FindBy(css = "input#field-alias")
    private WebElement aliasInput;
    @FindBy(css = "input#field-alias")
    private WebElement firstNameInput;
    @FindBy(css = "input#field-lastname")
    private WebElement lastNameInput;
    @FindBy(css = "input#field-company")
    private WebElement companyInput;
    @FindBy(css = "input#field-vat_number")
    private WebElement vatNumberInput;
    @FindBy(css = "input#field-address1")
    private WebElement addressInput;
    @FindBy(css = "input#field-address2")
    private WebElement addressComplementInput;
    @FindBy(css = "input#field-city")
    private WebElement cityInput;
    @FindBy(css = "input#field-postcode")
    private WebElement postalCodeInput;
    @FindBy(css = "select#field-id_country")
    private WebElement countrySelect;
    @FindBy(css = "input#field-phone")
    private WebElement phoneInput;
    @FindBy(css = "section#content button")
    private WebElement saveButton;
    private final WebDriver driver;

    public AddressesSubPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void typeAliasInput(String alias) {
        ElementHelper.fillInput(driver, aliasInput, alias);
    }

    public void typeFirstNameInput(String firstName) {
        ElementHelper.fillInput(driver, firstNameInput, firstName);
    }

    public void typeLastNameInput(String lastName) {
        ElementHelper.fillInput(driver, lastNameInput, lastName);
    }

    public void typeCompanyInput(String company) {
        ElementHelper.fillInput(driver, companyInput, company);
    }

    public void typeVatNumberInput(String vatNumber) {
        ElementHelper.fillInput(driver, vatNumberInput, vatNumber);
    }

    public void typeAddressInput(String address) {
        ElementHelper.fillInput(driver, addressInput, address);
    }

    public void typeAddressComplementInput(String addressComplement) {
        ElementHelper.fillInput(driver, addressComplementInput, addressComplement);
    }

    public void typeCityInput(String city) {
        ElementHelper.fillInput(driver, cityInput, city);
    }

    public void typePostalCodeInput(String postalCode) {
        ElementHelper.fillInput(driver, postalCodeInput, postalCode);
    }

    public void typePhoneInput(String phone) {
        ElementHelper.fillInput(driver, phoneInput, phone);
    }

    public void clickSaveButton() {
        ElementHelper.clickButton(driver, saveButton);
    }
    public void clickCountrySelect(String country){
        ElementHelper.clickSelect(driver,countrySelect, country);
    }
}
