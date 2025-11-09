package advantageonlineshop.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrationpage {
	public WebDriver driver;
	
	public Registrationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="menuUser")
	WebElement menuuser;
	
	@FindBy(xpath="//a[@class=\"create-new-account ng-scope\"]")
	WebElement createNewAccount;
	
//	@FindBy(id="registration_btn")
//	WebElement registrationButton;
	
	@FindBy(name="usernameRegisterPage")
	WebElement username;
	
	 @FindBy(name="emailRegisterPage")
	WebElement email;
	 
	 @FindBy(name="passwordRegisterPage")
		WebElement password;
	 
	 @FindBy(name="confirm_passwordRegisterPage")
		WebElement confirmPassword;
	
	@FindBy(name="first_nameRegisterPage")
	WebElement firstName;
	
	@FindBy(name="last_nameRegisterPage")
	WebElement lastName;
	
	@FindBy(name="phone_numberRegisterPage")
	WebElement phoneNumber;

	@FindBy(name="countryListboxRegisterPage")
	WebElement countryList;
	
	@FindBy(name="cityRegisterPage")
	WebElement city;
	
	@FindBy(name="addressRegisterPage")
	WebElement address;
	
	@FindBy(name="state_/_province_/_regionRegisterPage")
	 WebElement state;
	
	@FindBy(name="postal_codeRegisterPage")
	WebElement postCode;
	
	@FindBy(name="i_agree")
	WebElement checkBox;
	
	@FindBy(id="register_btn")
	WebElement regsiter;
	
	public void Menu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(menuuser)).click();
		
	}
	
	public void createnewAccPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(createNewAccount)).click();
	}
	
	public void userName(String Username) {
		username.sendKeys(Username);
	}
	
	public void Email(String Email) {
		email.sendKeys(Email);
	}
	
	public void password(String Password) {
		password.sendKeys(Password);
	}
	
	public void confirmPassword(String confirmpassword) {
		confirmPassword.sendKeys(confirmpassword);
	}
	
	 public void firstname(String firstname) {
		firstName.sendKeys(firstname);
	 }
	 public void lastName(String lastname) {
		lastName.sendKeys(lastname);
	 }
	    public void phoneNumber(String phoneNum) {
		phoneNumber.sendKeys(phoneNum);
	    }
	    public void country(String Country) {
		countryList.sendKeys(Country);
	    }
			public void city(String City) {
		city.sendKeys(City);
			}  
			
			public void address(String Address) {
		address.sendKeys(Address);
			}
			
			public void state(String text) {
				Select states= new Select(state);
	         states.selectByContainsVisibleText(text);
			}
			public void postCode(String pincode) {
		postCode.sendKeys(pincode);
			}
			public void checkbox() {
		checkBox.click();
			}
			
			public void regsiterButton() {
		regsiter.click();	
		
		System.out.println(driver.getCurrentUrl());
	}
}
