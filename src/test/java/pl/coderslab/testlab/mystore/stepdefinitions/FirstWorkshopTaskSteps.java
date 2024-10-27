package pl.coderslab.testlab.mystore.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pl.coderslab.testlab.mystore.hooks.Hooks;
import pl.coderslab.testlab.mystore.pages.LoginPage;
import pl.coderslab.testlab.mystore.pages.MyAccountPage;
import pl.coderslab.testlab.mystore.pages.ProfileSettingsSubPages.AddressesPage;
import pl.coderslab.testlab.mystore.pages.ProfileSettingsSubPages.AddressesSubPage;
import pl.coderslab.testlab.mystore.pages.fragments.HeaderSection;

import java.util.Map;

public class FirstWorkshopTaskSteps {

    private final WebDriver driver = Hooks.getDriver();

    private AddressesPage addressesPage;
    private AddressesSubPage addressesSubPage;

    @Given("the homepage is opened")
    public void theHomepageIsOpened() {
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @And("the user is logged in with email {string} and password {string}")
    public void theUserIsLoggedInWithEmailAndPassword(String email, String password) {
        HeaderSection headerSection = new HeaderSection(driver);
        headerSection.clickSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeEmailInput(email);
        loginPage.typePasswordInput(password);
        loginPage.clickSignInButton();
    }

    @When("the user clicks on the {string} tile")
    public void theUserClicksOnTheTile(String arg0) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickAddressesButton();
    }

    @Then("the user should be on the page {string}")
    public void theUserShouldBeOnThePage(String arg0) {
        addressesPage = new AddressesPage(driver);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The URL is invalid", arg0, actualUrl);
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
        addressesPage.clickCreateNewAddressButton();
    }

    @And("the user fills in the new address form with:")
    public void theUserFillsInTheNewAddressFormWith(Map<String, String> formData) {
        addressesSubPage = new AddressesSubPage(driver);
        String alias = formData.get("alias");
        String address = formData.get("address");
        String city = formData.get("city");
        String zipCode = formData.get("zip code");
        String country = formData.get("country");
        String phone = formData.get("phone");
        addressesSubPage.typeAliasInput(alias);
        addressesSubPage.typeAddressInput(address);
        addressesSubPage.typeCityInput(city);
        addressesSubPage.typePostalCodeInput(zipCode);
        addressesSubPage.clickCountrySelect(country);
        addressesSubPage.typePhoneInput(phone);
    }

    @And("the user saves the new address")
    public void theUserSavesTheNewAddress() {
        addressesSubPage.clickSaveButton();
    }

    @Then("the new address should be displayed in the list of addresses and match the entered data:")
    public void theNewAddressShouldBeDisplayedInTheListOfAddressesAndMatchTheEnteredData(Map<String, String> formData) {
        String alias = formData.get("alias");
        String address = formData.get("address");
        String city = formData.get("city");
        String zipCode = formData.get("zip code");
        String country = formData.get("country");
        String phone = formData.get("phone");
        Assert.assertTrue("The last address did not contain the expected text!", addressesPage.waitForArticleContains(alias));
        Assert.assertTrue("The last address did not contain the expected text!", addressesPage.waitForArticleContains(address));
        Assert.assertTrue("The last address did not contain the expected text!", addressesPage.waitForArticleContains(city));
        Assert.assertTrue("The last address did not contain the expected text!", addressesPage.waitForArticleContains(zipCode));
        Assert.assertTrue("The last address did not contain the expected text!", addressesPage.waitForArticleContains(country));
        Assert.assertTrue("The last address did not contain the expected text!", addressesPage.waitForArticleContains(phone));
    }

    @When("the user deletes the address by clicking on delete")
    public void theUserDeletesTheAddressByClickingOnDelete() {
        addressesPage.addressListSize();
        addressesPage.clickDeleteLastAddressButton();
    }

    @Then("the address should no longer be present in the list of addresses")
    public void theAddressShouldNoLongerBePresentInTheListOfAddresses() {
        Assert.assertTrue("the last address was not deleted",addressesPage.checkForLastAddressWasDelete());
    }
}
