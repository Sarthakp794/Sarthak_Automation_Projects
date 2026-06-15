package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebEventListener extends com.pages.Baseclass implements WebDriverListener {

	public void beforeAlertAccept(WebDriver driver) {
		// Code to execute before accepting an alert
	}

	
	public void afterAlertAccept(WebDriver driver) {
		// Code to execute after accepting an alert
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// Code to execute before dismissing an alert
	}


	public void afterAlertDismiss(WebDriver driver) {
		// Code to execute after dismissing an alert
	}


	public void beforeNavigateTo(String url, WebDriver driver) {
		// Code to execute before navigating to a URL
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// Code to execute after navigating to a URL
	}

	
	public void beforeNavigateBack(WebDriver driver) {
		// Code to execute before navigating back
	}


	public void afterNavigateBack(WebDriver driver) {
		// Code to execute after navigating back
	}


	public void beforeNavigateForward(WebDriver driver) {
		// Code to execute before navigating forward
	}


	public void afterNavigateForward(WebDriver driver) {
		// Code to execute after navigating forward
	}
}
