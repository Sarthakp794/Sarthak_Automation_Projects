package com.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	
	public class LoginPage extends Baseclass {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"element8-identification\"]")
	private WebElement username;
	
	@FindBy(id="element10-password")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()=\"Sign in\"]")
	private WebElement SigninButton;
	
	public void usrmethod(String Username) {
	username.sendKeys(Username);
	}
	public void passmethod(String password) {
	Password.sendKeys(password);
	}
	public void signin() {
	SigninButton.click();
	}
	}


