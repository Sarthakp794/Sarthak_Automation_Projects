package advantageonlineshop.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPayment {
	
	private WebDriver driver;
    private WebDriverWait wait;

    public OrderPayment(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="next_btn")
     WebElement nextButton;
    
//    @FindBy(css=".edit ")
//	WebElement EditBtn;
//    
//    @FindBy(xpath="//input[contains(@name,'masterCredit')]")
//    WebElement masterCard;
//    
//    @FindBy(name="card_number")
//    WebElement cardNumber;
//    
//    @FindBy(name="cvv_number")
//    WebElement CVV;
//    
//    @FindBy(name="mmListbox")
//    WebElement  monthDropdown;
//    
//    @FindBy(name="yyyyListbox")
//    WebElement yearDropdown;
//    
//    @FindBy(name="cardholder_name")  
//    WebElement cardHoldername;
//
//    @FindBy(name="save_master_credit") 
//    WebElement saveMasterCreditcard;
//    
//    @FindBy(id="pay_now_btn_ManualPayment")
//    WebElement payNowButton;
//    
//    
    public void nextButton1() {
    	wait.until(ExpectedConditions.visibilityOf(nextButton)).click();
    	
    }
//    
//    public void editOption() {
//		EditBtn.click();
//	}
//    
//    public void selectMasterCard() {
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(masterCard));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        element.click();
//    }
//    
//    public void CardNumber(String number) {
//    	JavascriptExecutor js= (JavascriptExecutor) driver;
//    	js.executeScript("arguments[0]. scrollIntoView (true)");
//        wait.until(ExpectedConditions.visibilityOf(cardNumber)).clear();
//        cardNumber.sendKeys(number);
//    }
//    
//    public void cvv(String Cvv) {
//    	CVV.clear();
//    	wait.until(ExpectedConditions.visibilityOf(CVV)).sendKeys(Cvv);
//    }
//    
//    public void dateDropDown(String month) {
//    	Select select= new Select(monthDropdown);
//    	select.selectByValue(month);
//    //	wait.until(ExpectedConditions.visibilityOf(monthDropdown)).click();
//    }
//    
//    public void yearDropDown(String year) {
//    	Select select= new Select(yearDropdown);
//    	select.selectByValue(year);
//    //	wait.until(ExpectedConditions.visibilityOf(yearDropdown)).click();
//    }
//    
//    public void cardHolderName(String HolderName) {
//    	wait.until(ExpectedConditions.visibilityOf(cardHoldername)).sendKeys(HolderName);
//    }
//    
//    public void saveMasterCreditCard() {
//    	wait.until(ExpectedConditions.visibilityOf(saveMasterCreditcard)).click();
//    }
//    
//    public void paynowbutton() {
//    	wait.until(ExpectedConditions.visibilityOf(payNowButton)).click();
//    }

	@FindBy(id="pay_now_btn_MasterCredit")
	WebElement paynowButton;
	
	
	public void payNowbutton() {
		wait.until(ExpectedConditions.visibilityOf(paynowButton)).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.getTitle().contains("Thank_you_for_buying_with_Advantage");
	}
	}
   

