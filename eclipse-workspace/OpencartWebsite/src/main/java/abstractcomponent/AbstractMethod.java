package abstractcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractMethod {
public WebDriver driver;


public void AbstractComponent(WebDriver driver) {
	this.driver=driver;
	
}

public void waitforElementToappear(By productsby) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
}

public void waitForElementtodisappear(WebElement ele) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
}
public void waitForWebElementToappear(WebElement errorMessage) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
}


}
