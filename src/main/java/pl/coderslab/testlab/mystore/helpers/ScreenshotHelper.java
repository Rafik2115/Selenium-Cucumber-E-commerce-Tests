package pl.coderslab.testlab.mystore.helpers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenshotHelper {
    public static void takeScreenshot(WebDriver driver, String filePath, String fileNamePrefix) {
        try {
            String timestamp = String.valueOf(System.currentTimeMillis());
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String fullPath = Paths.get(filePath, fileNamePrefix + "_" + timestamp + ".png").toString();
            File destination = new File(fullPath);
            Files.copy(screenshot.toPath(), destination.toPath());
            System.out.println("Screenshot saved as " + destination.getAbsolutePath());
        } catch (
                IOException e) {
            throw new RuntimeException("Failed to take a screenshot"  + e.getMessage(), e);
        }
    }
}
