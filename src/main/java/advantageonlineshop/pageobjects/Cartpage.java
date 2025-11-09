package advantageonlineshop.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
public WebDriver driver;
	
	public Cartpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="menuCart")
	WebElement cartOption;
	
	@FindBy(id="checkOutPopUp")
	WebElement checkOutpopup;
	
	@FindBy(id="usernameInOrderPayment")
	WebElement usernameInorderpage;
	
	@FindBy(id="passwordInOrderPayment")
	WebElement passWordInorderpage;
	
	@FindBy(id="login_btn")
	WebElement loginButton;
	
	public void cartOption() {
		cartOption.click();
	}
	
	public void checkOutpopup() {
		checkOutpopup.click();
	}
	
	public void usrnameInorderPayment() {
		usernameInorderpage.click();
	}
	
	public void passInorderpayment() {
		passWordInorderpage.click();
	}
	
	public void loginButton() {
		loginButton.click();
		System.out.println(driver.getCurrentUrl());
	}
	}
