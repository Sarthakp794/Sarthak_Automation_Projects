package TestClass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ClientsPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import utils.TestUtils;

public class ClientsPageTest extends com.pages.Baseclass{
	
	HomePage homepage;
    LoginPage loginpage;
	TestUtils testutils;
	ClientsPage clientspage;
    
	public ClientsPageTest() {
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
	    clientspage=homepage.clickClients();
	}
	
	@Test(priority = 1)
	public void verifyClientsPageTitle() {
		String expectedTitle = "Clients / Customers | Sleek Bill";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Clients Page Title Test Failed: Title does not match");
		System.out.println("Clients Page Title: " + actualTitle);
	}

	@Test(priority = 2)
	public void verifyFilterText() {
	    Assert.assertTrue(clientspage.verifyFilterText(), "Filter Text Test Failed: Filter text is not displayed");
	    System.out.println("Filter Text is displayed successfully.");
	}
	
	@Test(enabled = false)
	public void clickOnClientCheckboxTest() {
	    String clientName = "Ajay Sales"; 
	    clientspage.clickOnClientCheckbox(clientName);
	    System.out.println("Clicked on checkbox for client: " + clientName);
	}
	
	@Test(priority = 3)
	public void clickOnNewClientButtonTest() {
	    clientspage.newClientButton();
	}
}
