package com.advantageonlineshop.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import advantageonlineshop.pageobjects.MyAccount;
import advantageonlineshop.pageobjects.OrderPayment;
import advantageonlineshop.pageobjects.Productpage;
import advantageonlineshop.pageobjects.Registrationpage;
import advantageonlineshop.pageobjects.Cartpage;
import advantageonlineshop.pageobjects.ConfirmationPage;
import advantageonlineshop.pageobjects.Indexpage;
import advantageonlineshp.testclass.Baseclass;

public class TC_SubmitOrder extends Baseclass {

	

	    @Test(priority=0)
	    public void testSearchAndAddProductToCart() throws IOException, InterruptedException {

	    	String searchKey = "Bose Soundlink Bluetooth Speaker";
	    	
	    	
	    	driver.get(url);
			logger.info("url is opened");
		
	    	Indexpage indpg= new Indexpage(driver);
			indpg.userloginclick();
			
			MyAccount myacc= new MyAccount(driver);
			myacc.enterUsername("sarthak_p");
			myacc.enterPassword("Sarthakp@123");
			myacc.clickSignInButton();
			myacc.isSpeakerImageDisplayed();
			myacc.clickBoseSpeaker(); 
	     
			
			Productpage product = new Productpage(driver);
     	    product.getSearchResultProductName();

		    Assert.assertTrue(true);
		product.increaseQuantity();
		product.addtoCart();
		product.checkoutPopup();
		
		
//		Cartpage cart= new Cartpage(driver);
//		cart.cartOption();
//		cart.checkOutpopup();
//		cart.usrnameInorderPayment();
//		cart.passInorderpayment();
//		cart.loginButton();

		
		
		OrderPayment order= new OrderPayment(driver);
		
		order.nextButton1();
//		order.editOption();
//		order.selectMasterCard();;
//		order.saveMasterCreditCard();
//		order.CardNumber("600173090579");
//		order.cvv("088");
//		order.dateDropDown("7");
//		order.yearDropDown("2030");
//		order.cardHolderName("Sarthak Pawar");
//		order.saveMasterCreditCard();
//		order.paynowbutton();
			order.payNowbutton();
		 
			ConfirmationPage CF = new ConfirmationPage(driver);
			String confirmMessage = CF.getConfirmationMessage();
			System.out.println("Confirmation message: " + confirmMessage);

			Assert.assertTrue(confirmMessage.contains("Thank you for buying with Advantage"), 
			                  "Order confirmation message not displayed as expected.");

			String title = driver.getTitle();
			System.out.println("Page title after order: " + title);
			Assert.assertTrue(title.contains("Thank you for buying with Advantage") || title.contains("Confirmation"),
			                  "Unexpected page title after purchase.");

		
}
}