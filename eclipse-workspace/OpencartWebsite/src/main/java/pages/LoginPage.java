package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.pageobjects.ProductCatalogue;

public class LoginPage extends BaseClass{
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
		
		@FindBy(id="userEmail")
		WebElement Email;
		
		@FindBy(id="userPassword")
		WebElement Password;
		
		@FindBy(name="login")
		WebElement Loginbtn;
		
		@FindBy(css="[class*='flyInOut']")
		WebElement errorMessage;
		
		public  Productpage loginApplication(String email, String password)
		{
			Email.sendKeys(email);
			Password.sendKeys(password);
			Loginbtn.click();
			Productpage productCatalogue = new Productpage(driver);
			return productCatalogue;
			
		}
			public void getErrorMsg() {
				waitForWebElementToappear(errorMessage)
				errorMessage.getText();
			}	
			
		public void goTo() {
			 driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		}

}
