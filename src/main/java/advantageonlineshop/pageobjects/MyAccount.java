package advantageonlineshop.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount {

    private WebDriver driver;
    private WebDriverWait wait;
    

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    
    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(id = "sign_in_btn")
    private WebElement signInButton;

    @FindBy(id = "laptopsTxt")
    private WebElement laptopText;

    @FindBy(xpath = "//a[contains(text(),'Bose Soundlink Bluetooth Speaker')]")
    private WebElement boseSpeakerLink;

    public void enterUsername(String email) {
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(email);
    }

    public void enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);
    }

    public void clickSignInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public void isSpeakerImageDisplayed() {
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.PopUp")));

    	// Wait for the element to be clickable
    	WebElement speakers = wait.until(ExpectedConditions.elementToBeClickable(By.id("speakersTxt")));
          speakers.click();
    	// Scroll and click
    	
    }

    public Productpage clickBoseSpeaker() {
        wait.until(ExpectedConditions.elementToBeClickable(boseSpeakerLink)).click();
        return new Productpage(driver);
    }
    }

