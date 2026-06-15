package com.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	
	public class LoginPage extends Baseclass {
	public WebDriver driver;
	

	@FindBy(xpath="//input[@type=\"email\"]")
	private WebElement Username;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()=\"Sign in\"]")
	private WebElement SigninButton;
	
	@FindBy(xpath="//a[text()=\"Sleek Bill\"]")
	private WebElement SleekBillLogo;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean SleekBillLogoDisplayed() {
		return SleekBillLogo.isDisplayed();
	}
	
	public HomePage login(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		SigninButton.click();
		String expectedTitle = "Dashboard - Sleek Bill";
		
		return new HomePage(driver);
		
	}
	}


