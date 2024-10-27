package pl.coderslab.testlab.mystore.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static pl.coderslab.testlab.mystore.helpers.SeleniumHelper.waitForElementVisible;

public class ElementHelper {
    public static void fillInput(WebDriver driver, WebElement element, String text){
        waitForElementVisible(driver,element, 5);
        element.clear();
        element.sendKeys(text);
    }
    public static void fillInputWithJavaScript(WebDriver driver, WebElement element, String text) {
        waitForElementVisible(driver, element, 5);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='';", element);
        js.executeScript("arguments[0].value=arguments[1];", element, text);
    }
    public static void clickButton(WebDriver driver, WebElement element){
        waitForElementVisible(driver,element, 5);
        element.click();
    }
    public static void clickButton(WebDriver driver, WebElement element,String text){
        waitForElementVisible(driver,element, 5);
        element.click();
    }

    public static String getText(WebDriver driver, WebElement element) {
        waitForElementVisible(driver,element, 5);
        return element.getText().strip();
    }
    public static void clickSelect(WebDriver driver,WebElement element, String text){
        waitForElementVisible(driver,element, 5);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}
