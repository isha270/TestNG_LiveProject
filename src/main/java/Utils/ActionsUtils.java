package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtils {

    private static Actions actions;

    /**
     * Moves to the given element (mouse hover).
     */
    public static void moveToElementActions(WebDriver driver, WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * Performs right-click (context click) on the given element.
     */
    public static void contextClickActions(WebDriver driver, WebElement element) {
        actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    /**
     * Performs drag and drop from source to destination.
     */
    public static void dragAndDropActions(WebDriver driver, WebElement srcElement, WebElement destElement) {
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement, destElement).perform();
    }
}

