package advantageonlineshop.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import pages.BaseClass;
@Test
public class Indexpage {

	public WebDriver driver;
	
	public Indexpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@id=\"menuUserLink\"]")
	WebElement userlogin;
	
	public void userloginclick() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", userlogin);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".PopUp")));
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(userlogin)).click();
		
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
	

}
