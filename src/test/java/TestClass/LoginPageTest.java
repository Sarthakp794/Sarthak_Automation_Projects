package TestClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.ClientsPage;
import com.pages.LoginPage;
import com.pages.ProductPage;

import utils.ExtentReport;
public class LoginPageTest extends com.pages.Baseclass {

public LoginPageTest() {
	
	super();
	
}
@BeforeClass
	public void setup() {
		Setup();
		LoginPage loginpage = new LoginPage(driver);
	}
	
@Test(priority = 1)
	public void loginPageTitleTest() {
		LoginPage loginpage = new LoginPage(driver);
		String expectedTitle = "Sign in | Sleek Bill";
		String actualTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Login Page Title Test Failed: Title does not match");
	}


@Test(priority = 2)
public void sleekBillLogoTest() {
	LoginPage loginpage = new LoginPage(driver);
	boolean isLogoDisplayed = loginpage.SleekBillLogoDisplayed();
	Assert.assertTrue(isLogoDisplayed, "Sleek Bill Logo Test Failed: Logo is not displayed");
}

	@Test(priority = 3)
	public void loginTest() {
		LoginPage loginpage = new LoginPage(driver);
		 loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
}
