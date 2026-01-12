package test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;

import pages.Cartpage;
import pages.LoginPage;
import pages.Productpage;
import rahulshettyacademy.TestComponents.Basetest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class SubmitorderTest extends Basetest{
	
	String Productname="Adidas";
	LoginPage loginpage= launchApplication();
	Productpage productCatalogue = Loginpage("sarthakp794@gmail.com","sarthak@123");
	
	
	List<WebElement> products = productCatalogue.getProductList();
	productCatalogue.addProductToCart(input.get("product"));
	CartPage cartPage = productCatalogue.goToCartPage();

	Boolean match = Cartpage.VerifyProductDisplay(Input.get("product"));
	Assert.assertTrue(match);
	CheckoutPage checkoutPage = Cartpage.goToCheckout();
	checkoutPage.selectCountry("india");
	ConfirmationPage confirmationPage = checkoutPage.submitOrder();
	String confirmMessage = confirmationPage.getConfirmationMessage();
	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	
	
	

}
