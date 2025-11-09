package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	
	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	@FindBy(css=".cartSection h3")
	private List<WebElement> cartproduct;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean verifyCartpage(String productname) {
		boolean match= cartproduct.stream().anyMatch(product-> product.getText().equals("ADIDAS ORIGINAL"));
	return match;
}
	
	public goToCheckoutpage() {
		checkoutEle.click();
		return  Checkoutpage(driver);
	}
}
	
