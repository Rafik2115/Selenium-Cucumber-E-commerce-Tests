package pl.coderslab.testlab.mystore.browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserFactory {

    public static WebDriver initializeDriver(BrowserType browserType){
        WebDriver driver = switch (browserType) {
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
            case EDGE -> new EdgeDriver();
            case SAFARI -> {
                if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                    throw new WebDriverException("Safari is only supported on macOS.");
                }
                yield new SafariDriver();
            }
            default -> throw new WebDriverException("-> error: Browser name not found! Cannot initialize browser driver");
        };
        setUpDriver(driver);
        return driver;
    }
    private static void setUpDriver(WebDriver driver){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
