package com.advantageonlineshop.testcases;

import org.testng.annotations.Test;

import advantageonlineshop.pageobjects.Registrationpage;
import advantageonlineshp.testclass.Baseclass;

public class TC_MyAccountTestPage extends Baseclass{

	@Test
	public void Registrationpage() {
		Registrationpage register= new Registrationpage(driver);
		register.Menu();
		register.createnewAccPage();
		register.userName("pawar_sarthak");
		register.Email("pawarsarthak480@gmail.com");
		register.password("Pawar@123");
		register.confirmPassword("Pawar@123");
		register.firstname("Sarthu");
		register.lastName("Pawar");
		register.phoneNumber("9876564326");
		register.country("india");
		register.city("Pune");
		register.address("kalyani nagar");
		register.state("Maharashtra");
		register.postCode("444709");
		register.checkbox();
		register.regsiterButton();
		
	}
	
	
}
