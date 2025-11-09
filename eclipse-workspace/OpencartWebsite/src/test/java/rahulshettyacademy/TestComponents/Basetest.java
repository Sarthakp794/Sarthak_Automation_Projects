package rahulshettyacademy.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class Basetest {
	public WebDriver driver;
	public LoginPage login;
	
	public WebDriver initiallizedriver() throws IOException {
	
	Properties prop = new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"C:\\Users\\MI\\eclipse-workspace\\OpencartWebsite\\src\\test\\java\\rahulshettyacademy\\properties\\Globaldata.properties");
	prop.load(fis);
	String browsername= prop.getProperty("chrome");
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	driver.manage().window().maximize();
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
		driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().window().maximize();
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().window().maximize();
	}
	return driver;
	}
@BeforeMethod
	public  LoginPage launchApplication()  throws IOException {
		
		driver= initiallizedriver();
	   login= new LoginPage(driver);
		login.goTo();
		return login;
	}
@AfterMethod
public void teardown() {
	driver.close();
}
}
