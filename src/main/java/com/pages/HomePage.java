package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
        @FindBy(xpath="//a[contains(text(),\"Sleek Bill\")]")	
        private WebElement profileName;
		
		@FindBy(xpath="//a[contains(text(),\"Clients / Customers\")]")
		private WebElement clientsPage;
		
		@FindBy(xpath="//a[contains(text(),\"Items\")]")
		private WebElement itemsPage;
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public String verifyTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyProfileName() {
			return profileName.isDisplayed();
			
		}
		
		public ClientsPage clickClients() {
			clientsPage.click();
			return new ClientsPage(driver);
		}
		
		public ProductPage clickItems() {
			itemsPage.click();
			return new ProductPage(driver);
		}
		
		
		
		
		
	}
	

