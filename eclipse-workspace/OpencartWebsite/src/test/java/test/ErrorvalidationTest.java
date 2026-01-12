package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import pages.Cartpage;
import pages.LoginPage;
import pages.Productpage;
import rahulshettyacademy.TestComponents.Basetest;

public class ErrorvalidationTest extends Basetest{
	
	@Test
	public void Submitorder() {
		String Productname= "ADIDAS ORIGINAL";
		Productpage loginpage= login.loginApplication("sarthakp794@gmail.com","Sarthakp@123");
		Assert.assertEquals("Incorrect email or password.", login.getErrorMsg());
	}

	@Test
	
	public void checkOrderpagevalidation() {
		String Productname="ADIDAS ORIGINAL";
		Cartpage cart= login.loginApplication("sarthaWebElementl.com","Sarthak@123");
		List<WebElement> product= cart.verifyCartpage("ADIDAS ORIGINAL");
		cart.
		
		
		
	}
	

}
