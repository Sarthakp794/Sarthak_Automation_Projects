
	package crm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {

		public WebDriver driver;
			    @BeforeTest
			    public void setUp() {
			        // Initialize only once
			        if (driver == null) {
			//           WebDriver.ChromeDriver().setup();
			            driver = new ChromeDriver();
			            driver.manage().window().maximize();
			        }
			   
	    }

	   	}