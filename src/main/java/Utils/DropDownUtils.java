package Utils;

import customeException.InvalidDropdownSelection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtils {
    public static void dropDownBy(WebElement element, String option, String value) {
        Select select = new Select(element);

        if (option.equalsIgnoreCase("value")) {
            select.selectByValue(value);
        } else if (option.equalsIgnoreCase("visible")) {
            select.selectByVisibleText(value);
        } else {
            throw new InvalidDropdownSelection("Invalid dropdown selection type: '" + option
                            + "'. Please use either 'value' or 'visible'."
            );
        }
    }
    public static void dropDownBy(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }
}

