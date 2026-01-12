package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Democartpage {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.findElement(By.id("userEmail")).sendKeys("sarthakp794@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Sarthakp@123");
		driver.findElement(By.name("login")).click();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod= (WebElement) products.stream().filter(product-> 
		product.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
		 if (prod != null) {
	            prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	            System.out.println("Product added to cart.");
	        } else {
	            System.out.println("Product not found!");
	        }

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));

			driver.findElement(By.cssSelector("[routerlink*=\"cart\"]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cartSection button:first-of-type")));
			driver.findElement(By.cssSelector(".cartSection button:first-of-type")).click();

			WebElement countryInput = driver.findElement(By.cssSelector("[placeholder='Select Country']"));
			countryInput.sendKeys("British Indian Ocean Territory");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
			driver.findElement(By.xpath("//button[contains(@class,\"ta-item\")][1]")).click();

			driver.findElement(By.cssSelector(".action__submit")).click();

			// Wait for confirmation
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hero-primary")));
			String confirmationMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
			System.out.println("Order Confirmation: " + confirmationMessage);

			driver.quit();
		}
	}

