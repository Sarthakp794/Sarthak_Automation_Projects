package com.pages;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExtentReport;



public class Baseclass {
protected WebDriver driver;

@BeforeSuite
public void startReport() {
	ExtentReport.getReportInstance();	
}

@BeforeClass
public void Setup() {
String browser = "chrome";
if (browser.equalsIgnoreCase("chrome")) {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
}
else
if (browser.equalsIgnoreCase("Edge")) {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
}
else if (browser.equalsIgnoreCase("firefox")) {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://app.sleekbill.in/login"); // base URL
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
@AfterSuite
public void endReport() {
    ExtentReport.extent.flush();
}
}