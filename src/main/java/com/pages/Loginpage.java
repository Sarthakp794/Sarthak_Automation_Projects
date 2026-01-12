package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
		
		public WebDriver driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		public Loginpage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
		
		
		@FindBy(name="email")
		WebElement emailaddress;
		
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(xpath="//*[@class=\"ui fluid large blue submit button\"]")
		WebElement LoginButton;
		
		
		
		public void Username(String user) {
	        wait.until(ExpectedConditions.visibilityOf(emailaddress));
	        emailaddress.sendKeys(user);
	    }

	    public void Password(String pass) {
	        Password.sendKeys(pass);
	    }

	    public void clickLogin() {
	        LoginButton.click();
	    }
	}
		
		
		
		
		
		
		


