package crm.test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigure {
	Properties prop;

    public void ReadConfig() {
        String path = System.getProperty("user.dir") + "/src/main/java/configuration/GlobalData.properties";
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

