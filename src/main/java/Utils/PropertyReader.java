package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public static String getPropertyValue(String key) {
        Properties prop = new Properties();
        String value = null;

        try (FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/resources/config.properties")) {

            prop.load(fis);
            value = prop.getProperty(key);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }

}
