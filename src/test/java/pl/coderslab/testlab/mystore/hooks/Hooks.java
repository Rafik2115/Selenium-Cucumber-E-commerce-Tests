package pl.coderslab.testlab.mystore.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pl.coderslab.testlab.mystore.browserFactory.BrowserFactory;
import pl.coderslab.testlab.mystore.browserFactory.BrowserType;

public class Hooks {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driverThreadLocal.get();
    }

    @Before
    public void setUp(){
        driverThreadLocal.set(BrowserFactory.initializeDriver(BrowserType.CHROME));
    }

    @After
    public void tearDown(){
        if(driverThreadLocal.get() != null){
            driverThreadLocal.get().quit();
        }
    }
}
