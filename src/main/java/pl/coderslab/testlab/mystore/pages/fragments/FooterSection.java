package pl.coderslab.testlab.mystore.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.coderslab.testlab.mystore.helpers.ElementHelper;

public class FooterSection {
    //newsletter section
    @FindBy(css = "footer#footer div[class='input-wrapper'] input")
    private WebElement emailInput;
    @FindBy(css = "footer#footer input[class='btn btn-primary float-xs-right hidden-xs-down']")
    private WebElement subscribeButton;
    //Products section
    @FindBy(css = "a#link-product-page-prices-drop-1")
    private WebElement pricesDropButton;
    @FindBy(css = "a#link-product-page-new-products-1")
    private WebElement newProductsButton;
    @FindBy(css = "a#link-product-page-best-sales-1")
    private WebElement bestSalesButton;
    //Our company section
    @FindBy(css = "a#link-cms-page-1-2")
    private WebElement deliveryButton;
    @FindBy(css = "a#link-cms-page-2-2")
    private WebElement legalNoticeButton;
    @FindBy(css = "a#link-cms-page-3-2")
    private WebElement termsAndConditionsOfUseButton;
    @FindBy(css = "a#link-cms-page-4-2")
    private WebElement aboutUsButton;
    @FindBy(css = "a#link-cms-page-5-2")
    private WebElement securePaymentButton;
    @FindBy(css = "a#link-static-page-contact-2")
    private WebElement contactUsButton;
    @FindBy(css = "a#link-static-page-sitemap-2")
    private WebElement sitemapButton;
    @FindBy(css = "a#link-static-page-stores-2")
    private WebElement storesButton;
    //Your account section
    @FindBy(css = "footer#footer p[class='h3 myaccount-title hidden-sm-down'] a")
    private WebElement yourAccountButton;
    @FindBy(css = "footer#footer a[href*='identity']")
    private WebElement personalInfoButton;
    @FindBy(css = "footer#footer a[href*='history']")
    private WebElement ordersButton;
    @FindBy(css = "footer#footer a[href*='order-slip']")
    private WebElement creditSlipsButton;
    @FindBy(css = "footer#footer a[href*='addresses']")
    private WebElement addressesButton;
    @FindBy(css = "footer#footer a[href*='lists']")
    private WebElement wishlistButton;
    //Store information section
    @FindBy(css = "div#contact-infos a")
    private WebElement emailInformationButton;
    //Copyright section
    @FindBy(css = "footer#footer p[class='text-sm-center'] a")
    private WebElement copyrightButton;
    private final WebDriver driver;

    public FooterSection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void typeEmailInput(String email) {
        ElementHelper.fillInput(driver, emailInput, email);
    }

    public void clickSubscribeButton() {
        ElementHelper.clickButton(driver, subscribeButton);
    }

    public void clickPricesDropButton() {
        ElementHelper.clickButton(driver, pricesDropButton);
    }

    public void clickNewProductsButton() {
        ElementHelper.clickButton(driver, newProductsButton);
    }

    public void clickBestSalesButton() {
        ElementHelper.clickButton(driver, bestSalesButton);
    }

    public void clickDeliveryButton() {
        ElementHelper.clickButton(driver, deliveryButton);
    }

    public void clickLegalNoticeButton() {
        ElementHelper.clickButton(driver, legalNoticeButton);
    }

    public void clickTermsAndConditionsOfUseButton() {
        ElementHelper.clickButton(driver, termsAndConditionsOfUseButton);
    }

    public void clickAboutUsButton() {
        ElementHelper.clickButton(driver, aboutUsButton);
    }

    public void clickSecurePaymentButton() {
        ElementHelper.clickButton(driver, securePaymentButton);
    }

    public void clickContactUsButton() {
        ElementHelper.clickButton(driver, contactUsButton);
    }

    public void clickSitemapButton() {
        ElementHelper.clickButton(driver, sitemapButton);
    }

    public void clickStoresButton() {
        ElementHelper.clickButton(driver, storesButton);
    }

    public void clickYourAccountButton() {
        ElementHelper.clickButton(driver, yourAccountButton);
    }

    public void clickPersonalInfoButton() {
        ElementHelper.clickButton(driver, personalInfoButton);
    }

    public void clickOrdersButton() {
        ElementHelper.clickButton(driver, ordersButton);
    }

    public void clickCreditSlipsButton() {
        ElementHelper.clickButton(driver, creditSlipsButton);
    }

    public void clickAddressesButton() {
        ElementHelper.clickButton(driver, addressesButton);
    }

    public void clickWishlistButton() {
        ElementHelper.clickButton(driver, wishlistButton);
    }

    public void clickEmailInformationButton() {
        ElementHelper.clickButton(driver, emailInformationButton);
    }

    public void clickCopyrightButton() {
        ElementHelper.clickButton(driver, copyrightButton);
    }
}
