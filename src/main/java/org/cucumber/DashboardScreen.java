package org.cucumber;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumMethods;

public class DashboardScreen extends SeleniumMethods {
	
	public void checkDashboard() {
		try {
			if(locateElement("choose-insurance-type-dropdown").isDisplayed()) {
				reportStep("User is able to login to application successfully","PASS",false);
			} else {
				reportStep("User is unable to login to application","FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}
	
	public void logout() {
		click(locateElement("dropdownMenu1"));
		click(locateElement("xpath","(//ul[@class='dropdown-menu']/li/a)[2]"));
	}
	
	public void verifyLogout() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(locateElement("xpath","(//a[@data-target='#login-popup'])[2]")));
			if(locateElement("xpath","(//a[@data-target='#login-popup'])[2]").isDisplayed()) {
				reportStep("User successfully logs out of the application","PASS",false);
			} else {
				reportStep("User is unable to logout of the application","FAIL");
			}
		} catch (WebDriverException e) {
			reportStep("WebDriverException : "+e.getMessage(), "FAIL");
		} 
	}

}
