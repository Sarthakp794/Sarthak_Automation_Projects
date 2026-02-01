package com.pages;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClientsPage {
public WebDriver driver;
public ClientsPage(WebDriver driver) {
this.driver= driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[contains(text(),'Clients')]")
WebElement ClientButton;

@FindBy(xpath="(//a[text()='New'])[2]")
WebElement addClientBtn;

@FindBy(xpath="//label[text()=\"GSTIN\"]/following-sibling::input")
WebElement GSTINField;

@FindBy(xpath="//button[text()=\"Fetch\"]")
WebElement FetchButton;

@FindBy(xpath="//button[text()=\"Save\"]")
WebElement SaveButton;

public void clientbuton() {
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(ClientButton)).click();
WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(addClientBtn));

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);window.scrollBy(0, -120);", btn
);
btn.click();
}
public void GSTINFieleddmethod(String num) {
	
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement gstfieldbtn = wait.until(ExpectedConditions.elementToBeClickable(GSTINField));

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);window.scrollBy(0, 120);", gstfieldbtn);
gstfieldbtn.sendKeys(num);
wait.until(ExpectedConditions.elementToBeClickable(FetchButton)).click();

System.out.println("Displayed: " + SaveButton.isDisplayed());
System.out.println("Enabled: " + SaveButton.isEnabled());

WebElement saveButton= wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
js.executeScript("arguments[0].scrollIntoView(true);window.scrollBy(0, 200);", saveButton);

Actions actions = new Actions(driver);
actions.moveToElement(saveButton).pause(Duration.ofMillis(300)).click().perform();

}
}