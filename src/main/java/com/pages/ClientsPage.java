package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage extends com.pages.Baseclass {
	public WebDriver driver;
	
	
	
@FindBy(xpath="//a[text()=\"Filter Clients / Customers\"]")
WebElement FilterText;

@FindBy(xpath="(//a[contains(text(),\"New\")])[3]")
WebElement NewClientButton;


public ClientsPage(WebDriver driver) {
this.driver= driver;
PageFactory.initElements(driver, this);
}

public String verifyClientsPageTitle() {
	return driver.getTitle();
}

public boolean verifyFilterText() {
	return FilterText.isDisplayed();
}

public void clickOnClientCheckbox(String clientName) {
	WebElement checkbox = driver.findElement(By.xpath("//div[text()=\"0TestAdvancePayment\"]//parent::td[@class=\"client-company-name title\"]//preceding-sibling::td//div//input[@type=\"checkbox\"]//following-sibling::span[text()=\"Select\"]"));
	checkbox.click();
}

public void newClientButton() {
	NewClientButton.click();
}
}