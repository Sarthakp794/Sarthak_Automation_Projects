package advantageonlineshop.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class Productpage {
	
public WebDriver driver;
	
	public Productpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[contains(text(), 'Bose Soundlink Bluetooth Speaker')]")
	WebElement searchResultProduct;
	
	@FindBy(css=".plus")
	WebElement increaseQuantity;
	
	@FindBy(name="save_to_cart")
	WebElement addToCart;
	
	@FindBy(id="checkOutPopUp")
	WebElement checkoutButton;
	
	
	public void getSearchResultProductName()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(searchResultProduct)).click();
	}
	
	public void increaseQuantity() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(increaseQuantity)).click();
	}
		public void addtoCart() {
			addToCart.click();
			System.out.println(driver.getCurrentUrl());
		}
		public void checkoutPopup() {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
			
		}
	}


		

