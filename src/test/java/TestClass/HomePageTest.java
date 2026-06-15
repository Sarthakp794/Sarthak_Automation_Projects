package TestClass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.ClientsPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import utils.TestUtils;

public class HomePageTest extends com.pages.Baseclass{ 
	HomePage homepage;
    LoginPage loginpage;
	TestUtils testutils;
	ClientsPage clientspage;
    
	public HomePageTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		Setup();
		testutils = new TestUtils();
		loginpage = new LoginPage(driver);

	    homepage = loginpage.login(
	            prop.getProperty("username"),
	            prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitle() {
		String expectedTitle = "Sign in | Sleek Bill";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home Page Title Test Failed: Title does not match");
		System.out.println("Home Page Title: " + actualTitle);
	}
	
	@Test(priority = 2)
	public void verifyUserProfileName() {
	    Assert.assertTrue(homepage.verifyProfileName(), "User Profile Name Test Failed: Profile name is not displayed");
	    System.out.println("User Profile Name is displayed successfully.");    
	}
	
	@Test(priority = 3)
	public void verifyClientsPageNavigation() {
	    clientspage=homepage.clickClients();
	    System.out.println("Navigated to Clients Page successfully.");
	
	}
}
