package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public static int PAGE_LOAD_TIMEOUT = 20;
    public static int EXPLICIT_WAIT = 20;
    private static WebDriverWait wait;

    // Wait until element is clickable, then click
    public static void waitUntilElementToBeClickable(WebElement element, WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    // Wait until element is visible
    public static void waitUntilElementToBeVisible(WebElement element, WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}