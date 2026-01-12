package crm.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pages.Loginpage;

public class TestData extends Baseclass {

    @Test
    public void validLoginTest() {
    	driver.get("https://ui.freecrm.com");

    	Loginpage loginPage = new Loginpage(driver);
    	loginPage.Username("sarthakp794@gmail.com");
    	loginPage.Password("Sarthakp@123");
    	loginPage.clickLogin();

    }
}
		
	



