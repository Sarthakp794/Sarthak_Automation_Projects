package advantageonlineshp.testclass;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
    public WebDriver driver;
    public WebDriver wait;
    public static Logger logger;
    ReadConfig readconfig = new ReadConfig();
    protected String url = readconfig.webSiteURL();
    String browser = readconfig.browserName();

    @BeforeMethod
    public void setUp() {
        logger = LogManager.getLogger("E-Commerce");

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browser);
                   
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.manage().window().maximize();
        driver.get(url);
        logger.info("URL opened: " + url);
    }

    @AfterMethod
    public void teardown() {
         if (driver != null) {
        
            logger.info("Browser closed");
        }
    }
    public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}
     	

    }
