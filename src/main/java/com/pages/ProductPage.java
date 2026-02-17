 package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Baseclass {
    public WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[text()=\"Items\"]")
    private WebElement itemsMenu;
    
    @FindBy(xpath="(//a[text()=\"New\"])[2]")
    private WebElement newProductButton;

    @FindBy(xpath = "//label[text()=\"Name\"]/following-sibling::input")
    private WebElement nameInput;


    @FindBy(xpath = "//label[text()=\"Opening Quantity\"]/following-sibling::input")
    private WebElement openingQuantityInput;

    @FindBy(xpath = "//label[text()='Unit']/following-sibling::div//div[contains(@class,'ember-power-select-trigger')]")
    private WebElement unitDropdownTrigger;
    
    @FindBy(xpath = "//ul[contains(@class,'ember-power-select-options')]//li[contains(@class,'ember-power-select-option')]")
    private java.util.List<WebElement> unitOptions;

 
    @FindBy(xpath = "//label[text()=\"HSN\"]/following-sibling::input")
    private WebElement hsnInput;

    // Sales Info
   @FindBy(xpath = "//label[text()='Unit Price']/following-sibling::input[@id='element537-salePrice']")
    private WebElement salesUnitPriceInput;



    @FindBy(xpath = "//button[@type='submit' and contains(text(),'Save')]")
    private WebElement saveButton;


    // Action methods
    public void item() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(itemsMenu)).click();
    			itemsMenu.click();
    }
    public void newProduct() {
		newProductButton.click();
	}
    
    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterOpeningQuantity(String qty) {
        openingQuantityInput.clear();
        openingQuantityInput.sendKeys(qty);
    }
    public void selectUnitByText(String unitText) {
        unitDropdownTrigger.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(unitOptions));
        for (WebElement option : unitOptions) {
            if (option.getText().trim().equalsIgnoreCase(unitText.trim())) {
                option.click();
                return;
            }
        }
    }

    public void enterHSN(String hsn) {
        hsnInput.clear();
        hsnInput.sendKeys(hsn);
    }
    
    public void SaveButton() {
    			saveButton.click();
    }
}
