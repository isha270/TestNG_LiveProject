package TestBase;

import customeException.InvalidBrowserSelection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utils.PropertyReader;

public class WebTestBase {

    public static WebDriver driver;

    public static void initialization() {
        String browserName = PropertyReader.getPropertyValue("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        } else {
            throw new InvalidBrowserSelection("Please select correct browser name");
        }

        driver.manage().window().maximize();
        driver.get(PropertyReader.getPropertyValue("url"));
        driver.manage().deleteAllCookies();
    }
}
