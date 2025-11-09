package advantageonlineshop.pageobjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ConfirmationPage {

	 @FindBy(xpath = "//span[contains(.,'Thank you for buying with Advantage')]")
	    WebElement confirmationMessage;
	
	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getConfirmationMessage()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(confirmationMessage));
		return confirmationMessage.getText();
	}
	
	
}
