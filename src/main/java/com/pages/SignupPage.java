package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends Baseclass{
    public WebDriver driver;
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signup-username")
    private WebElement usernameField;

    @FindBy(id = "signup-email")
    private WebElement emailField;

    @FindBy(id = "signup-password")
    private WebElement passwordField;

    @FindBy(id = "signup-confirm-password")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signupButton;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSignup() {
        signupButton.click();
    }
}
