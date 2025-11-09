package advantageonlineshp.testclass;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties prop;

    public ReadConfig() {
        String path = System.getProperty("user.dir") + "/src/test/java/advantageonlineshop/resources/Globaldata.properties";
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace(); // Optional: Replace with logger.error(...)
            throw new RuntimeException("Failed to load Globaldata.properties", e);
        }
    }

    public String webSiteURL() {
        return prop.getProperty("baseurl");
    }

    public String browserName() {
        return prop.getProperty("browser");
    }
}
