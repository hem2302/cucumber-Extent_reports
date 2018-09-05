package org.cucumber;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumMethods;

public class LoginScreen extends SeleniumMethods{
	
	public void launchBrowser(String browser) {
		startApp(browser);
	}

	public void passURL(String URL) {
		passUrl(URL);
	}
	
	public void clickLogin() {
		click(locateElement("xpath", "(//a[@data-target='#login-popup'])[2]"));
	}
	
	public void clickLoginButton() {
		click(locateElement("btnLogin"));
	}
	
	public void clickEN() {		
		click(locateElement("xpath","(//a[text()[contains(.,'EN')]])[1]"));
	}
	
	public void verifyTranslationtoEnglish() {
		try {
			if(locateElement("xpath","(//a[text()[contains(.,'Log in')]])[2]").isDisplayed()) {
				reportStep("Page has been translated to English","PASS",false);
			} else {
				reportStep("Page is not getting translated to English","FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}
	
	public void verifyArabic() {
		try {
			if(locateElement("xpath","(//a[text()[contains(.,'شامل')]])[2]").isDisplayed()) {
				reportStep("Page is in arabic","PASS",false);
			} else {
				reportStep("Page is not in arabic","FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		}
	}
	
	public void enterUserNameAndPassword(String uname, String pwd){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(locateElement("id", "login-email")));
		type(locateElement("id", "login-email"), uname);
		type(locateElement("id", "login-password"), pwd);
	}
}
