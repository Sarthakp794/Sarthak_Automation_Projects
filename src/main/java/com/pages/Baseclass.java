package com.pages;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExtentReport;
import utils.TestUtils;

public class Baseclass {
public static WebDriver driver;
public static Properties prop;

 
@BeforeSuite
public void setupReport() {
	
	prop= new Properties();
	try {
		FileInputStream fis= new FileInputStream("C:\\Users\\MI\\eclipse-workspace\\SleekBill\\src\\main\\java\\com\\resources\\config.properties");
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

public void Setup() {
	
	String browser = prop.getProperty("browser");
	if("chrome".equalsIgnoreCase(browser)) {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
}
else
	if("Edge".equalsIgnoreCase(browser)) { 
WebDriverManager.edgedriver().setup();
driver= new EdgeDriver();
}
	if("Firefox".equalsIgnoreCase(browser)) { 
WebDriverManager.firefoxdriver().setup();
driver= new FirefoxDriver();
}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
System.out.println(prop.getProperty("url"));
driver.get(prop.getProperty("url")); // base URL
}

@AfterClass
public void tearDown() {
    driver.quit();
}


@AfterMethod
public void takescreenshot() {
TakesScreenshot ts= (TakesScreenshot)driver;
File Source= ts.getScreenshotAs(OutputType.FILE);
{
String path= "C:\\Users\\MI\\eclipse-workspace\\SleekBill\\Screenshots\\screenshot.png";
File destination= new File("Screenshot.png");
try {
FileUtils.copyFile(Source, destination);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}



}
}
}